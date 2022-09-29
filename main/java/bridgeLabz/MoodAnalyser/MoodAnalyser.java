package bridgeLabz.MoodAnalyser;

public class MoodAnalyser {

	//method to analyze mood by reading string
	public String analyseMood(String message) {
	
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
	    }
		}	
	//main method
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in any mood");
		System.out.println(mood);
	}
}
