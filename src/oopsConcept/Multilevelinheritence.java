package oopsConcept;

public class Multilevelinheritence {

	public static void main(String[] args) {
		childd c = new childd();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		c.method5();
		c.cal();
		c.call();

	}

}

class grandparent {
	int l;

	grandparent(int i, int j) {
		i = 100;
		j = 5;
		l = i + j;
		System.out.println("im gp");
	}

	public void method1() {
		System.out.println("m1");
	}

	public void method2() {
		System.out.println("m2");
	}
}

class parentt extends grandparent {
	int z;

	parentt(int x, int y) {
		super(0, 0);
		x = 10;
		y = 5;
		z = x + y;
		System.out.println("hello");
	}

	public void method3() {
		System.out.println("m3");
	}

	public void method4() {
		System.out.println("m4");
	}

	public void call() {

		System.out.println(z);
	}
}

class childd extends parentt {
	childd() {
		super(0, 0);
		System.out.println("hii");
	}

	public void method5() {
		System.out.println("m5");
	}

	public void method6() {
		System.out.println("m6");
	}

	public void cal() {

		System.out.println(l);
	}

}