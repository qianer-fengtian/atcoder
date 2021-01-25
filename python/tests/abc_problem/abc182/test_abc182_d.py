import unittest
from atcoder.abc_problem.abc182.abc182_d import resolve

class TestABC182D(unittest.TestCase):
    def test01(self):
        actual = resolve(3, [2, -1, -2])
        expected = 5
        self.assertEqual(actual, expected)

    def test02(self):
        actual = resolve(5, [-2, 1, 3, -1, -1])
        expected = 2
        self.assertEqual(actual, expected)

    def test03(self):
        actual = resolve(5, [-1000, -1000, -1000, -1000, -1000])
        expected = 0
        self.assertEqual(actual, expected)
