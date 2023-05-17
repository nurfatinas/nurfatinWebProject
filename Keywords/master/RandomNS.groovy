package master
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil




public class RandomNS {

	@Keyword
	def static genRandomNumber(String str, int length) {


		Random rand = new Random();

		StringBuilder randNum = new StringBuilder();

		for (int i=0; i<length; i++) {

			randNum.append(rand.nextInt(10));
		}

		KeywordUtil.logInfo('Generated Input: ' + str+randNum)
		
		return (str+randNum).toString();
	}


	@Keyword
	def static genRandomString(int length) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWYXZabcdefghijklmnopqrstuvwxzy1234567890"
		Random rand = new Random()

		StringBuilder randString = new StringBuilder();


		for(int i=0; i<length; i++) {

			randString.append(chars.charAt(rand.nextInt(chars.length())));
		}


		return randString.toString();
	}

	@Keyword
	def static genRandomNonAplhanumeric(int length) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWYXZabcdefghijklmnopqrstuvwxzy"
		Random rand = new Random()

		StringBuilder randString = new StringBuilder();


		for(int i=0; i<length; i++) {

			randString.append(chars.charAt(rand.nextInt(chars.length())));
		}


		return randString.toString();
	}
}