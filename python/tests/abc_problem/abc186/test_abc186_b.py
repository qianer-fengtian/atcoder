import unittest
from atcoder.abc_problem.abc186.abc186_b import resolve

class TestABC186B(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve([2,2,3],[3,2,2]), 2)
        self.assertEqual(resolve([99,99,99],[99,0,99],[99,99,99]), 792)
        self.assertEqual(resolve([4,4],[4,4],[4,4]), 0)
        self.assertEqual(resolve([1,9],[4,2],[2,1]), 13)
