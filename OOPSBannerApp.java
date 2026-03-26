import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Create HashMap to store character patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        charMap.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        charMap.put('S', new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        charMap.put(' ', new String[] {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return charMap;
    }

    /**
     * Display banner using HashMap
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = 7;

        for (int line = 0; line < height; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}