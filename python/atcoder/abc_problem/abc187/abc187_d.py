def resolve(*v_list):
    cnt = 0
    l = sorted([2 * v[0] + v[1] for v in v_list], reverse=True)
    x = -sum([v[0] for v in v_list])
    for n in l:
        cnt += 1
        x += n
        if x > 0:
            break
    return cnt

if __name__ == '__main__':
    n = int(input())
    v_list = [tuple(map(int, input().split())) for _ in range(n)]
    print(resolve(*v_list))
