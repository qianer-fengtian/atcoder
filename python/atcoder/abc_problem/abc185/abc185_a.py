def resolve(a, b, c, d):
    return min(a, b, c, d)

if __name__ == '__main__':
    a, b, c, d = map(int, input().split())
    print(resolve(a, b, c, d))