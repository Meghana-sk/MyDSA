import java.util.Arrays;
public class MergeSortedArrays {
    public static void main(String[] args){
        int []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int []nums2 = {2,5,6};
        int n = 3;
        int firstArrayLength = m - 1, secondArrayLength = n - 1;
        int combinedlength = nums1.length - 1;
        while(combinedlength >= 0){
            if(secondArrayLength < 0) break;
            else if(firstArrayLength >= 0 && nums1[firstArrayLength] >= nums2[secondArrayLength]){
                nums1[combinedlength] = nums1[firstArrayLength];
                combinedlength--;
                firstArrayLength--;
            } else {
                nums1[combinedlength] = nums2[secondArrayLength];
                combinedlength--;
                secondArrayLength--;
            }
        }
        for(int x: nums1){
            System.out.println(x);
        }
    }
}