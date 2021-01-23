from math import floor

def resolve(sx, sy, gx, gy):
    return sy/(gy+sy)*(gx-sx)+sx

if __name__ == '__main__':
    sx, sy, gx, gy = map(int, input().split())
    print(resolve(sx, sy, gx, gy))
