package bridgeLabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	//Test case using I am Happy in mood constructor message to return SAD
	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am Happy in mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

}