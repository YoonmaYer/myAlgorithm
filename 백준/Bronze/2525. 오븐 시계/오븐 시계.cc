#include <iostream>

using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;  // 현재 시간 (A, B), 조리 시간 C 입력

    int total_minutes = B + C;  // 총 분 계산
    int added_hours = total_minutes / 60;  // 추가되는 시간
    int final_minutes = total_minutes % 60;  // 최종 분

    int final_hours = (A + added_hours) % 24;  // 24시간 형식 유지

    cout << final_hours << " " << final_minutes << endl;
    return 0;
}
