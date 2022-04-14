import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        long right = n * (long)times[times.length-1];
       
        answer = right;
        while(left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for(int i = 0; i < times.length; i++) {
                sum += mid / times[i];
                
                if(sum >= n) {
                    break;
                }
            }
            
            if(sum < n) {
                left = mid+1;
            } else {
                right = mid-1;
                answer = mid;
            }
        }      
        return answer;
    }
}