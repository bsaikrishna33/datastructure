package arrays;

import java.util.Arrays;

public class MajorityElement {

  public int majorityElement(int[] nums) {

    int len = nums.length;

    Arrays.sort(nums);
    for (int i = 0; i <= len / 2; i++) {

      if (nums[i] == nums[i + len / 2]) {
        return nums[i];
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    MajorityElement obj = new MajorityElement();
    int[] nums = { 3, 2, 3 };
    System.out.println(obj.majorityElement(nums));
  }
}
