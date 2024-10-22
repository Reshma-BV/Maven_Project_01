package mavenprogram;

public class MavenClass
{
	static int a=10;
	void add()
	{
		int a=10;
		int b=25;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		System.out.println(a);
		MavenClass obj=new MavenClass();
		obj.add();
	}

}