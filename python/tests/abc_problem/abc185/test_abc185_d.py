import unittest
from atcoder.abc_problem.abc185.abc185_d import resolve

class TestABC185D(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(5, 2, [1, 3]), 3)
        self.assertEqual(resolve(13, 3, [13, 3, 9]), 6)
        self.assertEqual(resolve(5, 5, [5, 2, 1, 4, 3]), 0)
        self.assertEqual(resolve(1, 0, []), 1)
