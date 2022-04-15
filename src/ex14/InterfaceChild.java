package ex14;

public class InterfaceChild implements PhoneInterface,MP3Interface{

	public void sendSMS() {
		System.out.println("문자갑니다");// print 출력 : "문자갑니다"
	}
	public void receiveSMS() {
		System.out.println("문자왔어요");
	} // print 출력 : "문자왔어요"
	
	public void sendCall() {
		System.out.println("따르릉");// print 출력 : "따르릉"
	}
	public void receiverCall() {
		System.out.println("전화왔어요");// print 출력 : "전화왔어요"
	}
}
