public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration + initialization using String.join()
        String[] lines = {

            String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*     *", "*       ", "*      ", "      *"),
            String.join(" ", "*     *", "*       ", "*      ", "*     *"),
            String.join(" ", " ***** ", "*       ", "*      ", " ***** ")

        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}