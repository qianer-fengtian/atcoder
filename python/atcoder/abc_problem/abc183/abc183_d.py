def resolve(N, W, S, T, P):
    use = {}
    limit = -1
    for i in range(N):
        if S[i] not in use:
            use[S[i]] = [0, 0]
        if T[i] not in use:
            use[T[i]] = [0, 0]
        use[S[i]][0] += P[i]
        use[T[i]][1] -= P[i]
        limit = max(limit, S[i], T[i])
    used = 0
    for i in range(limit):
        if i in use:
            used += use[i][1]
            used = max(0, used)
            used += use[i][0]
        if used > W:
            return "No"

    return "Yes"

if __name__ == "__main__":
    N, W = map(int, input().split())
    S = []
    T = []
    P = []
    for i in range(N):
        s, t, p = map(int, input().split())
        S.append(s)
        T.append(t)
        P.append(p)

    print(resolve(N, W, S, T, P))
