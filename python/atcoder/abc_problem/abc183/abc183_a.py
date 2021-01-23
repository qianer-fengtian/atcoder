def resolve(x):
    return x if x >= 0 else 0

if __name__ == '__main__':
    x = int(input())
    print(resolve(x))
