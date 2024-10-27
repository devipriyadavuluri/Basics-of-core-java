package javaProject;

import java.util.Scanner;

public class MathDemoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		MathDemo MD=new MathDemo();
		int ans=0;
		int ch=0;
		do {
		System.out.println(" enter choice");
		System.out.println(" Main Menu ");
		System.out.println(" 1.Addition ");
		System.out.println(" 2. multplication ");
		System.out.println(" 3. Division ");
		System.out.println(" 4. Modulus ");
		System.out.println(" exist ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			ans=MD.Addition(a,b);
			System.out.println(" Add :"+ans);
			break;
		case 2:
			ans=MD.multiplicatin(a,b);
			System.out.println(" mul :"+ans);
			break;
		case 3:
			ans=MD.division(a,b);
			System.out.println(" ans :"+ans);
			break;
		case 4:
			ans=MD.modulus(a,b);
			System.out.println(" modulus:"+ans);
			break;
	
			default:
				System.out.println(" exit  ");
		}

	}
	while(ch<4);
}

}
