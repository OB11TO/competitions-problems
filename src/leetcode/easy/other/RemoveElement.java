package leetcode.easy.other;


/**
 * Подсказки
 * Попробуйте использовать два указателя.
 * Вы использовали тот факт, что порядок элементов может быть изменен?
 * Что происходит, когда удаляемые элементы встречаются редко?
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));

        System.out.println();

        for (int i : nums) {
            System.out.println(i);
        }
    }


    /**
     * Когда n u m s[j] nums[j] n u m s[j] равно заданному значению, пропустите этот элемент, увеличив j j j .
     * Пока n u m s [j]≠v a l nums[j] \neq val n u m s [j]
     * 
     * = v a l, мы копируем n u m s [j] nums [j] n u m s[j] в n u m s[я] числю [i] n u m s [i] и
     * увеличиваю оба индекса одновременно. Повторяйте процесс до тех пор, пока j j j не достигнет конца массива,
     * а новая длина будет равна i i i.
     * <p>
     *     <p>
     *     https://leetcode.com/problems/remove-element/solutions/127824/remove-element/
     * </p>
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
