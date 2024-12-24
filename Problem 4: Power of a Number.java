import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int power=1,base,exp,i;
		base = sc.nextInt();
		exp = sc.nextInt();
		for(i=1;i<=exp;i++)
		{
			power = power * base;
		}
		System.out.println(power);
    }
}
