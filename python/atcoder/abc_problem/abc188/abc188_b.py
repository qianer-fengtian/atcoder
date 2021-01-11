def resolve(n, a, b):
    ip = 0
    for i in range(n):
        ip += a[i]*b[i]
    return "Yes" if ip == 0 else "No"

if __name__ == '__main__':
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    print(resolve(n, a, b))
