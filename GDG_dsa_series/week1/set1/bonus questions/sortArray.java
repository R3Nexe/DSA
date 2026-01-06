public class sortArray {
    public static int[] sortArray(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return nums;
        }
        int mididx = len / 2;
        int[] lefthalf = new int[mididx];
        int[] righthalf = new int[len - mididx];
        for(int i = 0; i < lefthalf.length; i++) {
            lefthalf[i] = nums[i];
        }
        for (int i = mididx; i < nums.length; i++) {
            righthalf[i - mididx] = nums[i];
        }
        sortArray(lefthalf);
        sortArray(righthalf);
        merge(nums, lefthalf, righthalf);
        return nums;
    }
    static void merge(int[] nums, int[] lefthalf, int[] righthalf) {
        int leftlen = lefthalf.length;
        int rightlen = righthalf.length;
        int i = 0, j = 0, k = 0;
        while (i < leftlen && j < rightlen) {
            if (lefthalf[i] <= righthalf[j]) {
                nums[k] = lefthalf[i];
                i++;
            } else {
                nums[k] = righthalf[j];
                j++;
            }
            k++;
        }
        while (i < leftlen) {
            nums[k] = lefthalf[i];
            i++;
            k++;
        }
        while (j < rightlen) {
            nums[k] = righthalf[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int num[]= {5,2,3,1};
        num=sortArray(num);
        for (int i : num) {
            System.out.print(i+", ");
        }
    }
}
