import unittest
from atcoder.abc_problem.abc185.abc185_b import resolve

class TestABC185B(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(10, 2, 20, [[9, 11], [13, 17]]), "Yes")
        self.assertEqual(resolve(10, 2, 20, [[9, 11], [13, 16]]), "No")
        self.assertEqual(resolve(15, 3, 30, [[5, 8], [15, 17], [24, 27]]), "Yes")
        self.assertEqual(resolve(20, 1, 30, [[20, 29]]), "No")
        self.assertEqual(resolve(20, 1, 30, [[1, 10]]), "No")
