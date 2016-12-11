package disici;
import java.util.*;
public class charu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String [7];
		for (int i=0;i<7;i++){
			a[i]=(i+1)+"";
			System.out.print(a[i]);
			if(i!=(a.length-1)){
				System.out.print(",");
			}
			
		}
		System.out.println("charuzhi");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println("charuweizhi");
		Scanner sc2=new Scanner(System.in);
		int i=sc2.nextInt();
		String b[]=new String [7+n.length()];
		for(int m=0;m<i;m++){
			b[m]=a[m];
		}
		for(int m=0;m<i;m++){
			b[m]=a[m];
		}
		

	}

}
