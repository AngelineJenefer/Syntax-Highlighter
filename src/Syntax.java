import java.util.*;
import java.io.*;

class Syntax
{
	public static void main(String args[])
	{
		//Story 1 Logic :
		
		System.out.println("Story 1 Input");
		
		String sentence="if we write as program and compile it, then we can run the program to get output \n";
		System.out.println(sentence);
		ArrayList<String> arrayList=new ArrayList<String>();
		//Adding to ArrayList
		arrayList.add("as");
		arrayList.add("if");
		arrayList.add("and");
		arrayList.add("then");
		arrayList.add("when");
	//Story 1 Output:
		System.out.println("Story 1 Output:");
		System.out.println(KeywordHighlighter.ifKeywordMethod(sentence, arrayList));
		
	
		//Story 2 Logic :
		
HashMap<String, String> hashmap=new HashMap<String, String>();
		//Adding to HashMap
		hashmap.put("as","[blue]");
		hashmap.put("if","[red]");
		hashmap.put("and","[red]");
		hashmap.put("then","[green]");
		hashmap.put("when","[blue]");
//Story 2 output:
		
		System.out.println("Story 2 Output:");
		System.out.println(ColorReplace.isColorMethod( hashmap,sentence));
		
		//Story 3 Logic:
		
		System.out.println("Story 3 Input:");
				
		String text="If we write as program and compile it, THEN we can run the program to get output \n";
		System.out.println(text);
		
HashMap<String, String> map=new HashMap<String, String>();
		//Adding to HashMap
		hashmap.put("as","[blue]");
		hashmap.put("If","[red]");
		hashmap.put("and","[red]");
		hashmap.put("THEN","[green]");
		hashmap.put("when","[blue]");

		//Story 3 Output:
		
		System.out.println(WordCapitalization.isColorMethod(hashmap, sentence));
		
		
		//story 4 Logic:
		
		System.out.println("Story 4 Input:");
		String KeyWord1="as";
		String KeyWord2="and";
		
		//Creating object and adding values
		Font changeFont1=new Font("[blue]","");
		Font changeFont2=new Font("[red]","[bold]");
		Font changeFont3=new Font("[red]","[bold]");
		Font changeFont4=new Font("[green]","");
		Font changeFont5=new Font("[blue]","");
		
		String input="If we write as program and compile it, THEN we can run the program to get output \n";
		System.out.println(input);
		
		HashMap<String, Font> changeFontMap=new HashMap<String,Font>();
		//Adding to HashMap
		changeFontMap.put("as", changeFont1);
		changeFontMap.put("If", changeFont2);
		changeFontMap.put("and", changeFont3);
		changeFontMap.put("THEN", changeFont4);
		changeFontMap.put("when", changeFont5);
	
		//Story 4 Output:
		
		System.out.println(ChangeFontColor.isFontChangeMethod(KeyWord1, KeyWord2, changeFontMap, sentence));
		
		
		
		    
	}
}