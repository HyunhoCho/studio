import unittest
from brightics.function.clustering.kmeans import kmeans_train_predict, \
    kmeans_predict, kmeans_silhouette_train_predict
from brightics.common.datasets import load_iris


class KMeansTest(unittest.TestCase):
    
    def test_kmeans_groupby1(self):
        df = load_iris()
        train_out = kmeans_train_predict(df, input_cols=['sepal_length', 'sepal_width', 'petal_length', 'petal_width'], group_by=['species'])
        predict_out = kmeans_predict(df, train_out['model'])
        print(predict_out['out_table'])
        
    def test_kmeans_silhouette_groupby1(self):
        df = load_iris()
        train_out = kmeans_silhouette_train_predict(df, input_cols=['sepal_length', 'sepal_width', 'petal_length', 'petal_width'], group_by=['species'])
        predict_out = kmeans_predict(df, train_out['model'])
        print(predict_out['out_table'])
