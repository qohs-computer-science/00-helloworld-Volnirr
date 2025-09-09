import java.util.Scanner ;	
/* 
 * Liam Gillaspy
 * CP3
 * PD: 6
 * say hello world
 */
public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("What is your name? ");
		String name = scanner.nextLine() ;
		System.out.println("Hello, "+name+"!") ;

		scanner.close() ;
	}

}
