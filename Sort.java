
public class Sort {
	int size;
	int[] array1;
	int[] array2;
	int[] array3;
	int[] array4;
	int[] array5;
	int[] array6;
	int[] array7;
	int[] array8;
	public Sort(int size)
	{
		this.size = size;
		array1 = new int[size];
		array2 = new int[size];
		array3 = new int[size];
		for(int i = 0; i < size;i++)
		{
			array1[i] = (int)(Math.random()*10000);
			array2[i] = array1[i];
			array3[i] = array1[i];
		}
		
	}

	
	
	public void print()
	{
		for(int i = 0; i < size;i++)
		{
			System.out.print(array2[i]);
			System.out.print(" ");
		}
		System.out.println();
	
	}
	
	public void bubbleSort()
	{
		int tmp;
		for(int i = 0; i < size;i++)
			for(int j = 0; j < size - 1;j++)
				if(array1[j] > array1[j+1])
				{
					tmp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = tmp;
				}
	}
	
	public void insertionSort()
	{
		 int tmp;
		 for(int i = 1; i < size; i++)
		 {
			 for(int j = i;j>0 && array2[j-1]>array2[j];j--)
			 {
				 tmp = array2[j];
		         array2[j] = array2[j-1];
		         array2[j-1] = tmp;

		     }
		 }
		    
	}
	
	public void selectionSort()
	{
		int tmp;
	    int min = 0;
	    int minIndex;
	   
	    for(int i = 0; i < size;i++)
	    {
	        min = array3[i];
	        minIndex = i;
	        for(int j = i; j < size;j++)
	        {
	            if(array3[j] < min)
	            {
	                min = array3[j];
	                minIndex = j;
	            }
	        }
	        if(minIndex != i)
	        {
	            tmp = array3[i];
	            array3[i] = array3[minIndex];
	            array3[minIndex] = tmp;
	        }

	    }
	    
	}
	
}
