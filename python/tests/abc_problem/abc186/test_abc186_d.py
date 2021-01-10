import unittest
from atcoder.abc_problem.abc186.abc186_d import resolve

class TestABC186D(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve([5, 1, 2]), 8)
        self.assertEqual(resolve([31, 41, 59, 26, 53]), 176)
