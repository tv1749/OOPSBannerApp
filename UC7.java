import java.util.HashMap;
import java.util.Map;

public class UC7 {

    // Static inner class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        // Pattern for P
        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        // Pattern for S
        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(c);
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}