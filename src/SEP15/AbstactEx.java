package SEP15;

abstract class Bike {
	void runs() {
		System.out.println("running");
	}
	void greater(){
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
}

public class AbstactEx extends Bike {
	public static void main(String[] args) {
		Bike obj = new AbstactEx();
		obj.runs();
		//AbstactEx ab = new AbstactEx();
		//ab.running();

	}

}
