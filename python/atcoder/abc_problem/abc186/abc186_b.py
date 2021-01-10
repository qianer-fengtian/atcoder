def resolve(*blocks):
    min_v = min(sum(blocks, []))
    return sum([sum([0 if w == min_v else w - min_v for w in h]) for h in blocks])

if __name__ == '__main__':
    h, w = map(int, input().split())
    blocks = [list(map(int, input().split())) for _ in range(h)]
    print(resolve(*blocks))