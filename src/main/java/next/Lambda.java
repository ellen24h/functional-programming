package next;

import java.util.List;
import java.util.function.Predicate;

public class Lambda {
	public static void printAllOld(List<Integer> numbers) {
		System.out.println("printAllOld");
		
		for (int number : numbers) {
		    System.out.println(number);
		}
	}

	public static void printAllLambda(List<Integer> numbers) {
		System.out.println("printAllLambda");
		
		numbers.forEach(System.out::println);		
	}
	
	public static void runThread() {
		new Thread(() -> System.out.println("Hello from thread")).start();
	}

	public static int sum(List<Integer> numbers, Predicate<Integer> p) {
	    int total = 0;
	    for (int number : numbers) {
	        if (p.test(number)) {
	        	total += number;
	        }
	    }
	    return total;
	}
	
	public static int sumAll(List<Integer> numbers) {
		return sum(numbers, n -> true);
	}
	
	public static int sumAllEven(List<Integer> numbers) {
	    return sum(numbers, n -> n % 2 == 0);
	}

	public static int sumAllOverThree(List<Integer> numbers) {
	    return sum(numbers, n -> n > 3);
	}
}
