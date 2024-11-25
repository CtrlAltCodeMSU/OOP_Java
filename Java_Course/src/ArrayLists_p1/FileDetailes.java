package ArrayLists_p1;

import java.util.ArrayList;
import java.util.Scanner;

// Custom class to hold file details
class FileDetail {
	private String fileName;
	private String fileSize;
	private String fileType;

	public FileDetail(String fileName, String fileSize, String fileType) {
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public String getFileType() {
		return fileType;
	}
}

class FileManager {
	private ArrayList<FileDetail> files;

	public FileManager() {
		files = new ArrayList<>();
	}

	// Add a FileDetail object to the list
	public void addFile(String fileName, String fileSize, String fileType) {
		FileDetail fileDetail = new FileDetail(fileName, fileSize, fileType);
		files.add(fileDetail);
	}

	// Print all file details
	public void printFiles() {
		for (FileDetail file : files) {
			System.out.println("Name: " + file.getFileName() + ", Size: " + file.getFileSize() + ", Type: " + file.getFileType());
		}
	}
}

public class FileDetailes {
	public static void main(String[] args) {
		FileManager manager = new FileManager();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Details: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter fileName #" + (i + 1) + " : ");
			String name = in.nextLine();
			System.out.println("Enter fileSize #" + (i + 1) + " : ");
			String size = in.nextLine();
			System.out.println("Enter fileType #" + (i + 1) + " : ");
			String type = in.nextLine();

			manager.addFile(name, size, type);
		}

		System.out.println("Entered details are: ");
		manager.printFiles();
	}
}
