import java.util.Scanner;

public class TextAnalyzer {
    public static String[] splitIntoWords(String text) {
        String word = "";
        String[] words = new String[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) {
                    words[count++] = word;
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals("")) {
            words[count++] = word;
        }
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = words[i];
        }

        return result;
    }
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordInfo = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordInfo[i][0] = words[i];
            wordInfo[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordInfo;
    }
    public static int[] findShortestAndLongest(String[][] wordInfo) {
        int shortest = Integer.parseInt(wordInfo[0][1]);
        int longest = Integer.parseInt(wordInfo[0][1]);

        for (int i = 1; i < wordInfo.length; i++) {
            int len = Integer.parseInt(wordInfo[i][1]);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }

        return new int[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordInfo = getWordLengthArray(words);

        int[] result = findShortestAndLongest(wordInfo);

        System.out.println("\nWords and their lengths:");
        for (String[] pair : wordInfo) {
            System.out.println(pair[0] + " - " + pair[1]);
        }

        System.out.println("\nShortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);

    }
}