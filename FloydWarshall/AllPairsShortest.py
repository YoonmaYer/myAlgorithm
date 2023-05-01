import sys

INF = sys.maxsize

def Floyd_Warshall():
    dist = [[INF]*n for i in range(n)] #최단 경로를 담는 배열

    for i in range(n): #최단 경로를 담는 배열 초기화
        for j in range(n):
            dist[i][j] = D[i][j]

    for k in range(n): # 거치는 점
        for i in range(n): # 시작점
            for j in range(n): # 끝점
                # k를 거쳤을 때의 경로가 더 적은 경로
                if dist[i][j] > dist[i][k] + dist[k][j]:
                    dist[i][j] = dist[i][k] + dist[k][j]

    return dist

n = 4 # 정점 수

D=[
[0,5,INF,8],
[7,0,9,INF],
[2,INF,0,4],
[INF,INF,3,0]
]

dist = Floyd_Warshall()



for i in range(n):
    print('[', end='')
    for j in range(n):
        if dist[i][j] == INF:
            print('INF', end='')
        else:
            print(dist[i][j], end='')
        if j != len(dist[i])-1:
            print(',', end=' ')
    if i != len(dist)-1:
        print('],')
    else:
        print(']')