package bridgeLabz.MoodAnalyser;

public class MoodAnalyser {
	
    public String message;
	//
	MoodAnalyser(String message){
		this.message=message;
	}
	//method to analyze mood by reading string
	public String analyseMood() {
	
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
	    }
		}	
	//main method
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad in mood");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
	}
}
