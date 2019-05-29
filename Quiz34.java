
public class Quiz34 {
	public static void main(String Args[])
	{
		String a="copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
		System.out.println("The number of characters the sentence have are: "+a.length());
		//part2
		String b= a.substring(a.length()-15);
		System.out.println("The last 15 characters of the string are: "+b);
		//part3
		String[] items;
		String z="";
		items =a.split(z);
		int count1=0,count2=0;
		for(int i=0; i< items.length;i++)
			{
			if(items[i].compareTo("c")==0)
				count1 +=1;
			if(items[i].compareTo("p")==0)
				count2 +=1;
			}
		System.out.println("The number of c's are: "+ count1);
		System.out.println("The number of p's are: "+ count2);
	}
}
