def resolve(N):
    s = str(N)
    l = len(str(N))

    if int(s) % 3 == 0:
        return 0

    cnt = 10**18

    for bit in range(1 << l):
        p = ""

        for i in range(l):
            if bit & (1<<i):
                p += s[i]

        if len(p) == 0:
            continue

        if int(p) % 3 ==0:
            cnt = min(cnt, l-bin(bit).count("1"))

    if cnt == 0 or cnt == 10**18:
        return -1

    return cnt

if __name__ == '__main__':
    N = int(input())
    print(resolve(N))
