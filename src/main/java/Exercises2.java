import java.util.List;
import java.util.Scanner;

public class Exercises2 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public static int[] twoSum(int n, int t) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[n];
        for (int i = 0 ; i<n ; i++){
            nums[i] = input.nextInt();
        }
        for (int i = 0 ; i<n ;i++){
            if (nums[i] + nums[i+1] == t){
                System.out.print("your result is {" + i + "," + (i+1)  + "}" );
                break;
            }
        }
        return null;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public static int romanToInt(String st) {
        int n = st.length();
        char[] s = st.toCharArray();
        int sum = 0;
        for (int i = 0; i<n ; i++){
            if (s[i] == 'I' )
                sum += 1 ;
            else if (s[i] == 'V')
                sum += 5 ;
            else if (s[i] == 'X')
                sum += 10 ;
            else if (s[i] == 'L')
                sum += 50 ;
            else if (s[i] == 'C')
                sum += 100 ;
            else if (s[i] == 'D')
                sum += 500 ;
            else if (s[i] == 'M')
                sum += 1000 ;
        }
        System.out.print("Your result is " + sum);
        return 0;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */

    public List<List<Integer>> permute(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        System.out.print("Enter 1 for TwoSum function\nEnter 2 for romanToInt function\n");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        switch (n1){
            case 1 :
                System.out.print("Enter the number of elements you want to write\n");
                int n2 = input.nextInt();
                System.out.print("\nEnter your target number\n");
                int t = input.nextInt();
                twoSum(n2,t);
                break;
            case 2 :
                    System.out.print("Enter the string\n");
                    input = new Scanner(System.in);
                    String st = input.nextLine();
                    romanToInt(st);

        }
    }
}