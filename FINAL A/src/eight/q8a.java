package eight;

class chef extends Thread
{
	th t;
	chef(th t)
	{
		this.t=t;
		start();
	}
	public void run()
	{
		while(true) {t.ch();}
	}
}

class waiter extends Thread
{
	th t;
	waiter(th t)
	{
		this.t=t;
		start();
	}
	public void run()
	{
		while(true) {t.wa();}
	}
}

class th
{
	boolean abc=false;
	public synchronized void ch()
	{
		while(abc)
		{
			try
			{
				wait();
			}
			catch(Exception e){}
		}
		System.out.println("food is ready");
		abc=true;
		notify();
	}
	public synchronized void wa()
	{
		while(!abc)
		{
			try
			{
				wait();
			}
			catch(Exception e){}
		}
		System.out.println("coming");
		abc=false;
		notify();
	}
}

public class q8a
{
	public static void main(String args[])
	{
		th t=new th();
		new chef(t);
		new waiter(t);
	}
}