package three;
import java.util.Scanner;

class NameException extends Exception{
	public String toString()
	{
		return("name exception");
	}
}

class AgeException extends Exception{
	public String toString()
	{
		return("age exception");
	}
}

class emp{
	int age;
	String name;
	emp(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}

public class q3a{
	public static void main(String Args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER NAME :");
		String name=input.next();
		System.out.println("ENTER AGE :");
		int age=input.nextInt();
		int k=1,c=1;
		try{
			try{
				int s=Integer.parseInt(name);
			}
			catch(Exception e)
			{
				k=0;
			}
			if(k==1)
			{
				throw new NameException();
			}
		}
		catch(NameException e)
		{	
			System.out.println("error:"+e);
			c=0;
		}
		try{
			if(age>50)
				throw new AgeException();
		}
		catch(AgeException e)
		{
			System.out.println("error:"+e);
			c=0;
		}
		
		if(c==1)
		{
			emp obj=new emp(name,age);
			System.out.println("Correct Details ");
			System.out.println("age:"+obj.age+"\tname:"+obj.name);
		}
		else
			System.out.println("Object not created, ERROR !");
	}
}