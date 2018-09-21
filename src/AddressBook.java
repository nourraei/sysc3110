import java.util.ArrayList;
import java.util.List;

/** 
 * 
 * @author nour raei
 * STUDENT ID: 101035984
 *
 */  
public class AddressBook {
	//new
	private List<BuddyInfo> buddyInfo;
	
	public static void main(String[] args) {
		  
		BuddyInfo person1 = new BuddyInfo(1,"2455","613454785") ;
		//BuddyInfo person2 = new BuddyInfo(2,"2455","613454785") ;
		
		AddressBook a = new AddressBook(); //----> WAY1
		a.addBuddy(person1);
		
		a.removeBuddy(0);
		
		
		 System.out.println("AddressBook here");
		 
		 // TODO Auto-generated method stub



		}
	public AddressBook() {  //constructor
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	ArrayList<BuddyInfo> al= new ArrayList<BuddyInfo>(); //collection of buddyinfo objects
	
	public void addBuddy(BuddyInfo buddy) { //add method hb
		if(buddy!=null) {
			this.buddyInfo.add(buddy);
		}
	}
	
	public BuddyInfo removeBuddy(int index) { //remove method
		if(index>=0 && index<this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
		
	}

	
	
	
	
	
}
