/**
 *문제 설명
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 *
 * 제한사항
 * 0 < array의 길이 < 100
 * 0 ≤ array의 원소 < 1000
 */
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxValue = -1;
        int preMaxKey = -1;

        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int number : array) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            }
            else {
                countMap.put(number, 1);
            }
        }

        for(Integer key : countMap.keySet()){
            if(maxValue < countMap.get(key)){
                maxValue = countMap.get(key);
                answer = key;
            }
            else if (maxValue==countMap.get(key)){
                preMaxKey = key;
            }
        }
        if(countMap.get(answer) == countMap.get(preMaxKey)){
            answer= -1;
            return answer;
        }
        return answer;
    }
}