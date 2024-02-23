class UniqueElements 
{
    public static void main(String[] args) 
	{
        int[] ar = {1, 2, 1, 3, 5, 2, 3, 3, 5, 6, 3, 4, 5};

        for (int i = 0; i < ar.length; i++) 
		{
            boolean isRepeated = false;
            
			for (int j = 0; j < ar.length; j++) 
			{
                if (i != j && ar[i] == ar[j]) 
				{
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) 
			{
                System.out.println(ar[i]);
            }
        }
    }
}
