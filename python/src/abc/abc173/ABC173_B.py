import collections

n = int(input())
c = collections.Counter([input() for i in range(n)])
print("AC x", c["AC"])
print("WA x", c["WA"])
print("TLE x", c["TLE"])
print("RE x", c["RE"])