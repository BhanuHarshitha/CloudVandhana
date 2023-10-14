import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    a = a.replaceAll("", "");
	    a = a.toLowerCase();  
	    String b="";
	    for(char i='a';i<='z';i++){
	        if (a.indexOf(i)!=-1){
	            b=b+i;
	        }
	    }
	    System.out.println(b);
	    if (b.length()==26){
	        System.out.println("Pangram");
	    }
	    else{
	        System.out.println("Not Pangram");
	    }
	}
}
