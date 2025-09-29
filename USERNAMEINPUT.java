/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package thobsapp.usernameinput;

import java.util.Scanner;
/**
 *
 * @author Thobile
 */
public class USERNAMEINPUT {

    public static void main(String[] args) {
        // This method create a scanner object
        Scanner scanner = new Scanner(System.in); 
        
        //This method ask the user for theirs name
        System.out.print("Please enter your name: "); 
        
        // This will read users input
        String name = scanner.nextLine(); 
        
        // This will print users input
        System.out.println("Hello, " + name + "!"); 
        
        // Close the scanner
        scanner.close(); // Close the scanner
    }
}
