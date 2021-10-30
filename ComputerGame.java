import java.util.Scanner;

public class ComputerGame {
    public static void main(String[] args){
    
        // Problem statement link: https://codeforces.com/problemset/problem/1598/A

        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        while(testCase>0){
            int n = scan.nextInt();                         // n = Columns
            int[][] game = new int[2][n];                   // game grid [2 x n]
            scan.nextLine();

            String input1 = scan.nextLine();                // taking input for L1
            String[] line1 = input1.split("");
            String input2 = scan.nextLine();                // taking input for L2
            String[] line2 = input2.split("");

            for(int i=0; i<n; i++){
                game[0][i] = Integer.parseInt(line1[i]);    // filling L1
            }
            for(int i=0; i<n; i++){
                game[1][i] = Integer.parseInt(line2[i]);    // filling L2
            }

            boolean flag = false;
            for(int i=0; i<n; i++){
                if(game[0][i] == 1 && game[1][i] == 1){
                    flag = true;
                    break;
                }
            }

            System.out.println((flag == true) ? "NO" : "YES");
            testCase--;
        }

        scan.close();
    }
}

// sample test cases

// input
// 4
// 3
// 000
// 000
// 4
// 0011
// 1100
// 4
// 0111
// 1110
// 6
// 010101
// 101010

// output
// YES
// YES
// NO
// YES
