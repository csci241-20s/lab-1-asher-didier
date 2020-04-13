package lab1;

public class Hello {
  public static void main(String[] args) {
	System.out.print("Hello, ");
	for (int index = 0; index < args.length-1; index++) {
		System.out.print(args[index] + " ");
	}
	System.out.print(args[args.length-1] + "!");
  }
}
