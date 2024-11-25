package ArrayLists_p1;

import java.util.ArrayList;
import java.util.Scanner;
class Music {
	private ArrayList<String[]> files;

	public Music(){
		files = new ArrayList<>();
	}
	public void addFiles(String fn , String fs ){
		String[] detail = {fn , fs};
		files.add(detail);
	}

	public void listdetail(int index){
		if (index>=0 && index < files.size()){
			String[] detail = files.get(index);
				System.out.println("File name: " + detail[0]);
				System.out.println("File Size: " + detail[1]);
			}
		else {
			System.out.println("Invalid Index!");
		}
	}
}
public class Music1{
	public static void main(String[] args) {
		Music m1 = new Music();
		Scanner sc = new Scanner(System.in);

		System.out.println("Add detail: ");
		for (int i = 0 ; i < 4 ; i++){
			System.out.println("Enter name #" + (i+1) + ": ");
			String name = sc.nextLine();
			System.out.println("Enter size #" + (i+1) + ": ");
			String size = sc.nextLine();

			m1.addFiles(name, size);
		}
		System.out.println("for list enter index: ");
		int ind = sc.nextInt();
		m1.listdetail(ind);
	}
}
