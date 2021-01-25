import unittest
from atcoder.abc_problem.abc182.abc182_a import resolve

class TestABC182A(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(200, 300), 200)
        self.assertEqual(resolve(10000, 0), 20100)
