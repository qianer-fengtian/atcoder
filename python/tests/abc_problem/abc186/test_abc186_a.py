import unittest
from atcoder.abc_problem.abc186.abc186_a import resolve

class TestABC186A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(10, 3), 3)
        self.assertEqual(resolve(1000, 1), 1000)
