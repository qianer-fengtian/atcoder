def resolve(N, A):
    mp = {}

    for x in A:
        for i in range(2, x+1):
            if x % i == 0:
                if i not in mp:
                    mp[i] = 0
                mp[i] += 1

    return sorted(mp.items(), key=lambda x: x[1]).pop()[0]

if __name__ == '__main__':
    N = int(input())
    A = map(int, input().split())
    print(resolve(N, A))
