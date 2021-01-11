def resolve(a, b):
    return "Yes" if min(a, b) + 3 > max(a, b) else "No"

if __name__ == '__main__':
    a, b = map(int, input().split())
    print(resolve(a, b))