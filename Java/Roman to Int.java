import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Main obj=new Main();
		String s=sc.nextLine();
		System.out.println(obj.rtoi(s));
	}
	int values(char c){
	    if (c=='I'){
	        return 1;
	    }
	    if (c=='V'){
	        return 5;
	    }
	    if (c=='X'){
	        return 10;
	    }
	    if (c=='L'){
	        return 50;
	    }
	    if (c=='C'){
	        return 100;
	    }
	    if (c=='D'){
	        return 500;
	    }
	    if (c=='M'){
	        return 1000;
	    }
	    return -1;
	}
	int rtoi(String s){
	    int res=0;
	    int i=0;
	    while (i<s.length()){
	        int s1=values(s.charAt(i));
	        if ((i+1)<s.length()){
	            int s2=values(s.charAt(i+1));
	            if (s1>=s2){
	                res=res+s1;
	                i=i+1;
	            }
	            else{
	                res=res+s2-s1;
	                i=i+1;
	            }
	        }
	        else{
	            res=res+s1;
	            i=i+1;
	        }
	    }
	    return res;
	}
}