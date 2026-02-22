/**
 * @author Cyberbee
 * */

import java.util.Scanner;

public class UC4 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        
        // Centralized data structure utilizing String.join() for array population
        String[] banner = {
        String.join(" ", "   ** ", "       ** ", "      ****** ","         ***** "),
        String.join(" ", " **   ** ", "  **   ** ", "   **    ** ","     ** "),
        String.join(" ", "**     **", " **     ** ", "  **      **","   ** "),
        String.join(" ", "**     **", " **      ** ", " **      ** ","   **"),
        String.join(" ", "**     **", " **      ** ", " **    ** ", "      *** "),
        String.join(" ", "**     **", " **      ** ", " ******","            **"),
        String.join(" ", "**     **", " **      ** ", " ** ","                **"),
        String.join(" ", "  ** ** ", "   **    ** ", "  ** ","               **"),
        String.join(" ", "   ** ", "        ** ", "     ** ","          ***** ")
        };

        // Output traversal using an enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }

    }
}