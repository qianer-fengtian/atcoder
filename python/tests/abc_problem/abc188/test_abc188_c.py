import unittest
from atcoder.abc_problem.abc188.abc188_c import resolve

class TestABC188C(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(2, [1, 4, 2, 5]), 2)
        self.assertEqual(resolve(2, [3, 1, 5, 4]), 1)
        self.assertEqual(resolve(4, [6, 13, 12, 5, 3, 7, 10, 11, 16, 9, 8, 15, 2, 1, 14, 4]), 2)
