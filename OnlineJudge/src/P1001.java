

/*
 * This class solves probelm number 1001
 * The ACM online judge problem can be found at
 * http://acm.tju.edu.cn/toj/showp1001.html
 */

import java.util.Scanner;

/**
 * @author Mohamed Samy Ismail Mohamed
 *
 */
public class P1001 {

	Scanner input;
	
	public P1001()
	{
		input = new Scanner(System.in);
		start();
	}
	
	private void start() {
		int x;
		while(input.hasNextInt())
		{
			x = input.nextInt();
			System.out.print(Character.toString ((char) x));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P1001();
	}
}