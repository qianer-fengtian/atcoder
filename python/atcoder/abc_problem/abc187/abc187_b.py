def resolve(*points):
    cnt = 0
    
    for i in range(len(points)):
        for j in range(len(points[i+1:])):
            pa = points[i]
            pb = points[i+j+1]
            slope = (pb[1] - pa[1]) / (pb[0] - pa[0])
            if -1 <= slope <= 1:
                cnt += 1
    return cnt

if __name__ == '__main__':
    n = int(input())
    points = [list(map(int, input().split())) for _ in range(n)]
    print(resolve(*points))
