/**
 * 
 */
package com.lockedme.navigation1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Himapriya_Tammineedi
 *
 */
public class SecondNavigationScreen {

	public void secondMenu(String path) {
		System.out.println("\n"+"......Please Enter an option to proceed............");
    	System.out.println("1. Add File \t 2. Delete File \t 3. Search File \t 4.Previous menu \t 5.Exit ");
		takeInput(path);
		
	}
	public void takeInput(String path) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		try {
		switch(input) {
		case 1:
			//Add File
			System.out.println("Enter the filename to be added");
			String filename = sc.next();
			AddFile af = new AddFile();
			af.addFile(filename,path);
			secondMenu(path);
			break;
		case 2:
			//delete file
			System.out.println("Enter the filename to be deleted from folder/subfodlers");
			List<String> result  = new ArrayList<String>() ;
			String dfname = sc.next();
			 File dir = new File(path);
			 if (dir.isDirectory()) {
				 SearchFile sf = new SearchFile();
				 sf.searchdir(dir,dfname);
						result =  sf.getResult();
				} 
			 if (result.size() == 0)
			 {
				 System.out.println("No file found to delete");
			 }else {
				    for (String matched : result){
					//delete file at all locations found
				    	DeleteFile df = new DeleteFile();
				    	df.deleteFile(matched);
				    }
			 }
			 secondMenu(path);
			break;
		case 3:
			//Search file in Locked folder
			System.out.println("Enter the filename to find the location");
			String sfname = sc.next();
			SearchFile sf = new SearchFile();
			sf.search(sfname, path);
			secondMenu(path);
			break;
		case 4:
			//previous menu
			InitialNavigationScreen in = new InitialNavigationScreen();
			in.initialMenu(path);
			break;
		case 5:
			//terminate program
			sc.close();
			System.exit(0);
			break;
	    default:
	    	//invalid input
	    	System.out.println("Invalid Option");
	    	secondMenu(path);
		}
	   }
		catch(Exception e){
			System.out.println("Invalid Input");
			secondMenu(path);
		}
		finally {
		sc.close();
		}
	}

}

