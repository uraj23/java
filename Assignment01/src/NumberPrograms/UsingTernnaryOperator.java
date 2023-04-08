package NumberPrograms;

public class UsingTernnaryOperator 
{

	public static void main(String[] args) 
	{
		//comparing two values and print highest number
		int a=10,b=20;
		int res2=a>b?a:b;
		System.out.println("comparing two values "+res2);
		
		//comparing three values and print highest number
		int a1=10,b1=40,c1=30;
		
		int res3=a1>b1?(a1>c1?a1:c1):(b1>c1?b1:c1);
		System.out.println("comparing three value "+res3);
		
		//comparing four values and print highest number
				int a2=10,b2=80,c2=30,d2=40;
				int res4=a2>b2?(a2>c2?(a2>d2?a2:d2):(c2>d2?c2:d2)):(b2>c2?(b2>d2?b2:d2):(c2>d2?c2:d2));
				//int var=a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c<d?c:d));
				System.out.println("comparing four values "+res4);
				
				//comparing five values and print highest number
				int a3=100,b3=30,c3=140,d3=60,e3=70;
				
				int res5=a3>b3?(a3>c3?(a3>d3?(a3>e3?a3:e3):(d3>e3?d3:e3)):(c3>d3?(c3>e3?c3:e3):(d3>e3?d3:e3)))
					:(b3>c3?(b3>d3?(b3>e3?b3:e3):(d3>e3?d3:e3)):(c3>d3?(c3>e3?c3:e3):(d3>e3?d3:e3)));
				System.out.println("comparing five values "+res5);

//					int var=a>b?(a>c?(a>d?(a>e?a:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e))):
				//	(b>c?(b>d?(b>e?b:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e)));
				//using && operator 
				int result=a3>b3&&a3>c3&&a3>d3&&a3>e3?a3:(b3>c3&&b3>d3&&b3>e3?b3:(c3>d3&&c3>e3?c3:(d3>e3?d3:e3)));
				System.out.println("comparing five values "+result);
				
				

	}

}
