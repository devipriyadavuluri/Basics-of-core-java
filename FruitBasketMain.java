package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBasketMain {

	public static void main(String[] args) { 
		ArrayList<Fruits> frm=new ArrayList<Fruits>();
		FruitsBasket fb=new FruitsBasket();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println(" 1.Add ");
			System.out.println(" 2. list ");
			System.out.println(" 3. search ");
			System.out.println(" 4. remove ");
			System.out.println(" enter choice ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("fruit name");
				String name=sc.next();
				System.out.println("fruit id");
				int id=sc.nextInt();
				System.out.println(" fruit price ");
				int price=sc.nextInt();
				Fruits fs=new Fruits(name,id,price);
				fb.AddBasket(fs);
				break;
			case 2:
				ArrayList<Fruits> get=fb.getAllDetails();
				for(Fruits fs1:frm)
				System.out.println(" succesfully added "+fs1.getName()+" "+fs1.getId()+ " "+fs1.getPrice());
			    break;
			case 3:
				System.out.println("fruit  number");
				int no=sc.nextInt();
				Fruits fs1=fb.SearchFruits(no);
				if(fs1==null) 
					System.out.println(" invalid fruits basket");
				else 
					System.out.println(fs1.getName()+" "+fs1.getId()+" "+fs1.getPrice());
				break;
			case 4:
				System.out.println(" fruit number ");
				no=sc.nextInt();
				boolean fr=fb.removeAccount(no);
				if(fr)
					System.out.println(" sucessfully removed ");
				else
					System.out.println(" invalid ");
				break;
			default:
				System.out.println(" finally ");
					
				
			
		}
	}while(ch<4);

}
}