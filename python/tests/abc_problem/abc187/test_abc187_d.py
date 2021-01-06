import unittest
from atcoder.abc_problem.abc187.abc187_d import resolve

class TestABC187D(unittest.TestCase):
    def test_case_01(self):
        actual = resolve((2, 1), (2, 2), (5, 1), (1, 3))
        expected = 1
        self.assertEqual(actual, expected)

    def test_case_02(self):
        actual = resolve((2, 1), (2, 1), (2, 1), (2, 1), (2, 1))
        expected = 3
        self.assertEqual(actual, expected)

    def test_case_03(self):
        actual = resolve((273, 691))
        expected = 1
        self.assertEqual(actual, expected)

    def test_case_04(self):
        actual = resolve((2, 1), (2, 2), (1, 4), (1, 3))
        expected = 2
        self.assertEqual(actual, expected)

