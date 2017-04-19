/** Deletes existing .class files from folder
 *  Program Name: DeleteClass.java 
 *  Date: 2017.04.10
 *  @author Peter Lam Quach
 */

// importing
import java.io.File;

// main class
public class DeleteClass
{
	// main method
	public static void main(String[] args) 
	{
		// get current dir
        File directory = new File(System.getProperty("user.dir"));
		
        // get all the files together
        File[] listOfFiles = directory.listFiles();
		// loop through all files
        for (int i = 0; i < listOfFiles.length; i++)
		{
			// convert to string
			String fileName = listOfFiles[i].toString();
			
			// check extension
			if (fileName.endsWith(".class")) 
			{
				// deletes the file
				boolean success = (new File(fileName).delete());
			}
        }
	}
}
