package Inheritance_P3;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
class TeamName {
	protected String teamName;

	public TeamName(String teamName){
		this.teamName = teamName;
	}

	public void displayTeam(){
		System.out.println("Team Name: " + teamName);
	}
}
class FootballTeam extends TeamName{
	private ArrayList<String> teamMember ;

	public FootballTeam(String teamName , ArrayList<String> teamMember){
		super(teamName);
		this.teamMember = teamMember;
	}
	public void diplayPlayers(){
		super.displayTeam();
		for (String play : teamMember){
			System.out.println(" - " + play);
		}
	}
}

public class myTeam {
	public static void main(String[] args) {
		ArrayList<String> playerList = new ArrayList<>();
		playerList.addAll(Arrays.asList("John" , "Mike" , "Sarah" , "Micheal" , "Shade"));

		FootballTeam myTeam = new FootballTeam("Eagles" , playerList);
		myTeam.diplayPlayers();

	}

}
