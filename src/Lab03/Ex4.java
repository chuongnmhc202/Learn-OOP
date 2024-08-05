package Lab03;

public class Ex4 {
	public static void main(String[] args) {
		 // Ví dụ chuỗi để kiểm tra
        String text1 = "Hello world";
        String text2 = "Java programming";

        // Tính độ dài của chuỗi
        System.out.println("Độ dài của chuỗi \"" + text1 + "\" là: " + getLength(text1));

        // Đếm số từ trong chuỗi
        System.out.println("Số từ trong chuỗi \"" + text1 + "\" là: " + countWords(text1));

        // Nối hai chuỗi
        String concatenated = concatenateStrings(text1, text2);
        System.out.println("Kết quả nối chuỗi: " + concatenated);

        // Kiểm tra chuỗi có phải là palindrome không
        String palindromeCandidate = "madam";
        boolean isPalindrome = isPalindrome(palindromeCandidate);
        System.out.println("Chuỗi \"" + palindromeCandidate + "\" có phải là palindrome không? " + isPalindrome);
	}
	
	public static int getLength(String str) {
		return str.length();
	}
	
    public static int countWords(String str) {
    	String[] string =  str.trim().split("\\s+");
    	return string.length;
    }
    
    public static String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }
    
    public static boolean isPalindrome(String str) {
    	String s1 = str.replaceAll("\\s+", "").toLowerCase();
    	String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }

}
