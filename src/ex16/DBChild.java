package ex16;

public class DBChild implements DBAccess{
	public void connect() {
		System.out.println("DB 연결");// print 출력 : "DB 연결"
	}
	public void disconnect() {
		System.out.println("DB 연결해체");// print 출력 : "DB 연결해체"
	}
	public void work() {
		System.out.println("실행");// print 출력 : "실행"
	}
}
