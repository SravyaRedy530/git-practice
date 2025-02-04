import java.util.Scanner;
public class Demo060 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the fibonacci series: ");
		int n=sc.nextInt();
		int z=20, firstNum=0, secondNum=1;
		int nextNum;
		for(int i=1;i<=z;i++){
			System.out.print(firstNum +", ");
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			}
		}
	}
