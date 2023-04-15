


public class CallMethodInsideClass 
{
  public void StaffId()
  {
	  System.out.println("Employee Id : GFT-678");
  }
  public void StaffName()
  {
	  System.out.println("Employee Name : Suresh.S");
  }
  public static void main(String[] args) 
  {
	CallMethodInsideClass n = new CallMethodInsideClass();
	n.StaffId();
	n.StaffName();
  }
}