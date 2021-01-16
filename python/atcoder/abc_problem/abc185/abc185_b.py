def resolve(n, m, t, cafes):
    max_n = n
    last = 0
    for cafe in cafes:
        n -= cafe[0] - last
        if n <= 0:
            return "No"

        n = min(n + cafe[1] - cafe[0], max_n)

        last = cafe[1]

    return "Yes" if n - t + last > 0 else "No"

if __name__ == '__main__':
    n, m, t = map(int, input().split())
    cafes = [list(map(int, input().split())) for _ in range(m)]
    print(resolve(n, m, t, cafes))
