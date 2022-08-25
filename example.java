public class example {
    public static void main(String[] args) {
        int[] height = {3, 1, 2, 4, 5};
        System.out.println(maxArea(height));
    }


        static int maxArea(int[] height) {
            int l=0, r=height.length-1;
            int ans=0;
            while(l<r){
                int area= Math.min(height[l],height[r])*(r-l);
                ans=Math.max(ans,area);
                if(height[l]<=height[r]){
                    l++;
                }
                else{
                    r--;
                }
            }
            return ans;
        }
    
}
