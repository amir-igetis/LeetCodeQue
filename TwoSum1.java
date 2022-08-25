import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum1 {
    private static final int[] ArrayList = null;
    public static void main(String[] args){
        int[] arr = {1,3,6,5,9,12,13};
        int target = 21;
        System.out.println(solution(arr, target));
    }
    static int[] solution(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + ArrayList[right] == target){
                return new int[] {arr[left], arr[right]};
            }else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return arr;
    }
}
