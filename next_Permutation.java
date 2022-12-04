import java.util.*;

public class next_Permutation {
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        int n = nums.length - 1, inf = 0;
        for (int i = n; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                inf = i;
                break;
            }
        }
        if (inf == 0) {
            Arrays.sort(nums);
        } else {
            int min = 999999;
            int swap = nums[inf - 1];
            for (int i = inf; i <= n; i++) {
                if (nums[i] - swap > 0 && nums[i] - swap < min) {
                    int temp = nums[i];
                    nums[i] = nums[inf - 1];
                    nums[inf - 1] = temp;
                }
            }
            Arrays.sort(nums, inf, n);
        }
    }
}
