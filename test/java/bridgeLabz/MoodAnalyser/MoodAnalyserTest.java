package bridgeLabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am in any Mood");
		Assert.assertEquals("HAPPY", actualResult);
	}

}