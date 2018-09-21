public class BuddyInfo {
	
	private int num;
	private String name;
	private String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub fgtuftutf
		System.out.println("Hello world!");
		
		BuddyInfo b = new BuddyInfo();
		
		b.setName("Jim");
		System.out.println(b.getName());
		

	}
	
	public BuddyInfo() {
		
		}

	
	public String getName() {
		return name;
	}

	public void setName(String name1) { //h
		this.name = name1; 
	}

	public BuddyInfo(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num1) {
		this.num = num1;
	}

}
