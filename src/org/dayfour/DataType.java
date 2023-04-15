package org.dayfour;

public class DataType 
{
 public void sample()
 {
//		      Byte  Bit	Memory Start	Memory End
//		Byte	1	8	128	            127
//		Short	2	16	32768	        32767
//		Int	    4	32	2147483648	    2147483647
//		Long	8	64	9.22337E+18	    9.22337E+18----->Use l for long at last
//		float	4	32	2147483648	    2147483647----->Use f for float at last 
//		Double	8	64	9.22337E+18	    9.22337E+18

	 byte age=127;
	 short empId= 678;
	 int rollnumber=2147483647;
	 long phno=9944465678l;
	 float salary=90000.34876566f;
	 double presalary=90000.563428273;
	 char gender='M';
	 String name="Suresh.S";
	 boolean marst=true;
	 
	 System.out.println("AGE :"+age);
	 System.out.println("EMP ID :"+empId);
	 System.out.println("ROLL NUMBER :"+rollnumber);
	 System.out.println("PHONE NUMBER :"+phno);
	 System.out.println("SALARY :"+salary);
	 System.out.println("PRESALARY :"+presalary);
	 System.out.println("GENDER :"+gender);
	 System.out.println("NAME :"+name);
	 System.out.println("MARRIAGE STATUS :"+marst);
	 
 }
 public static void main(String[] args) 
 {
	DataType d=new DataType();
	d.sample();
 }
}
