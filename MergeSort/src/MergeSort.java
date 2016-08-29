
public class MergeSort {
	
	void show(int list[],int start_index,int mid,int end_index,String s)
	{
		for(int x=0;x<start_index;x++)
		{
			
			System.out.print("  ");
			
		}
		for(int x=start_index;x<=end_index;x++)
		{
			
			System.out.print(list[x] +" ");
			
		}
		System.out.print("  "+s+"\n");
	}
	
	
	void merge(int list[],int start_index, int mid,int end_index )
	{
		int templist[]=new int[end_index-start_index+1];
		int c=0;
		int i,j;
		
		i=start_index;
		j=mid+1;
		while(i<=mid && j<=end_index)
		{
			if(list[i]<=list[j])
				templist[c++]=list[i++];
			else
				templist[c++]=list[j++];
						
		}
		while(i<=mid)
		{
			
			templist[c++]=list[i++];
									
		}
		while(j<=end_index)
		{
			
			templist[c++]=list[j++];
									
		}
		
		
		for(int x=0;x<c;x++)
		{
			list[start_index+x]=templist[x];
			
			
		}
		show(list, start_index, mid, end_index,"merge");
		
		
		
		
	}
	
	void divid(int list[],int start_index,int end_index)
	{
		
		if(start_index<end_index)
		{
			
			int mid=start_index+(end_index-start_index)/2;
			show(list, start_index, mid, end_index,"divid");
			divid(list, start_index, mid);
			divid(list, mid+1, end_index);
			merge(list,start_index, mid,end_index);
		}
		
	}

}
