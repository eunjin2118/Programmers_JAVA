package p1845;

public class Solution {
	 public int solution(int[] nums) {
	        int[] p = new int[200001];
	        int cnt = 0;
	        for (int num : nums){
	        	if(p[num] == 0) {
	        		p[num] = 1;
	        		++cnt;
	        	}
	        }
	        
	        if(cnt > nums.length/2)
	        	return nums.length/2;
	        else return cnt;
	    }
}