package javaProject;

import java.util.ArrayList;

public class FruitsBasket {
	ArrayList<Fruits> fru=new ArrayList<Fruits>();
	public boolean AddBasket(Fruits fs) {
		fru.add(fs);
		return true;
		 
	}
	public ArrayList<Fruits> getAllDetails(){
		
		return fru;
		
	}
	public Fruits SearchFruits(int fno) {
		for(Fruits fts:fru) {
			if(fts.getId()==fno)
				return fts;
		}
		return null;
	}
	public boolean removeAccount(int fno) {
		for(Fruits frs:fru) {
			if(frs.getId()==fno)
				fru.remove(fno);
		return true;
	}
		return false;
		
		
	}

}
