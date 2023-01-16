/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 100
 */
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n / 2 + 1] ;
        int index = 0;
        if(n % 2 == 0) {
            answer = new int[n/2];
        }

        for(int i =0; i <=100; i++) {
            if(i % 2 != 0 && i <= n) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}