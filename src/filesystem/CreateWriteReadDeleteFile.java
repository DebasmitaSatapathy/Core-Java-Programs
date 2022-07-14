package filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileOperation {

	String path = "C:\\Debasmita\\JavaPrograms\\CoreJava\\";
	public void createFile(String fileName) {
		
		File file = new File(path + fileName);
		try {
			if (file.createNewFile()) {
				System.out.println("File Created Successfully");
			} else {
				System.out.println(file.getName() + " already Exist");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void writeFile(String fileName) {

		File file = new File(path + fileName);

		if (file.exists()) {
			try {
				FileWriter writer = new FileWriter(file);
				writer.write("Rajveer is a good boy.");
				writer.close();
				System.out.println("File Write Operation Successful");
			} catch (IOException e) {
				System.out.println("Something Wrong in File Write Operation");
			}
		} else {
			System.out.println(file.getName() + " doesn't Exist, Plz create it to Write");
		}

	}
	
	public void readFile(String fileName) {

		File file = new File(path + fileName);

		if (file.exists()) {
			try {
				Scanner scanner = new Scanner(file);
				if(scanner.hasNextLine()) {
					System.out.println(fileName + " contains ..........");
					while(scanner.hasNextLine()) {
						System.out.println(scanner.nextLine());
					}
					scanner.close();
				}else {
					System.out.println(fileName + " has no data");
				}
				
			} catch (IOException e) {
				System.out.println("Something Wrong in File Read Operation");
			}
		} else {
			System.out.println(file.getName() + " doesn't Exist, Plz create it to Read");
		}
	}
	
	public void fileInfo(String fileName) {
		File file = new File(path + fileName);
		if(file.exists()) {
			System.out.println("File Name: " + file.getName());
			System.out.println("File Path: " + file.getAbsolutePath() );
			System.out.println("Is File Writable: " + file.canWrite());
			System.out.println("Is File Readable: " + file.canRead());
			System.out.println("File Size: " + file.length());
		}else {
			System.out.println(fileName + " doesn't exist");
		}
	}
	
	public void deleteFile(String fileName) {
		File file = new File(path + fileName);
		if(file.exists()) {
			file.delete();
			System.out.println(fileName + " deleted successfully");
		}else {
			System.out.println(fileName + " doesn't exist");
		}
	}
}

public class CreateWriteReadDeleteFile {

	public static void main(String[] args) {
		FileOperation fileOperaion = new FileOperation();		
		fileOperaion.createFile("demo.txt");
		fileOperaion.writeFile("demo.txt");
		fileOperaion.readFile("demo.txt");
		fileOperaion.fileInfo("demo.txt");
		fileOperaion.deleteFile("demo.txt");
	}

}
