package revise.arrays;

public class RotatedSortedArray {

  public static int search(int[] nums, int target) {
    int low =0;
    int high =nums.length-1;

    while(high >=low) {
      int mid =(low+high)/2;

      if(target == nums[mid])
        return mid;
      if(nums[low] <= nums[mid]) {
        // left part is sorted
        if(target >= nums[low] && target < nums[mid])
          high= mid-1;
        else
          low= mid+1;
      }
      else {
        // right part is sorted
        if(target > nums[mid] && target <= nums[high])
          low =mid+1;
        else
          high=mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[]{4,5,6,7,8,1,2,3},1));
  }
}
