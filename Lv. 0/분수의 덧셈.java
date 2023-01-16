/**
 * 문제 설명
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 */
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd=0;
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = denom1 * denom2;
        int maxNum = 0;
        if(answer[0] > answer[1]) {
            maxNum = answer[0];
        }
        else {
            maxNum = answer[1];
        }

        for(int i=1; i<= maxNum; i++) {
            if(answer[0]%i == 0 && answer[1]%i == 0) {
                gcd = i;
            }
        }
        answer[0] = answer[0]/gcd;
        answer[1] = answer[1]/gcd;
        return answer;
    }
}