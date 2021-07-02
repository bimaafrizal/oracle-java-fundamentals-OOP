package inheritance;

public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref;
		ref = b;
		ref.callthis();
		ref = c;
		ref.callthis();
		ref = a;
		ref.callthis();
	}
}
