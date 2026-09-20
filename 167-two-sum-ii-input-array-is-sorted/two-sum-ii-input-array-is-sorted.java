class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=numbers.length;
        int i=0;
        int j=l-1;
        int sum;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int[] {i+1 , j+1};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return null;
        
    }
}