package two.staff;

public class staff {
	int sid;
	String sname;
	String desg;
	int nsub;
	
	public void getStaff(int sid,String sname,String desg,int nsub)
	{
		this.sid=sid;
		this.sname=sname;
		this.desg=desg;
		this.nsub=nsub;
	}
	
	public void showStaff()
	{
		System.out.println("\nSTAFF DETAILS\n"+"STAFF ID : "+sid+"\nStaffname : "+sname+"\nDesignation: "+desg+"\nNo. of subjects handled : "+nsub);
	}
}