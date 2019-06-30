import java.util.Scanner;
class Marathon2
{
 public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Participents:");
		int per = sc.nextInt();
		int [] ptime= new int[per];		
		int i=0;
		String[] pname = new String[per];
		System.out.println("Enter Name of the participents: ");
		for(i=0;i<per;i++)
		{pname[i]=sc.next();}
	    System.out.println("Enter Corressponding TIME of Participents:");
        for(i=0;i<per;i++)
		{ ptime[i]=sc.nextInt();}
		int winner= fastRunner(ptime);
		int run2 = secondRunnerup(ptime);
			        System.out.println("Fastest Runner: "+pname[winner]+":"+ptime[winner]+"(in minute)");
	        System.out.println("Second  RunnerUp: "+pname[run2]+":"+ptime[run2]+"(in minute)");
		}
 public static int fastRunner(int[] time)
    {

	  int j=0,i=0, cnt=time.length;
	  for(i=0;i<cnt;i++)
		{
		    if(time[i]<time[j])
				j=i;
		}



     return j;

	  }

public static int secondRunnerup(int[] time)
    {

	  int method1= fastRunner(time);
	  int i=0,run2=0,cnt=time.length;
	  for(i=0;i<cnt;i++)
		{
		    if(time[i]<time[run2] && i!=method1)
				run2=i;
		}

       return run2;
         
	 }

}