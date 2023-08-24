package course.c230824;

public class Main {
	public static void main(String[] args) {
//		Phone myPhone = new Phone("정경훈");
//		String myPhoneNumber;
//		myPhone.number = "010-3283-6388";
//		System.out.println(myPhone.number);
//
////		myPhone.getOwner();
//		System.out.println(myPhone.getOwner());
//		
//		System.out.println(myPhone.operator);
//		
////		System.out.println(Phone.model);
		
		GalaxyPhone myPhone1 = new GalaxyPhone("정경훈", "010-3283-6388");
		System.out.println(myPhone1.getOwner());

		System.out.println(GalaxyPhone.MANUFACTURER);
		System.out.println(IPhone.MANUFACTURER);

		IPhone myPhone2 = new IPhone("정경훈", "010-3283-6388");
		myPhone2.installApp("카카오톡");
		
		Phone[] myPhones = new Phone[] {myPhone1, myPhone2};

		((GalaxyPhone) myPhones[0]).installApp("카메라");
//		myPhones[1].installApp("카메라");
		
//		((GalaxyPhone) myPhone2).installApp("카메라");
		
		short temp = 1;
		int temp1 = temp;
	}
}
