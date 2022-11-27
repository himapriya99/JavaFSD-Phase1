/**
 * 
 */
package com.lockedme.navigation1;
import java.io.*;
/**
 * @author Himapriya_Tammineedi
 *
 */
public class DeleteFile {
   public void deleteFile(String path) {
	   File currFile = new File(path);
	   File[] files = currFile.listFiles();

		if (files != null && files.length > 0) {
			for (File file : files) {

				String fileName = file.getName() + " at " + file.getParent();
				if (file.isDirectory()) {
					deleteFile(file.getAbsolutePath());
				}

				if (file.delete()) {
					System.out.println(fileName + " deleted successfully");
				} else {
					System.out.println("Failed to delete " + fileName);
				}
			}
		}

		String currFileName = currFile.getName() + " at " + currFile.getParent();
		if (currFile.delete()) {
			System.out.println("File " + currFileName + " deleted successfully");
		} else {
			System.out.println("Failed to delete " + currFileName);
	}

   }
}
