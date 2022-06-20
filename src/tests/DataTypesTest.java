package tests;

public class DataTypesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int
				int i = 10;
				System.out.println(i); //10
				
				i = 20;
				System.out.println(i); //20
				
				i= i+10;
				System.out.println(i); //30
				i=i*2;
				System.out.println(i); //60
				System.out.println(i*2); //120
				System.out.println(i); //60
				
				System.out.println(i++); //i++ means i=i+1
				System.out.println(i);
				
				//Double
				double d = 10.4;
				System.out.println(d);
				System.out.println(d*2);
				System.out.println(d+2);
				
				String testing = "Automation";
				System.out.println(testing);
				
				String tool = "Selenium";
				System.out.println(tool);
				
				String space = " ";
				
				System.out.println(testing + tool);
				System.out.println(testing +" "+ tool);
				System.out.println(testing+space+tool);
				
				int a = 20;
				int b = 30;
				
				System.out.println(testing+tool+a+b);
				System.out.println(a+b+testing+tool);
				System.out.println(testing+tool+(a+b));

	}

}
