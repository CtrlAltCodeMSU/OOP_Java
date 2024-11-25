package ArrayLists_p1;
import java.util.ArrayList;
import java.util.Scanner;
class fileManager {
	private ArrayList<String[]> files;

	public fileManager() {
		files = new ArrayList<>();
	}

	public void addFile(String fileName, String fileSize, String fileType) {
		String[] fileDatail = {fileName, fileSize, fileType};
		files.add(fileDatail);
	}

	public void printFiles() {
		for (String[] file : files) {
			System.out.println("Name: " + file[0] + ", Size: " + file[1] + ", Type: " + file[2]);
		}
	}
}
	public class P3{
		public static void main(String[] args) {
			fileManager manager = new fileManager();
			ArrayList<String[]> files = new ArrayList<>();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Details: ");
			for (int i = 0 ; i < 2 ; i++){
				System.out.println("Enter fileName #" + (i+1) + " : ");
				String name = in.nextLine();
				System.out.println("Enter fileSize #" + (i+1) + " : ");
				String size = in.nextLine();
				System.out.println("Enter fileType #" + (i+1) + " : ");
				String type = in.nextLine();

				manager.addFile(name , size , type);

			}
			System.out.println("Entered details are: ");
			manager.printFiles();
		}
	}
