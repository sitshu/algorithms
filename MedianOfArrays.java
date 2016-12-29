import java.util.*;
import java.lang.Math;
public class MedianOfArrays {
	
	public int getMedian(int[] a, int[] b, int n)
	{
		
		int median= -1;
		if(n<=0)
			return -1;
		if(n==1)
			return (a[0]+b[0])/2;
		if(n==2)
			median = (Math.max(a[0],b[0])+Math.min(a[1],b[1]))/2;
		else
		{
			
		}
		return median;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOfArrays m= new MedianOfArrays();
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
		int n =s.nextInt();
		Integer a[] = new Integer[n];;
		Integer b[] = new Integer[n];;
		for(int i= 0; i< n; i++)
		{
		   a[i]=s.nextInt();
		   
		}
		for(int i= 0; i< n; i++)
		{
		   b[i]=s.nextInt();
		   
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		int median = m.getMedian(a, b, n;)
	}

}
