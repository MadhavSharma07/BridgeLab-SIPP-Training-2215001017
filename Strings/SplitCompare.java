
import java.util.Scanner;

public class SplitCompare {
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

    public static String[] manualSplit(String str) {
        int length = getStringLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndexes = new int[spaceCount + 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < words.length; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);

        String[] builtin = text.split(" ");
        boolean areEqual = compareArrays(manual, builtin);
        System.out.println("\nManual Split Result:");
        for (String word : manual) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtin) {
            System.out.println(word);
        }
        System.out.println("\nAre both split results equal? " + areEqual);
        sc.close();
    }
}
