import java.util.Scanner;

public class WordLengthProcessor {
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100];
        int index = 0;
        String currentWord = "";
        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                words[index++] = currentWord;
                currentWord = "";
            }
        }
        if (!currentWord.equals("")) {
            words[index++] = currentWord; 
        }
        String[] finalWords = new String[index];
        for (int i = 0; i < index; i++) {
            finalWords[i] = words[i];
        }
        return finalWords;
    }
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    public static void displayWordTable(String[][] wordArray) {
        System.out.printf("\n", "Word", "Length");
       
        for (String[] row : wordArray) {
            String word = row[0];
            int len = Integer.parseInt(row[1]);
            System.out.printf("\n", word, len);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordData = getWordLengthArray(words);

        System.out.println("\n Word Length Table");
        displayWordTable(wordData);
    }
}