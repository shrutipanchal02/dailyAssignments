import java.util.Scanner;
public class armstrong{
public static void main(String[] args){
int rem,sum=0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int secnum=num;
while(num>0){
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==secnum){
System.out.println("The number is Armstrong");
}else{
System.out.println("The number is not Armstrong");
}
}
}

