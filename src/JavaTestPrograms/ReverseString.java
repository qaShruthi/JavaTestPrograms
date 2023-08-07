package JavaTestPrograms;
import java.io.*;
import java.util.Scanner;
public class ReverseString{

	public static void main(String[] args) {
		 String str = "Shruthi";
		 str = str.toLowerCase();
		 String rev= " ";
		// TODO Auto-generated method stub
		for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
            
        }
		System.out.println(rev);
		
//    System.out.println("Enter string to reverse:");
//		
//		Scanner read = new Scanner(System.in);
//		String str = read.nextLine();
//		String reverse = "";
//		
//		
//		for(int i = str.length() - 1; i >= 0; i--)
//		{
//			reverse = reverse + str.charAt(i);
//		}
//		
//		System.out.println("Reversed string is:");
//		System.out.println(reverse);
	}

}


