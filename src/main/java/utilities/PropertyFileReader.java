package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	Properties props;

	public PropertyFileReader() throws IOException {
		FileReader reader = new FileReader(
				"C:\\Naresh\\FrameWorks\\functional\\src\\test\\resources\\TestData.properties");
		props = new Properties();
		props.load(reader);
	}

	public String getUserName() {
		String userName = props.getProperty("username");
		return userName;
	}

	public String getPassword() {
		String password = props.getProperty("password");
		return password;
	}

}
