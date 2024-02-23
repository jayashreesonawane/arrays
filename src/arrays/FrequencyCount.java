class FrequencyCount 
{
	public static void main(String[] args) 
	{
		int[] ar={1,2,1,3,5,2,3,3,5,6,3,4,5};
		int[] count=new int[ar.length];
		for (int i=0;i<ar.length-1;i++ )
		{
			int ct=0;
			for (int j=i+1;j<ar.length;j++ )
			{
				if (ar[i]==ar[j])
				{
					ct++;
					count[j]=-1;
				}
			}
			if (count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		for (int i=0;i<ar.length;i++ )
		{
			if (count[i]!=-1)
			{
				System.out.println(ar[i]+ " is repeated "+count[i]+" times");
			}
		}
	}
}
