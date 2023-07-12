#https://www.acmicpc.net/problem/27294

#아침 = 11시 이하, 점심 = 12이상 16이하, 나머지 저녁

#soju가 1이면 술과 함께, 0이면 술 없이 초밥만

# 밥알갯수 280개 = 아침, 저녁, 술을 마실때
# 밥알갯수 320개 = 점심이면서 술과 같이 먹지 않을 때
# 함수로 접근해보자

time, soju = map(int,input().split())

if time >= 12 and time <= 16 and soju == 0:
    print('320')
else:
    print('280')
