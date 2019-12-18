package two;
import two.stud.*;
import two.staff.*;

public class q2a {
	public static void main(String[] args) {
		stud s1=new stud();
		s1.getStud(39,"himan", 85, 79, 92, 8.8);
		s1.showStud();
		staff f1=new staff();
		f1.getStaff(1, "pasha", "proffessor", 5);
		f1.showStaff();
	}
}