package NumberPrograms;

public class primeNumber {
	
	public static void main(String args[])
	{
	  int n =7;
	    int f=0;
	  for(int j=2;j<=n/2;j++)
		{
	          if(n%j==0)
	           {
	             f++;
	           break;
	             }
	           }   

	if(f>0){
	                System.out.println(n+"it is a prime number ");
	         }
	}
		
}
	
