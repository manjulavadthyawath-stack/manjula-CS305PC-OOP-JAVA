import java.util.Scanner;
class Lab2P5{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=2;
		int count=0;
		while(i<=a){
			if(a%i==0){
				count++;
			}
			i++;
		}
		if(count==1){
			System.out.println(a +"is a prime number");
		}else{
			System.out.println(a +"is not a prime number");
		}
		s.close();
	}
}