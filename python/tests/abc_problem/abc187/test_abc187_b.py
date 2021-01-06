import unittest
from atcoder.abc_problem.abc187.abc187_b import resolve

class TestABC187B(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve([0, 0], [1, 2], [2, 1]), 2)
        self.assertEqual(resolve([-691, 273]), 0)
        self.assertEqual(resolve(
            [-31,-35],
            [8,-36],
            [22,64],
            [5,73],
            [-14,8],
            [18,-58],
            [-41,-85],
            [1,-88],
            [-21,-85],
            [-11,82]
        ), 11)
