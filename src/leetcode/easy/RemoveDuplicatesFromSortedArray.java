package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5};
        System.out.println(removeDuplicates(nums));

        System.out.println();

        for (int num : nums) {
            System.out.println(num);
        }
    }

    /*
    Алгоритм:
    Сортировка гарантированна
    Два указателя - insertNums / i
    [1,1,2,3,4,5]
    insertNums = 1;
    i = 1;
    Должны проверять i / i -1
    Если разные, то arr[insertNums] = arr[i] ;  insertNums++;
     */
    public static int removeDuplicates(int[] nums) {
        int insertNums = 1;
        for(int i = 1; i < nums.length; i++) {
//            System.out.println(nums[i]);
            if(nums[i-1] != nums[i]) {
                nums[insertNums] = nums[i];
                insertNums++;
            }

        }
        return insertNums;
    }
}
