import unittest
from atcoder.abc_problem.abc186.abc186_c import resolve

class TestABC186C(unittest.TestCase):
    def test_resolve(self):
        self.assertEqual(resolve(20), 17)
        self.assertEqual(resolve(100000), 30555)
        
