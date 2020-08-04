n = int(input())
c = ','.join(input()).split(',')

ans = 0

ri = -1

if c.count('W') == 0:
    print(0)
    exit()

if c.count('R') == 0:
    print(0)
    exit()

for i in range(n):
    if c[i] == 'W':
        while c[ri] != 'R':
            ri -= 1
        
        if n < i-ri:
            break
        
        c[i], c[ri] = 'R', 'W'
        ans += 1
    
print(ans)