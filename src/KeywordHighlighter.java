
import java.util.ArrayList;

public class KeywordHighlighter {

	public static String ifKeywordMethod(String input,ArrayList<String> arrayList)
	{
		for(String key:arrayList)
		{
			input=input.replaceAll(key,"[blue]"+key+"[blue]");
		}
		return input;
	}

}
