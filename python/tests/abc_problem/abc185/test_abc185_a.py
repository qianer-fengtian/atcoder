import unittest
from atcoder.abc_problem.abc185.abc185_a import resolve

class TestABC185A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(5, 3, 7, 11), 3)
        self.assertEqual(resolve(100, 100, 1, 100), 1)
