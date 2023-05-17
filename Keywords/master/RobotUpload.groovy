package master
import java.awt.*
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import java.awt.Robot as Robot
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class RobotUpload {

	@Keyword
	def uploadFile(TestObject to, String filePath) {

		WebUI.click(to)

		Thread.sleep(1000)

		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();

		robot.delay(1000)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000)

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}



