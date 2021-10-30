import java.util.Scanner;

public class TwoSubsequences {
    private static final int i = 0;
    public static void main(String[] args){

        // Problem Statement Link: https://codeforces.com/problemset/problem/1602/A
    
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();

        while(testCase>0){
            String s = scan.nextLine();
            int n = s.length();
            
            char a = s.charAt(i);
            int k = 0;
            for(int j=i+1; j<n; j++){
                if(s.charAt(j)<=a){
                    a = s.charAt(j);
                    k = j;
                }
            }

            String b = s.substring(0, k) + s.substring(k+1, n);
            System.out.println(a + " " + b);
            testCase--;
        }

        scan.close();
    }
}

// sample test cases

// input
// 3
// fc
// aaaa
// thebrightboiler

// output
// c f
// a aaa
// b therightboiler