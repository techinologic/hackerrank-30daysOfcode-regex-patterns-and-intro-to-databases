import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        /*
        1. scan N = number of entries
        2. store entries intp a string array
        3. print entries that has @gmail.com in them
         */

        Scanner sc = new Scanner(System.in);

        Pattern p = Pattern.compile("\\p{Alpha}+");

        int N = sc.nextInt();
        sc.nextLine();

        String[] ar = new String[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextLine();
        }

        String myString;
        ArrayList<String> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            myString = ar[i];
            Matcher m = p.matcher(myString);

            if (m.find() && myString.contains("@gmail.com")) {
                L.add(m.group());
            }
        }

        L.sort(String::compareToIgnoreCase);

        for (String s :
                L) {
            System.out.println(s);
        }

    }
}

/*

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com







 */