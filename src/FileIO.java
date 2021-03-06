import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
	
	
	public FileIO(){
		
		String line;
		try{
			File f = new File("level1.txt");
			BufferedReader inFile = new BufferedReader(new FileReader(f));
			int i=0;
			while((line = inFile.readLine()) != null){
				//System.out.println(line);
				line.trim();
				if ( (i == 0) && (line.charAt(1)==' ') ){
					/* the header of the input file --  rows x columns */
					
					Layout.setRows(  Character.getNumericValue(line.charAt(0)) );
					Layout.setCols(  Character.getNumericValue(line.charAt(3)) );
		
				}
				else{
					/* input file body */
					System.out.println(line);
				}
				i++;
			}
			inFile.close();
		}catch(IOException e){
			System.err.println("File not found... :(");
		}	
	}
}