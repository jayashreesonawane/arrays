import java.util.Scanner;
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int ar[]={-7,0,1,4,13,59,68,92,200,503};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int element = sc.nextInt();
		int start=0, end=ar.length-1;
		int mid = (start+end)/2;
		while(start<=end)
		{
			if (ar[mid]==element)
			{
				System.out.println("Element found at "+mid+" index");
				break;
			}
			else if (element>ar[mid])
			{
				start=mid+1;
			}
			else if (element<ar[mid])
			{
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if (start>end)
		{
			System.out.println("Element not found");
		}
	}
}
