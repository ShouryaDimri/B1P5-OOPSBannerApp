public class OOPSBannerApp {

    /**
     * Inner static class to map character with its pattern
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize character pattern mappings
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] pPattern = {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] sPattern = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };

        String[] spacePattern = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern),
            new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Get pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // fallback → space
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print banner message
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}