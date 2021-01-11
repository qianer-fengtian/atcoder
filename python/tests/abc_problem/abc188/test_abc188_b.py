import unittest
from atcoder.abc_problem.abc188.abc188_b import resolve

class TestABC188B(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(2, [-3, 6], [4, 2]), "Yes")
        self.assertEqual(resolve(2, [4, 5], [-1, -3]), "No")
        self.assertEqual(resolve(3, [1, 3, 5], [3, -6, 3]), "Yes")
