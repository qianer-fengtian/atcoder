import unittest
from atcoder.abc_problem.abc183.abc183_c import resolve

class TestABC183C(unittest.TestCase):
    def test01(self):
        N = 4
        K = 330
        T = [
            [0,1,10,100],
            [1,0,20,200],
            [10,20,0,300],
            [100,200,300,0]
        ]
        actual = resolve(N, K, T)
        expected = 2
        self.assertAlmostEqual(actual, expected)

    def test02(self):
        N = 5
        K = 5
        T = [
            [0,1,1,1,1],
            [1,0,1,1,1],
            [1,1,0,1,1],
            [1,1,1,0,1],
            [1,1,1,1,0],
        ]
        actual = resolve(N, K, T)
        expected = 24
        self.assertAlmostEqual(actual, expected)
