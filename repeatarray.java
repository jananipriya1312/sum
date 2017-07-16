package list;
import java.util.*;
public class repeatarray {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elemnts in an array:");
		int n=s.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			 array[i]=s.nextInt();
		}
		System.out.println("The repeating elements are:");
		for(int i=0;i<n;i++) {
			if(array[Math.abs(array[i])-1]>0) {
				array[Math.abs(array[i])-1]=-array[Math.abs(array[i])-1];
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
	}
