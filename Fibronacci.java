package week1.day1;

public class Fibronacci {
public static void main(String[] args) {
	int firstNum=0,secNum=1,sum=0;
	System.out.println("Fibronacci series is"+"\n");

	
	for(int i=1;i<=56;i++)
	{
		System.out.println(firstNum);
		sum=firstNum+secNum;
		
		firstNum=secNum;    
		secNum=sum;
		
	}
	
}
}
