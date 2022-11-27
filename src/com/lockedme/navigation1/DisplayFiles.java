/**
 * 
 */
package com.lockedme.navigation1;
import java.io.File;
import java.util.*;

/**
 * @author Himapriya_Tammineedi
 *This class allows user to display files in directory 
 */
public class DisplayFiles {
	  
	public void display(String path) {
			File dir = new File(path);
			listFiles(dir);
		}
		
    public void listFiles(File fobj) {
    	File a[] = fobj.listFiles();
        List<File> files = Arrays.asList(a);
        Collections.sort(files);
    	if ( a.length >0 ) {
    		System.out.println("Displaying Files from the directory- " + fobj.getPath());  
        	printFileNames(files,0,0);
    	}
    	else {
    		System.out.println("Directory is Empty");
    	}
    	
    }
	
	public void printFileNames(List<File> a, int i, int lvl)  
	{  
	if(i == a.size())  
	{  
	return;  
	}  
	for (int j = 0; j < lvl; j++)  
	{  
	System.out.print("\t");  
	}  

	if(a.get(i).isFile())  
	{  
	System.out.println(a.get(i).getName());  
	}  
	// for sub-directories  
	else if(a.get(i).isDirectory())  
	{  
	System.out.println("[" + a.get(i).getName() + "]");  
	// recursion for sub-directories  
    	File[]f = a.get(i).listFiles();
	    List<File> sfile = Arrays.asList(f);
	   printFileNames(sfile, 0, lvl + 1);  
	}  
	// recursively printing files from the directory  
	// i + 1 means look for the next file  
	printFileNames(a, i + 1, lvl);  
	}  
}
