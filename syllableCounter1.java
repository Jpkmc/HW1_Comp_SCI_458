package Problem_3;


public class syllableCounter1 {

    // Count syllables in a single word
    public static int countSyllables(String word) {
        if (word == null || word.trim().isEmpty()) {
        return 0;
    }
        word = word.toLowerCase().trim();
        if (word.isEmpty()) return 0;

        int count = 0;

        boolean prevVowel = false;
        String vowels = "aeiouy";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // Check if current char is a vowel
            boolean isVowel = vowels.indexOf(c) != -1;

            // If it's a vowel and the previous wasn't, count a syllable
            if (isVowel && !prevVowel) {
                count++;
                prevVowel = true;
            } else if (!isVowel) {
                prevVowel = false;
            }
        }

        // Subtract 1 if word ends with "e" (silent e)
        if (word.endsWith("e") && count > 1) {
            count--;
        }
        
        // Adjust for "le" ending (like "table")
        if (word.endsWith("le") && word.length() > 2 && !vowels.contains("" + word.charAt(word.length() - 3))) {
            count++;
        }
          // Special Rule: "-ness" words like "business"
        if (word.endsWith("ness") && count > 2) {
            count--;
        }
        // Guarantee at least one syllable
        return Math.max(count, 1);
    }

    public static void main(String[] args) {
        String[] words = {
            "syllable", "computer", "rhythm", "beautiful",
            "queue", "apple", "strengths", "business", "family", "table"
        };

        for (String word : words) {
            int syllables = countSyllables(word);
            System.out.println(syllables + " " + word);
        }
    }
}
