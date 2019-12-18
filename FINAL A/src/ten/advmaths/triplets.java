package ten.advmaths;
public class triplets {
	public static void tri(int limit)
	{
		int a=0,b=0,c=0;
		int m=2,n;
		while(c<limit)
		{
			for(n=1;n<m;++n)
			{
				a=m*m-n*n;
				b=2*m*n;
				c=m*m+n*n;
				if(c>limit)
					break;
				System.out.println("a:"+a+"\tb:"+b+"\tc:"+c+"");
			}
			m++;
		}
	}
}