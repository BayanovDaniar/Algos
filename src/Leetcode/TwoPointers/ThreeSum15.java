package Leetcode.TwoPointers;

import java.util.*;

public class ThreeSum15 {

    public static void main(String[] args) {
        List<List<Integer>> listList = threeSum2(new int[]{-2, 0, 1, 1, 2});
        for (List<Integer> list : listList) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) return answer;


        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > 0) {
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    int lastLowOccurrence = nums[low];
                    int lastHighOccurrence = nums[high];

                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }

                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        return answer;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lists = new HashSet<>();
        int target = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] < target) {
                    left++;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                }
            }
        }

        return new ArrayList<>(lists);
    }
}

