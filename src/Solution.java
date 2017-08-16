import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] ar = new String[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextLine();
        }


        System.out.println(ar[2]);

    }
}