import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		int list[]={1,5,0,6,7,9,2,6,4,8};
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		
		System.out.println("\n\n----------------normal-------------------\n");
		
		new MergeSort(list, 0, list.length-1);
		
		System.out.println("\n\n--------------using Thread---------------\n");
		
		try {
			
			MergeSortTheaded mergeSortTheaded=new MergeSortTheaded(list, 0, list.length-1);
			mergeSortTheaded.thread.join();
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		};
		
		
		
		
		

	}

}
