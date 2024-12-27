
import java.util.Arrays;
class a5 
{
	public static void main(String[] args) 
	{
		int [] a={2,3,4,5};
		int [] b={6,7,8,9};
		int[] res=reverse(b);
		System.out.println(Arrays.toString(res));
		int [] d=res;
		int [] res2=merge(a,d);
		System.out.println(Arrays.toString(res2));
	}
	public static int[] reverse(int[]x)
	{
		int [] c= new int [x.length];
		int m=0;
			for (int i=x.length-1;i>=0;i--,m++)
		    {
				c[m]=x[i];
		    }
			return c;
	}
	public static int[] merge(int[]a,int[]d)
	{
		int[] merge_t=new int [a.length+d.length];
		for (int i=0,j=0,k=0;i<merge_t.length;i++)
		{
			if (j<a.length)
			{
				merge_t[i]=a[j];
				j++;
			}
			else if (k<d.length)
			{
				merge_t[i]=d[k];
				k++;
			}
			
		}
		return merge_t;
	}
}