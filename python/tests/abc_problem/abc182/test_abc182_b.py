import unittest
from atcoder.abc_problem.abc182.abc182_b import resolve

class TestABC182B(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(3, [3, 12, 7]), 3)
        self.assertEqual(resolve(5, [8, 9, 18, 90, 72]), 9)
        self.assertEqual(resolve(5, [1000, 1000, 1000, 1000, 1000]), 1000)
