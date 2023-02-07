/**
 * 문제 설명
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 중복된 원소는 없습니다.
 * 1 ≤ emergency의 길이 ≤ 10
 * 1 ≤ emergency의 원소 ≤ 100
 */
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = new int[emergency.length];
        int temp = 0;

        for(int i = 0; i < emergency.length; i++) {
            copy[i] = emergency[i];
        }
        Map<Integer, Integer> emergencyRankMap = new HashMap<>();
        for(int i = 0; i < copy.length; i++) {
            for(int j = 1; j < copy.length - i; j++) {
                if(copy[j - 1] > copy[j]) {
                    temp = copy[j - 1];
                    copy[j - 1] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        for(int i = copy.length -1; i >= 0; i--) {
            emergencyRankMap.put(copy[i], copy.length - i);
        }
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = emergencyRankMap.get(emergency[i]);
        }
        return answer;
    }
}