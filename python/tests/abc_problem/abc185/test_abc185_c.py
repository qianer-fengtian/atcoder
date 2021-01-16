import unittest
from atcoder.abc_problem.abc185.abc185_c import resolve

class TestABC185C(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(12), 1)
        self.assertEqual(resolve(13), 12)
        self.assertEqual(resolve(17), 4368)
