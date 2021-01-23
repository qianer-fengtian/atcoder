import unittest
from atcoder.abc_problem.abc183.abc183_a import resolve

class TestABC183A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(1), 1)
        self.assertEqual(resolve(1), 1)
        self.assertEqual(resolve(-1), 0)
