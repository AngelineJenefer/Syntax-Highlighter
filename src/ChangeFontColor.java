import java.util.HashMap;
import java.util.Map;


public class ChangeFontColor {

	public static String isFontChangeMethod(String KeyWord1,String KeyWord2,HashMap<String, Font> changeFontMap,String sentence)
	{
		

		for (Map.Entry<String, Font> entry : changeFontMap.entrySet())
		{
			
			String key=entry.getKey();
			Font value=entry.getValue();
			
			
			
			sentence=sentence.replaceAll(key,value.color+value.font+key+value.font+value.color);
			if(key==KeyWord1 || key==KeyWord2)
			{
				
				sentence=sentence.replaceAll(key, key.toUpperCase());
			}
			
			else
			{
				sentence=sentence.replaceAll(key, key.toLowerCase());
			}
		}


		
		return sentence;
		
		
		
}
}
