package P12922;

class Solution {
    public String solution(int n) {
        String answer = "";
       
        	/*for(int i = 0; i<n; i++) {
        		if(i%2==0) answer += "��";
        		else answer += "��";
        	}*/
        for(int i = 0; i<n; i++)
        	answer += i%2 == 0 ? "��" : "��";
        return answer;
    }
}