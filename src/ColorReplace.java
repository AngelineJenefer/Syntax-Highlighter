import java.util.HashMap;
import java.util.Map;

public class ColorReplace  {
	
	public static String isColorMethod(HashMap<String, String> hash,String inputText)
	{
		

		for (Map.Entry<String, String> entry : hash.entrySet())
		{
			String key=entry.getKey();
			String text=entry.getValue();
			inputText=inputText.replaceAll(key,text+key+text);
		}
		return inputText;
}
}
