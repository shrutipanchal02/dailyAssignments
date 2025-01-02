import java.util.Scanner;
public class decimaltobinary{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num,bnum=0,dnum,base=1,rem;
System.out.println("enter the decimal number");
num=sc.nextInt();
dnum=num;
while(num>0){
rem=num%2;
bnum=bnum+rem*base;
num=num/2;
base=base*10; 
}
System.out.println("decimal number :" +dnum);
System.out.println("binary number : " +bnum);
}
}
