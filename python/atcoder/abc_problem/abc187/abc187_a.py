def resolve(a, b):
    sum_a = sum(map(int, list(str(a))))
    sum_b = sum(map(int, list(str(b))))
    return max(sum_a, sum_b)

if __name__ == '__main__':
    a, b = map(int, input().split())
    print(resolve(a, b))