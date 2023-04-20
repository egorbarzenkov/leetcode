package MergeSortedArray88;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        main.merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }

//        int[] nums1 = {2,0};
//        int[] nums2 = {1};
//        main.merge(nums1, 1, nums2, 1);
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.print(nums1[i]);
//        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }
        int j = m-1;
        int k = n-1;
        for (int i = nums1.length -1; i >= 0; i--) {
            if (k >= 0&& j>=0 && nums1[j] > nums2[k]) {
                nums1[i] = nums1[j];
                j--;
            } else if (k >= 0){
                nums1[i] = nums2[k];
                k--;
            }
        }

    }
}
