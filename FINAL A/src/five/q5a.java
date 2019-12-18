package five;

class Q {
	synchronized boolean displayPrime(int i) {
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
}

class T1 extends Thread{
	Q q;
	T1(Q q){
		this.q=q;
	}
	public void run() {
		try {
			for(int i=1;i<=100;i++) {
				if(q.displayPrime(i)) {
					System.out.println("thread1:"+i);
					sleep(500);	
				}
			}
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	}
}

class T2 extends Thread{
	Q q;
	T2(Q q){
		this.q=q;
	}
	public void run() {
		try {
			for(int i=101;i<=200;i++) {
				if(q.displayPrime(i)) {
					System.out.println("thread2:"+i);
					sleep(500);
				}
			} 
		}catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}

public class q5a {
	public static void main(String[] args) {
		try {
			Q q=new Q();
			T1 t1=new T1(q);
			T2 t2=new T2(q);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		}catch(Exception e) {e.printStackTrace();}
	}
}