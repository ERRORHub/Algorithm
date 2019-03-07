package Base;

/**
 * @ClassName: BinarySearch
 * @Description: 二分查找
 * @Author: wangwenjie
 * @Date: 2019/3/7 14:42
 * @Version V1.0
 */
public class BinarySearch {
    public static void main(String arg[]) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,0};
        System.out.println(find(a,89));
    }

    /**
     * 条件：数组必须保持有序状态
     * 实现流程：初始化数组左值lo右值hi，循环比较key与数组中值直到lo > hi,
     * 循环体内首先初始化中值，公式：mid = lo+(hi-lo)/2
     * 当key小于中值时将mid-1赋给hi
     * 当key大于中值时将mid+1赋给lo
     */
    public static boolean find(int[] a,int key){
        int hi = a.length - 1;
        int lo = 0;
        while (lo <= hi) {
            int mid =lo + (hi - lo)/2;
            if (key < a[mid]) {
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
