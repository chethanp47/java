package in.ac.kletech;

public class University {
	
	public String sCetcode;
	
	public String getsCetcode() {
		return sCetcode;
	}
	
	public University(String sCetcode) {
		super();
		this.sCetcode = sCetcode;
	}

	school[] s=new school[8];
	school[] s1=new school[8];
	class school
	{
		private String sProgramCode;
		private String sSchoolCoordinator;
		private int iNo_of_students;
		private int iNo_of_staff;
		
		public String getsProgramCode() {
			return sProgramCode;
		}
		public String getsSchoolCoordinator() {
			return sSchoolCoordinator;
		}
		public int getiNo_of_students() {
			return iNo_of_students;
		}
		public int getiNo_of_staff() {
			return iNo_of_staff;
		}
		public school(String sProgramCode, String sSchoolCoordinator,
				int iNo_of_students, int iNo_of_staff) {
			super();
			this.sProgramCode = sProgramCode;
			this.sSchoolCoordinator = sSchoolCoordinator;
			this.iNo_of_students = iNo_of_students;
			this.iNo_of_staff = iNo_of_staff;
		}
	}
	void createobject()
	{
		s[0]=new school("CSE01","RAM",116,20);
		s[1]=new school("EC01","SHAM",84,15);
		s[2]=new school("MECH01","BHAM",90,45);
		s[3]=new school("AERO01","HANUMAN",145,35);
	
		s[4]=new school("CIVIL01","BHEEM",110,41);
		s[5]=new school("EE01","LAXMAN",130,36);
		s[6]=new school("ROBOTICS01","SEETA",115,25);
		s[7]=new school("ISC01","ARJUNA",60,10);
		
	}
	void createobject1()
	{
		s1[0]=new school("1","Amit Sir",156,20);
		s1[1]=new school("2","Somshekar Sir",220,15);
		s1[2]=new school("3","aaa",142,45);
		s1[3]=new school("4","bbb",110,35);
	
		s1[4]=new school("5","ccc",11,41);
		s1[5]=new school("6","ddd",84,36);
		s1[6]=new school("7","eee",126,25);
		s1[7]=new school("8","fff",60,10);
		
	}
	void calculate()
	{
		int j;
		for(j=0;j<8;j++)
		{
			if(s[j].getiNo_of_students() > 120)
			{
				System.out.println("THE PROGRAM CODE : " + s[j].getsProgramCode() +" has exceeded MAX limit");
			}
			else
			{
				System.out.println("TOTAL STRENGTH of " + s[j].getsProgramCode() + " is " + s[j].getiNo_of_students() );
			}
		}
	}
	
	void calculate1()
	{
		int j;
		for(j=0;j<8;j++)
		{
			if(s1[j].getiNo_of_students() > 120)
			{
				System.out.println("THE PROGRAM CODE : " + s1[j].getsProgramCode() +" has exceeded MAX limit");
			}
			else
			{
				System.out.println("TOTAL STRENGTH of " + s1[j].getsProgramCode() + " is " + s1[j].getiNo_of_students() );
			}
		}
	}
	
	



}
