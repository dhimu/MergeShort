import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		MergeSort mergeSort=new MergeSort();
		int list[]={1,5,0,6,7,9,2,4,8};
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println();
		mergeSort.divid(list, 0, list.length-1);
		for(int i=0;i<list.length;i++)
		System.out.print(list[i]+" ");
		
		

	}

}
