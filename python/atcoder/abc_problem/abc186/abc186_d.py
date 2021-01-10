def resolve(a_l):
    a_l.sort()
    ans = 0
    used = 0
    for i in range(1, len(a_l)):
        used += a_l[i-1]
        ans += (i * a_l[i]) - used
    return ans

if __name__ == '__main__':
    n = int(input())
    a_l = list(map(int, input().split()))
    print(resolve(a_l))
