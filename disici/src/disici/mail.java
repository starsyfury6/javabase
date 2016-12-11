package disici;
import java.util.Scanner;
public class mail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=new String("2313231@qq.com");	
		if(a.contains("@")==false||a.contains(".")==false){
			System.out.println("cuowu");
		}
		
		if(a.lastIndexOf("@")<a.lastIndexOf(".")){
			System.out.println("cuowu");
		}
		
		
	}

}
