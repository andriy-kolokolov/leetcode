public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) { // start from second
            if (nums[i] != nums[i - 1]) { // check previous
                nums[pointer] = nums[i];  // set unique num by pointer
                pointer++; // move pointer to next idx
            }
        }
        return pointer;
    }
}
