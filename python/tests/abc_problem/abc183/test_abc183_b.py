import unittest
from atcoder.abc_problem.abc183.abc183_b import resolve

class TestABC183B(unittest.TestCase):
    def test_resolve(self):
        self.assertAlmostEqual(resolve(1, 1, 7, 2), 3.0000000000)
        self.assertAlmostEqual(resolve(1, 1, 3, 2), 1.6666666667)
        self.assertAlmostEqual(resolve(-9, 99, -999, 9999), -18.7058823529)
