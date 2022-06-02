package staticmethood;

public class staticmethod {
static int j=100;
int n=200;
static void a()
{
     int a=200;
	System.out.println("print from a");
	//n=100;
	//a2();
// System.out.println(super.j);
}
void a2()//instance
{
	System.out.println("inside a2");
}
public static void main(String[] args)
{
	staticmethod ob1=new staticmethod();
	 ob1. a2();
	 staticmethod. a();
}
}
