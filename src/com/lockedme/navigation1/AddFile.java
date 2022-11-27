/**
 * 
 */
package com.lockedme.navigation1;
import java.nio.file.*;
/**
 * @author Himapriya_Tammineedi
 *
 */
public class AddFile {
 public void addFile(String fname, String path) {
	 Path abpath = Paths.get(path + "/" + fname);
	 try {
			Files.createDirectories(abpath.getParent());
			Files.createFile(abpath);
			System.out.println("File " + fname + " created successfully");
		} catch (Exception e) {
			System.out.println("File creation Failed");
		}
 }
}
