package two.stud;

public class stud {
	int USN;
	String DeptName;
	float m1,m2,m3;
	double sgpa;
	
	public void getStud(int usn,String d,float m1,float m2,float m3,double sgpa)
	{
		this.USN=usn;
		this.DeptName=d;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.sgpa=sgpa;
	}
	
	public void showStud()
	{
		System.out.println("\nSTUDENT DETAILS:\n"+"\nUSN : "+USN+"\nDEPT : "+DeptName+"\nM1,M2,M3 : "+m1+","+m2+","+m3+"\nsgpa: "+sgpa);
	}
}