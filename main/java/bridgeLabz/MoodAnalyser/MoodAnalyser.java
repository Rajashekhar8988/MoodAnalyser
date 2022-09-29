package bridgeLabz.MoodAnalyser;

public class MoodAnalyser {
	
    public String message;
	MoodAnalyser(){
		
	}
	//constructor with message to analyze mood
	MoodAnalyser(String message){
		this.message=message;
	}
	//method to analyze mood by reading string
	public String analyseMood() {
		if (message.contains("Happy")) {
			return "SAD";
		} else {
			return "HAPPY";
	    }
		}	
	//main method
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am Happy in mood");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
	}
}
