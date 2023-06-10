public class Exception1 {

	void print() {
		System.out.println("I am performing a calculation: ");
		System.out.println("I like to perform Division");
		System.out.println("Division of 2 no="+(10/0));//thrown exception object 
		System.out.println("Can you see my output");//Exception handling 
	}
	public static void main(String[] args) {
		Exception1 e1=new Exception1();
		e1.print();

	}

}