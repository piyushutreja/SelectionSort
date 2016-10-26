import java.util.Arrays;

public class SelectionSorter {
	private int [] inputArr;

	public SelectionSorter(int[] inputArr) {
		// TODO Auto-generated constructor stub

		this.inputArr =inputArr;
		System.out.println("Before Sort"+ Arrays.toString(inputArr));

	}


	public void sort ()
	{
		

		for (int i = 0; i < inputArr.length-1; i++) {
			
			
			
			for (int j = i+1; j < inputArr.length; j++) {
				
				if (inputArr[i]<inputArr[j])
				{
					int temp = inputArr[i];
					inputArr[i]=inputArr[j];
					inputArr[j]=temp;;
				}
			}

		}
		
	

	}



}
