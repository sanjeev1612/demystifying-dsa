package revise.arrays;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i <nums.length-1 ;i++){
            if(nums[i] == nums[i+1]){
                for(int j= i;j < nums.length-i-1;j++){
                    nums[j]=nums[j+1];
                    count++;
                }
            }
        }
    return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,3}));
    }
}