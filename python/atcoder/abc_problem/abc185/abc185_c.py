from math import factorial

def npk(n, k):
    return factorial(n) // factorial(n-k)

def nck(n, k):
    return npk(n, k) // npk(k, k)

def resolve(l):
    return nck(l-1, 11)

if __name__ == '__main__':
    l = int(input())
    print(resolve(l))
