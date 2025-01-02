import java.util.Scanner;
public class binarytideci{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num,bnum,dnum=0,base=1,rem;
System.out.println("enter the binary number");
num=sc.nextInt();
bnum=num;
while(num>0){
rem=num%10;
dnum=dnum+rem*base;
num=num/10;
base=base*2; 
}
System.out.println("binary number : " +bnum);
System.out.println("decimal number :" +dnum);

}
}
