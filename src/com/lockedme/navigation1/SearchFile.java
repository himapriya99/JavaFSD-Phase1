/**
 * 
 */
package com.lockedme.navigation1;

import java.io.*;
import java.util.*;


/**
 * @author Himapriya_Tammineedi
 *
 */
public class SearchFile {
	private List<String> result = new ArrayList<String>();
	public List<String> getResult() {
		return result;
	  }
	 public void search(String fname, String path) {
		 
		 File dir = new File(path);
		 if (dir.isDirectory()) {
			    searchdir(dir,fname);
			} 
		 if (result.size() == 0)
		 {
			 System.out.println("No result found");
		 }else {
			 System.out.println("Found file at below location(s)");
			    for (String matched : result){
				System.out.println(matched);
			    }
		 }
	 }
	 public void searchdir(File file, String fname) {
		 if (file.isDirectory()) {
				
				for (File temp : file.listFiles()) {
				    if (temp.isDirectory()) {
					searchdir(temp,fname);
				    } else {
					if (fname.equals(temp.getName())) {			
					    result.add(temp.getAbsoluteFile().toString());
				    }

				}
			    }
		      }

		 
	 }
}
