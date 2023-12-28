import java.io.*;

public class FileHandling {
	static String myFile = "C:\\Users\\Bablu\\EclipseWorkSpace\\PracticeProject3\\file1.txt";
	public static void main(String[] args) {
		fileWriting();
		fileAppending();
	}
	public static void fileWriting() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile);

			fw.write("By by 2023\n");
			fw.write("wel come 2024");

			System.out.println("Wrote 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println( );
		}
	//Reading from file
	
	try( BufferedReader reader = new BufferedReader(new FileReader(myFile))){
		String line;
		while ((line =reader.readLine()) != null){
			System.out.println("Read from file: "+line);
		}
	}catch(IOException e){
		e.printStackTrace();
		}
	System.out.println( );
	}
	

	public static void fileAppending() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile, true);

			fw.write("\n I am now appending this line\n");
			fw.write("This line too");

			System.out.println("Appended 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println( );
		}
	
	
	try( BufferedReader reader = new BufferedReader(new FileReader(myFile))){
		String line;
		while ((line =reader.readLine()) != null){
			System.out.println("Read from file: "+line);
		}
	}catch(IOException e){
		e.printStackTrace();
		}
	}

}