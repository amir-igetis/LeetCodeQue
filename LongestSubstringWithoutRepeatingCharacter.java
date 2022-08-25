import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<Character>seen = new HashSet<>();
        int max = 0;

        while(right<s.length()){
            char c = s.charAt(right); //0
            if(seen.add(c)){
                max = Math.max(max,right-left+1);
                right++;
            }else{
                while(s.charAt(left)!=c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
                //remove actual character
            }
        }
        return max;
    }
}
