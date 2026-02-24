public class UC4 {
    public static void main(String[] args) {

        // Banner lines stored in array
        String[] banner = {
            String.join(" ", "*", "*", "*", "*", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", "*", "*", "*", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", " ", " ", " ", "*")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}