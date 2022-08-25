public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        System.out.println(maxWater(arr));
    }

    static int maxWater(int[] arr){ // leetcode 11
        // https://leetcode.com/problems/container-with-most-water/
        int start = 0;
        int end = arr.length - 1;
        int area = 0;
        while(end>start){ // if I take start > end it is not working, why
            int startHeight = arr[start];
            int endHeight = arr[end];
            int minHeight = Math.min(startHeight, endHeight);
            int length = end - start;
            int newArea = minHeight * length;
            area = Math.max(newArea, area);
            if (endHeight>=startHeight) {
                start++;
            }else{
                end--;
            }
        }
        return area;
    }   
}
