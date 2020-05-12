class SelectionSort
{
	public static void main(String[] args)
	{
		
		int a[]= {30,36,52,2,5,6,1,50,56};
		int temp;
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				min=i;
				if(a[min]>a[j])
				{
					min=j;
				}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		
			