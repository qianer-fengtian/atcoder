import unittest
from atcoder.abc_problem.abc187.abc187_c import resolve

class TestABC187C(unittest.TestCase):
    def test_case_01(self):
        actual = resolve(['a', '!a', 'b', '!c', 'd', '!d'])
        expected = ['a', 'd']
        self.assertIn(actual, expected)

    def test_case_02(self):
        actual = resolve([
            'red',
            'red',
            'red',
            '!orange',
            'yellow',
            '!blue',
            'cyan',
            '!green',
            'brown',
            '!gray',
        ])
        expected = 'satisfiable'
        self.assertEqual(actual, expected)
