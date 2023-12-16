import java.util.Scanner;

public class TabularOutput{

	public static void main(String[] args){
		System.out.println("N\tN2\tN3\tN4");

		for(int index = 1; index <= 5; index++){
			System.out.print(index+ "\t");
			System.out.print(index * index+ "\t");
			System.out.print(index * index * index+ "\t");
			System.out.print(index * index * index * index);
			System.out.println();
		} 
		
	}



}