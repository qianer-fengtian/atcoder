def resolve(A, B):
    return 2 * A + 100 - B

if __name__ == '__main__':
    A, B = map(int, input().split())
    print(resolve(A, B))
