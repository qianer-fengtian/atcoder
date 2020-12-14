import math

n = int(input())

primes = []

for i in range(2, int(math.sqrt(n+1))):
    for j in range(2, int(math.sqrt(i))):
        if i % j == 0:
            break
    else:
        primes.append(i)
        
print(primes)