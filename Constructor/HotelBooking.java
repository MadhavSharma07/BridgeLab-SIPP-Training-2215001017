

public class HotelBooking {
	String guestName ;
	String roomType ;
	int nights;

	public HotelBooking() {
		guestName ="Anuj";
		roomType = "Non-ac";
		nights =2;
	}
	public HotelBooking(String guestName, String roomType,int nights) {
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights= nights;
	}
	public HotelBooking(HotelBooking h) {
		this.guestName=h.guestName;
		this.roomType=h.roomType;
		this.nights= h.nights;
	}
	public void display() {
		System.out.println("Guest Name : "+guestName);
		System.out.println("roomType : "+ roomType);
		System.out.println("Nights : "+nights);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Defult Constructor");
		HotelBooking obj1 = new HotelBooking();
		obj1.display();
		System.out.println();
		System.out.println("Parameterize Constructor");
		HotelBooking obj2 = new HotelBooking("madhav","ac_room",3);
		obj2.display();

		System.out.println();

		System.out.println("Copy Constructor");
		HotelBooking obj3 = new HotelBooking(obj2);
		
		obj3.display();



	}

}