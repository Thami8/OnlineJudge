import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class Main {
	
	Scanner input;

	public Main()
	{
		input = new Scanner(System.in);
		start();
	}
	
	private void start() {
		int numOfInputs = input.nextInt();
		String[] myDates = new String[numOfInputs];
		for (int i = 0; i < myDates.length; i++) {
			myDates[i]=input.nextLine();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
