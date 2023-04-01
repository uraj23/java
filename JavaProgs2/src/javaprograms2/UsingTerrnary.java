package javaprograms2;

public class UsingTerrnary {

	public static void main(String[] args) 
	{
		int a=10,b=20,c=25,d=12;
		int var=a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c<d?c:d));
		System.out.println(var);
	}

}
