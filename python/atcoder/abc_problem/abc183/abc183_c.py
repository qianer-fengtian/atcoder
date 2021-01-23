import itertools

def resolve(N, K, T):
    perms = list(itertools.permutations(list(range(1,N))))
    perms = list(map(lambda x: [0, *x, 0], perms))
    cnt = 0
    for perm in perms:
        total = sum([T[perm[i]][perm[i+1]] for i in range(len(perm)-1)])
        if total == K:
            cnt += 1
    return cnt

if __name__ == '__main__':
    N, K = map(int, input().split())
    T = list(list(map(int, input().split())) for _ in range(N))
    print(resolve(N, K, T))
