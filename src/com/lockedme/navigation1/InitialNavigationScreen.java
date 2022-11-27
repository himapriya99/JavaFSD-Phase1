/**
 * 
 */
package com.lockedme.navigation1;

import java.util.Scanner;

/**
 * @author Himapriya_Tammineedi
 * This class allows user to select input and do file operations
 *
 */
public class InitialNavigationScreen {
	
    public void initialMenu( String path) {
    	System.out.println("\n"+"......Please Enter an option to proceed............");
    	System.out.println("1. Disply Files \t 2. Other Operations \t 3. Exit ");
		takeInput(path);
    }
	public void takeInput(String path) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		try {
		switch(input) {
		case 1:
			DisplayFiles d = new DisplayFiles();
			d.display(path);
			initialMenu(path);
			break;
		case 2:
			SecondNavigationScreen sn = new SecondNavigationScreen();
			sn.secondMenu(path);
			break;
		case 3:
			//terminate program
			sc.close();
			System.exit(0);
			break;
	    default:
	    	//invalid input
	    	System.out.println("Invalid Option");
	    	initialMenu(path);
		}
		}
		catch(Exception e){
			System.out.println("Invalid Input");
			initialMenu(path);
		}
		finally {
		sc.close();
		}
	}

}
