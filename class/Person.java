class Person
{
   public void per()
   {
	   System.out.println("Person");
   }
}
class Student extends Person
{
	public void stud()
	{
		 System.out.println("Student accesing Person class");
    }
}
class Employee extends Person
{
	public void emp()
	{
		 System.out.println("Employee accesing person class");
    }
}
class Undergraduate extends Student
{
	public void und()
	{
	    System.out.println("Undergraduate class accesing Students class");
    }
}  
class Graduate extends Student 
{
	public void gra()
	{
	 System.out.println("Graduate accesing student class");
	}
}
class Faculty extends Employee
{
	public void fac()
	{
		 System.out.println("Faculty accesing Employee class ");
    }
}
class Staff extends Employee
{
	public void staf()
	{
		 System.out.println("Staff class accesing Employee class ");
	}
}
class Masters extends Graduate
{
	public void mast()
	{
		System.out.println("Master class accesing Graduate class");
	}
}
class Doctoral extends Graduate
{
	public void doc()
	{
		System.out.println("Doctoral class accesing Graduate class");
	}
}
class Nondegree extends Graduate
{
	public void nond()
	{
		System.out.println("Non-Degree class accesing Graduate class ");
	}
}

class Personmain
{
	public static void main(String args[])
	{
		Graduate g=new Graduate();
	    g.per();
		g.stud();
		Undergraduate un=new Undergraduate();
		un.per();
		un.stud();
		Doctoral d=new Doctoral();
		d.gra();
		d.stud();
		d.per();
		Masters ms=new Masters();
		ms.gra();
		ms.stud();
		ms.per();
		Nondegree no=new Nondegree();
		no.gra();
		no.stud();
		no.per();
		Faculty f=new Faculty();
		f.emp();
		f.per();
		Staff s=new Staff();
		s.emp();
		s.per();
	}
}