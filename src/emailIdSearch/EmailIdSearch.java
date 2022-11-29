package emailIdSearch;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class EmailIdSearch 
{
	public static void main(String[] args) 
	{
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("apple@gmail.com");
        emailID.add("banana@gmail.com");
        emailID.add("cucumber@gmail.com");
        emailID.add("dart@gmail.com");
        emailID.add("elephant@gmail.com");
        emailID.add("fruit@gmail.com");
        emailID.add("group@gmail.com");
        
         // new code
        String searchElement;
        System.out.println("E-mail: ");
        Scanner scanner = new Scanner(System.in);
        searchElement = scanner.nextLine();
        String regex = "^(.+)@(.+)$";
        Matcher matcher = Pattern.compile(regex).matcher(searchElement);
        if (matcher.matches() && emailID.stream().anyMatch(mail -> mail.equals(searchElement))) {
            System.out.println(searchElement + " = is present");
        } else {
            System.out.println("Not a valid or is not present");
        }
	}
}
