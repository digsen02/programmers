class Solution {
    public double solution(int[] num) {
        double answer = 0;
        double a=0;
        for (int i = 0; i < num.length; i++){
          a += num[i]; 
         answer = (a/(i+1));
         
        }
        return answer;
    }
}