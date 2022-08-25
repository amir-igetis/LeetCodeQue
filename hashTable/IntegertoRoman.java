package hashTable;

public class IntegertoRoman {
    public static void main(String[] args) {
        int num = 496;
        System.out.println(inttoRoman(num));
        // https://leetcode.com/problems/integer-to-roman/
    }

    static String inttoRoman(int num){
        // Solution from
        // https://www.youtube.com/watch?v=f_F9ItFyiEg
        // using string Builder
        // didn't post on linked in
        // solution to similer question
        // https://www.programcreek.com/2014/05/leetcode-integer-to-english-words-java/
        int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intCode.length; i++) {
            while (num >= intCode[i]) {
                sb.append(code[i]);
                num -= intCode[i];
            }
        }
        return sb.toString();
    }
}
