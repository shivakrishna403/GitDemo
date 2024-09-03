package javaProgram;

public class Indiatraffic implements CentralTraffic{
	public static void main(String[] args) {
		CentralTraffic a = new Indiatraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
	}

	@Override
	public void greenGo() {
		System.out.println("greenGo implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("redStop implementation");
		
	}

	@Override
	public void flashYellow() {
		System.out.println("flashYellow implementation");
		
		
	}

}
