import unittest
from atcoder.abc_problem.abc187.abc187_a import resolve

class TestABC187A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(123, 234), 9)
        self.assertEqual(resolve(593, 953), 17)
        self.assertEqual(resolve(100, 999), 27)
