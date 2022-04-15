package ex14;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild interfacechild = new InterfaceChild();
		
		interfacechild.sendCall();
		interfacechild.receiverCall();
		interfacechild.sendSMS();
		interfacechild.receiveSMS();
	}
}
