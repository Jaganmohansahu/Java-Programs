// Recursive Java program to print all files 
// in a folder(and sub-folders) 

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

class GFG 
{ 
	static void RecursivePrint(File[] arr, int level, String[] ext, List<Long> totLines) throws IOException 
	{ 			
		// for-each loop for main directory files 
		for (File f : arr) 
		{ 
			if(f.isFile()) 
			{
				String fileExt = getFileExtension(f);
				// System.out.println(f.getName());
				for(String e : ext)
				{
					if(e.equals(fileExt))
					{
						// tabs for internal levels 
						for (int i = 0; i < level; i++) 
							System.out.print("\t"); 
						
						System.out.print(f.getName());
						
						// get number of lines
						long lineCount = Files.lines(Paths.get(f.getAbsolutePath())).count(); 
						System.out.println(" (" + lineCount + ")");
						totLines.add(lineCount);
					}
				}
			}
			
			else if(f.isDirectory()) 
			{ 
				// tabs for internal levels 
				for (int i = 0; i < level; i++) 
					System.out.print("\t");
				
				System.out.println("[" + f.getName() + "]"); 
			
				// recursion for sub-directories 
				RecursivePrint(f.listFiles(), level + 1, ext, totLines); 
			} 
		} 		
	} 

	// Get the file extension
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return "." + fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	// Driver Method 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{ 
		// Total number of lines
		List<Long> totLines = new ArrayList<Long>();
		
		String maindirpath = null;
		System.out.println("Provide the file path: ");
		
		// Provide full path for directory(change accordingly) 
		Scanner sc = new Scanner(System.in);
		// maindirpath = "C:\\Users\\Jagan\\Desktop\\Test"; 
		maindirpath = sc.nextLine();
		
		// File object 
		File maindir = new File(maindirpath); 
		
		if(maindir.exists() && maindir.isDirectory()) 
		{ 
			// array for files and sub-directories 
			// of directory pointed by maindir 
			File arr[] = maindir.listFiles(); 
			// list of files to be search
			String ext[] = {".java",".html",".css",".js",".xml", ".properties", ".jsp"};

			System.out.println("============================"); 
			System.out.println("Files from main directory: " + maindir); 
			System.out.println("============================"); 
			
			// Calling recursive method 
			RecursivePrint(arr, 0, ext, totLines); 
			
			// Print total number of lines
			System.out.println("\nTotal no. of lines: " + totLines.stream().mapToLong(a -> a).sum());
		} 
	} 
} 