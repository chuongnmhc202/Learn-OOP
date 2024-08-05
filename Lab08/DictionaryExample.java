import java.util.HashMap;
import java.util.Scanner;

public class DictionaryExample {
    private HashMap<String, String> dictionary;

    public DictionaryExample() {
        dictionary = new HashMap<>();
        initializeDictionary();
    }

    private void initializeDictionary() {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("computer", "máy tính");
        dictionary.put("program", "chương trình");
        dictionary.put("language", "ngôn ngữ");
        dictionary.put("java", "java");
        dictionary.put("dictionary", "từ điển");
        dictionary.put("code", "mã");
        dictionary.put("learn", "học");
        dictionary.put("example", "ví dụ");
    }

    public boolean wordExists(String word) {
        return dictionary.containsKey(word);
    }

    public String getMeaning(String word) {
        return dictionary.get(word);
    }

    public static void main(String[] args) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to look up: ");
        String word = scanner.nextLine();

        if (dictionaryExample.wordExists(word)) {
            String meaning = dictionaryExample.getMeaning(word);
            System.out.println("The meaning of '" + word + "' is: " + meaning);
        } else {
            System.out.println("The word '" + word + "' is not in the dictionary.");
        }

        scanner.close();
    }
}
