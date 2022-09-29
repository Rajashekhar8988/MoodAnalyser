package bridgeLabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad in mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

}