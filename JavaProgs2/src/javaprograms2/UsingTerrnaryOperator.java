package javaprograms2;

public class UsingTerrnaryOperator {

	public static void main(String[] args) 
	{
		int a=10,b=91,c=90,d=40,e=70;
		//int var=a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
		
		int var=a>b?(a>c?(a>d?(a>e?a:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e))):
			
			(b>c?(b>d?(b>e?b:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e)));
		
	int var2=a>b&&a>c&&a>d&&a>e?a:(b>c&&b>d&&b>e?b:(c>d&&c>e)?c:d>e?d:e);
		System.out.println("highest value "+var2);
		System.out.println("highest value "+var);
	}

}
