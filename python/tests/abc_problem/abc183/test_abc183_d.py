import unittest
from atcoder.abc_problem.abc183.abc183_d import resolve

class TestABC183D(unittest.TestCase):
    def test01(self):
        N = 4
        W = 10
        S = [1, 2, 3, 2]
        T = [3, 4, 10, 4]
        P = [5, 4, 6, 1]
        actual = resolve(N, W, S, T, P)
        expected = "No"
        self.assertEqual(actual, expected)

    def test02(self):
        N = 4
        W = 10
        S = [1, 2, 3, 2]
        T = [3, 4, 10, 3]
        P = [5, 4, 6, 1]
        actual = resolve(N, W, S, T, P)
        expected = "Yes"
        self.assertEqual(actual, expected)

    def test03(self):
        N = 6
        W = 1000000000
        S = [0, 2, 20, 200, 2000, 20000]
        T = [200000, 20, 200, 2000, 20000, 200000]
        P = [999999999, 1, 1, 1, 1, 1]
        actual = resolve(N, W, S, T, P)
        expected = "Yes"
        self.assertEqual(actual, expected)

    def test04(self):
        N = 3
        W = 3
        S = [1, 2, 4]
        T = [2, 4, 5]
        P = [2, 2, 2]
        actual = resolve(N, W, S, T, P)
        expected = "Yes"
        self.assertEqual(actual, expected)

    def test05(self):
        N = 4
        W = 9
        S = [1, 4, 5, 6]
        T = [2, 5, 8, 7]
        P = [3, 9, 3, 6]
        actual = resolve(N, W, S, T, P)
        expected = "Yes"
        self.assertEqual(actual, expected)

    def test06(self):
        N = 3
        W = 10000
        S = [1, 2, 4222, 10000]
        T = [10000, 4218, 6534, 10000]
        P = [5000, 4999, 3892, 5001]
        actual = resolve(N, W, S, T, P)
        expected = "Yes"
        self.assertEqual(actual, expected)

    def test07(self):
        N = 2
        W = 3
        S = [3, 1]
        T = [5, 4]
        P = [2, 2]
        actual = resolve(N, W, S, T, P)
        expected = "No"
        self.assertEqual(actual, expected)
