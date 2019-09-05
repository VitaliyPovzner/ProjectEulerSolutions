package problem4;
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
//link http://projecteuler.net/problem=4

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(largestPalindrome());
    }
    public static long largestPalindrome(){
        long maxAnswer = 0;
        for(int i = 999; i >=0; i--) {
            for(int j = 999; j >= 0; j--) {
                long possibleAnswer = i * j;
                if(possibleAnswer == reverse(possibleAnswer) && possibleAnswer > maxAnswer) {
                    maxAnswer = possibleAnswer;
                    break;
                }
            }
        }
        return maxAnswer;
    }
    public static int reverse(Long num) {
        String tmp = Long.toString(num);
        StringBuilder sb = new StringBuilder(tmp);
        return Integer.parseInt(sb.reverse().toString());
    }
}
