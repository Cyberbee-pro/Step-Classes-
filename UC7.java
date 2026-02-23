
public class UC7 {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char c, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == c) {
                return map.getPattern();
            }
        }

        return new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       ", "       ", "       "};
    }


    public static void main(String[] args) {
        
        String[] oPattern = {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };

        String[] pPattern = {
            "******    ",
            "**    **  ",
            "**     ** ",
            "**     ** ",
            "******    ",
            "**        ",
            "**        ",
            "**        ",
            "**        "
        };

        String[] sPattern = {
            "   ****  ",
            " **      ",
            "**       ",
            " ***     ",
            "   **    ",
            "     **   ",
            "      **  ",
            "    **   ",
            "*****    "
        };

        CharacterPatternMap[] patternMaps = {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern)
        };

        String targetWord = "OOPS";
        int totalLines = 9;

        // 3. Assemble and print the banner using StringBuilder
        for (int i = 0; i < totalLines; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (int j = 0; j < targetWord.length(); j++) {
                char targetChar = targetWord.charAt(j);
                String[] charPattern = getCharacterPattern(targetChar, patternMaps);
                
                // Append the specific line of the character and add horizontal spacing
                lineBuilder.append(charPattern[i]).append("   ");
            }
            
            // Print the constructed horizontal row
            System.out.println(lineBuilder.toString());
        }
    }
}