public class main{
public static void main(String[] args) {
	
	try{
		textAssist p1 = new textAssist();
		calculator c1 = new calculator();
		String[] processed = p1.processText();
		item i1 = new item(processed[0],processed[1],processed[2],processed[3]);
		c1.fullCalculation(i1);

	}
	catch(IOException e)
	{
	System.err.println(e.getMessage());

	}
	
}

}