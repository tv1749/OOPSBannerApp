import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OPSBannerUC8 {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        Map<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 3: Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine().toUpperCase();

        // Step 4: Print banner
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("  ");
                } else {
                    line.append("???? ").append("  "); // unknown character
                }
            }

            System.out.println(line);
        }

        sc.close();
    }
}