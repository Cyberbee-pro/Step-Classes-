import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized function to assemble and print the banner
    public static void renderBanner(String targetWord, Map<Character, String[]> patternMap) {
        int totalLines = 9; // Height of our ASCII letters
        
        // Default blank pattern if a character isn't found in the map
        String[] defaultPattern = {
            "       ", "       ", "       ", "       ", "       ", 
            "       ", "       ", "       ", "       "
        };

        for (int i = 0; i < totalLines; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (int j = 0; j < targetWord.length(); j++) {
                char targetChar = targetWord.charAt(j);
                
                // Fetch pattern from map in O(1) time, using default if missing
                String[] charPattern = patternMap.getOrDefault(targetChar, defaultPattern);
                
                // Append the specific line of the character and add horizontal spacing
                lineBuilder.append(charPattern[i]).append("   ");
            }
            
            // Print the constructed horizontal row
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        
        String[] oPattern = {
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "
        };

        String[] pPattern = {
            "******   ",
            "**   **  ",
            "**    ** ",
            "**   **  ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };

        String[] sPattern = {
            "   **** ",
            " **     ",
            "**      ",
            " ***    ",
            "   **   ",
            "     ** ",
            "      **",
            "    **  ",
            "*****   "
        };

        // Initialize the HashMap and populate it
        Map<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', oPattern);
        patternMap.put('P', pPattern);
        patternMap.put('S', sPattern);

        String targetWord = "OOPS";

        // Call our new render function
        renderBanner(targetWord, patternMap);
    }
}