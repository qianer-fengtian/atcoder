from math import ceil

# xoxoo

def resolve(n, m, a):
    if len(a) == 0:
        return 1

    l = [0, *a, n+1]

    l.sort()

    diffs = []

    for i in range(len(l) - 1):
        diffs.append(abs(l[i+1] - l[i] - 1))

    if max(diffs) == 0:
        return 0

    hanko = min(filter(lambda x: x != 0, diffs))

    cnt = 0

    for diff in diffs:
        cnt += ceil(diff / hanko)

    return cnt

if __name__ == '__main__':
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    print(resolve(n, m, a))
