def resolve(N, A):
    s = [0 for _ in range(N+1)]
    m = [0 for _ in range(N+1)]

    for i in range(N):
        s[i+1] = A[i] + s[i]
        m[i+1] = max(m[i], s[i+1])

    ans = 0
    curr = 0

    for i in range(N):
        ans = max(ans, curr + m[i+1])
        curr += A[i] + s[i]

    return ans

if __name__ == '__main__':
    N = int(input())
    A = list(map(int, input().split()))
    print(resolve(N, A))

