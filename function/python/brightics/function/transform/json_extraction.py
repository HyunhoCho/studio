from brightics.common.groupby import _function_by_group
from brightics.common.groupby import _flatten as groupby_flatten
from brightics.common.utils import check_required_parameters

import json
import pandas as pd
import numpy

def _key(prev_key, sep, new_key):
    if prev_key is None:
        return new_key
    else:
        return "{prev_key}{sep}{new_key}".format(prev_key=prev_key, sep=sep, new_key=new_key)
    

def _flattenable(obj):
    try:
        json.dumps(obj)
    except:
        return False
    
    return True


def _flatten(obj, key=None, flattened_dict=None, sep='__'):
    if flattened_dict is None:
        flattened_dict = dict()
    if isinstance(obj, dict):
        for obj_key in obj:
            if not obj_key.startswith('_'):
                _flatten(obj[obj_key], _key(key, sep, obj_key), flattened_dict)
    elif isinstance(obj, set) or isinstance(obj, numpy.ndarray) or isinstance(obj, tuple):
        flattened_dict[key] = list(obj)
    elif _flattenable(obj):
        flattened_dict[key] = obj
    return flattened_dict


def flatten_json(model, **params):
    check_required_parameters(_flatten_json, params, ['model'])
    if '_grouped_data' in model:
        return _function_by_group(_flatten_json, model=model, **params)
    else:
        return _flatten_json(model=model, **params)      
    
    
def _flatten_json(model, sep='__'):
    result = pd.DataFrame.from_dict([_flatten(model, sep=sep)])
    if result.empty:
        raise Exception('There is nothing to flatten.')
    return {'table': result}

def get_element_from_dict(d, key_list):
    if not isinstance(d, dict):
        raise Exception('not a dictionary.')
    
    for key in key_list:
        try:
            d = d[key]
        except Exception as e:
            print(e)
    
    return d


def get_table(model, **params):
    check_required_parameters(_get_table, params, ['model'])
    if '_grouped_data' in model:
        return _function_by_group(_get_table, model=model, **params)
    else:
        return _get_table(model=model, **params)    


def _get_table(model, key_list, index_column=False, index_column_name='index'):
    table = get_element_from_dict(model, key_list)
    if not isinstance(table, pd.DataFrame):
        raise Exception('item is not a DataFrame.')
    if index_column:
        table.insert(0, index_column_name, table.index)
    return {'table': table}

