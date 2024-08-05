package Lab03;

public class Ex3 {
	public static void main(String[] args) {
        String fullName = "Nguyen Thi Thu Thao";

        System.out.println("Original Full Name: " + fullName);
        System.out.println("First and Last Name: " + getFirstAndLastName(fullName));
        System.out.println("Middle Name(s): " + getMiddleName(fullName));
        System.out.println("Capitalized Full Name: " + capitalizeFullName(fullName));
        System.out.println("Vowels Uppercase, Consonants Lowercase: " + vowelsUppercaseConsonantsLowercase(fullName));
    }

	private static String getFirstAndLastName(String fullName) {
		// TODO Auto-generated method stub
		String[] parts = fullName.trim().split("\\s+");
		if(parts.length <=2) {
			return fullName;
		}
		return parts[0]+" "+parts[parts.length - 1];
	}
	
    public static String getMiddleName(String fullName) {
    	String[] parts = fullName.trim().split("\\s+");
    	if(parts.length <=2) return "";
    	StringBuilder mid = new StringBuilder();
    	for(int i=1;i<parts.length-1;i++) {
    		if(i>1) {
    			mid.append(" ");
    		}
    		mid.append(parts[i]);
    	}
    	return mid.toString();
    }
    
    public static String capitalizeFullName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for(String part:parts) {
        	if(!part.isEmpty()) {
        		capitalized.append(Character.toUpperCase(part.charAt(0)))
        					.append(part.substring(1).toLowerCase())
        					.append(" ");
        	}
        }
        return capitalized.toString().trim();
    }
    
    public static String vowelsUppercaseConsonantsLowercase(String fullName) {
    	String vowels = "aeiouAEIOU"; // Các nguyên âm
    	StringBuilder transformed = new StringBuilder();
    	for(char c:fullName.toCharArray()) {
    		if(Character.isLetter(c)) {
    			if(vowels.indexOf(c)>=0) {
    				transformed.append(Character.toUpperCase(c));
    			}else {
    				transformed.append(Character.toLowerCase(c));
    			}
    		} else {
    			transformed.append(c);
    		}
    	}
    	return transformed.toString();
    }


}
