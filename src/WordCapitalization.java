import java.util.HashMap;
import java.util.Map;

public class WordCapitalization {

	public static String isColorMethod(HashMap<String, String> hash,String inputText)
	{
		
		String as="as";
		String and="and";

		for (Map.Entry<String, String> entry : hash.entrySet())
		{
			
			String key=entry.getKey();
			String text=entry.getValue();
			
			inputText=inputText.replaceAll(key,text+key+text);
			
			if(key==as || key==and)
			{
				
				inputText=inputText.replaceAll(key, key.toUpperCase());
			}
			
			else
			{
				inputText=inputText.replaceAll(key, key.toLowerCase());
			}
		}


		
		return inputText;
		
		
		
}
}
