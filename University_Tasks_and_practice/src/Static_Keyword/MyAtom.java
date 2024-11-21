package Static_Keyword;
class Atom{
	private int protons;
	private int neutrons;
	private int electrons;

	public Atom(){
		this.protons = 1 ;
		this.neutrons = 0 ;
		this.electrons = 1 ;
	}

	public void setProtons(){
		if (protons>=1){
			this.protons = protons;
		}
		else {
			System.out.println("Prontons cannot be Negative");
		}
	}
	public int getProtons(){
		return protons;
	}

	public void setNeutrons(){
		if (neutrons>=1){
			this.neutrons = neutrons;
		}
		else {
			System.out.println("neutrons cannot be Negative");
		}
	}
	public int getNeutrons(){
		return neutrons;
	}
	public void setElectrons(){
		if (electrons>=1){
			this.electrons = electrons;
		}
		else {
			System.out.println("electrons cannot be Negative");
		}
	}
	public int getElectrons(){
		return electrons;
	}

	public boolean isIon(){
		if (electrons!=protons){
			return true;
		}
		return false;
	}
	public int getAtomicMassNumber(){
		return protons+neutrons;
	}
}
public class MyAtom {
	public static void main(MyString[] args) {
		Atom hydrogen = new Atom();
		System.out.println("Hydrogen:");
		System.out.println("Protons: " + hydrogen.getProtons());
		System.out.println("Neutrons: " + hydrogen.getNeutrons());
		System.out.println("Electrons: " + hydrogen.getElectrons());
		System.out.println("Is Ion: " + hydrogen.isIon());
		System.out.println("Atomic Mass Number: "+hydrogen.getAtomicMassNumber());
	}

}
