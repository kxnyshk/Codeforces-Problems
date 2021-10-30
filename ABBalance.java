import java.util.Scanner;

public class ABBalance {
    private static final String ab = "ab";
    private static final String ba = "ba";
    private static final char a = 'a';
    private static final char b = 'b';
    private static final int i = 0;
    public static void main(String[] args){

        // Problem Statement Link: https://codeforces.com/problemset/problem/1606/A
    
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        while(testCase+1>0){
            String s = scan.nextLine();

            int countAB = Count(s, ab);
            int countBA = Count(s, ba);

            // System.out.println(countAB);
            // System.out.println(countBA);

            if((countAB == countBA) || (s.length() == 1)){
                System.out.println(s);
            }
            else{
                StringBuilder sb = new StringBuilder(s);
                
                if(s.charAt(i) == a){
                    sb.setCharAt(i, b);
                }
                else if(s.charAt(i) == b){
                    sb.setCharAt(i, a);
                }

                s = sb.toString();
                System.out.println(s);
            }

            testCase--;
        }

        scan.close();
    }

    private static int Count(String str, String substr) {
        if(str.isEmpty() || substr.isEmpty()){
            return 0;
        }

        int index = 0;
        int count = 0;

        while(index != -1) {

            index = str.indexOf(substr,index);
        
            if(index != -1){
                count++;
                index += 1;
            }
            else{
                break;
            }
        }
        return count;
    }
}

// sample test cases :-

// input
// 4
// b
// aabbbabaa
// abbb
// abbaab
// baa
// baab
// abbab
// abbabb
// aaaaabbbbb
// bbbbbbaaaa

// output
// b
// aabbbabaa
// bbbb
// bbbaab
// aaa
// baab
// bbbab
// bbbabb
// bbbbbbbbbb
// aaaaaaaaaa

