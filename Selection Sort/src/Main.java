import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
public static void main (String args[]){
	
// Scanner scan = new Scanner (System.in);
	
	int [] inputArray ={4,6,84,9,303};
	
System.out.println("Before Sort"+ Arrays.toString(inputArray));

SelectionSorter sorter = new SelectionSorter(inputArray);
sorter.sort();

System.out.println("After  Sort"+ Arrays.toString(inputArray));



    
	
}
	
}
