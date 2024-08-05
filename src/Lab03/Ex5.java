package Lab03;

public class Ex5 {
	public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast "
        		+ "level surface of what I may call a fluid, on, or in, the top of which you and your countrymen "
        		+ "move about, without rising above it or falling below it.";

        String[][] wordFrequencies = countWordFrequencies(paragraph);

        for (String[] wordFrequency : wordFrequencies) {
            System.out.println(wordFrequency[0] + ": " + wordFrequency[1]);
        }
    }
	
    public static String[][] countWordFrequencies(String paragraph) {
    	String normalized = paragraph.toLowerCase();
    	normalized = normalized.replaceAll("[.,!?;:'\\\"()-]", " ");
    	String[] words = normalized.split("\\s+");
    	String[] uniqueWords = new String[words.length];
    	int[] counts = new int[words.length];
    	int uniqueWordCount = 0;
    	
    	for(String word : words) {
    		if(word.isEmpty()) continue;
    		
    		boolean found = false;
    		for(int i=0; i<uniqueWordCount; i++) {
    			if(uniqueWords[i].equals(word)) {
	    			counts[i]++;
	    			found = true;
	    			break;
    			}
    		}
    		
    		if(!found) {
    			uniqueWords[uniqueWordCount]= word;
    			counts[uniqueWordCount] = 1;
    			uniqueWordCount++;
    		}
    	}
    	String[][] result = new String[uniqueWordCount][2];
    	for(int i=0; i<uniqueWordCount ;i++) {
    		result[i][0] = uniqueWords[i];
    		result[i][1] = String.valueOf(counts[i]);
    	}
    	return result;
    }

}
