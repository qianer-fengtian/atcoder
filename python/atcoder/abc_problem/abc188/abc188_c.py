def resolve(n, a):
    players = list([a[i], i+1, False] for i in range(len(a)))
    sp = -1
    for i in range(1, n+1):
        for j in range(1, 2**(n-i)+1):
            p1 = players[2*j-2]
            p2 = players[2*j-1]
            if p1[0] < p2[0]:
                sp = p1[1]
                p1[2] = True
            else:
                sp = p2[1]
                p2[2] = True
        players = list(filter(lambda x: not x[2], players))
    return sp

if __name__ == '__main__':
    n = int(input())
    a = list(map(int, input().split()))
    print(resolve(n, a))
