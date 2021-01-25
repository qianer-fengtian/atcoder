import unittest
from atcoder.abc_problem.abc182.abc182_c import resolve

class TestABC182C(unittest.TestCase):
    def test01(self):
        actual = resolve(35)
        expected = 1
        self.assertEqual(actual, expected)

    def test02(self):
        actual = resolve(369)
        expected = 0
        self.assertEqual(actual, expected)

    def test03(self):
        actual = resolve(6227384)
        expected = 1
        self.assertEqual(actual, expected)

    def test04(self):
        actual = resolve(11)
        expected = -1
        self.assertEqual(actual, expected)
