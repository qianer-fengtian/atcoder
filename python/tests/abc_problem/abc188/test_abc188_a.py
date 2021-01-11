import unittest
from atcoder.abc_problem.abc188.abc188_a import resolve

class TestABC188A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(3, 5), "Yes")
        self.assertEqual(resolve(16, 2), "No")
        self.assertEqual(resolve(12, 15), "No")
        self.assertEqual(resolve(2, 4), "Yes")
        self.assertEqual(resolve(2, 5), "No")
        self.assertEqual(resolve(4, 2), "Yes")
        self.assertEqual(resolve(5, 2), "No")
