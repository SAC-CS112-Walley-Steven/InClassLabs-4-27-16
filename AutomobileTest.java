import javax.swing.JOptionPane;


public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobile automobile1 = new Automobile(4,6,6, "Cabbie");
		Automobile automobile2 = new Automobile(2,6,6, "Sporty");
		Automobile automobile3 = new Automobile(5,6,5, "Vany");
		
		JOptionPane.showMessageDialog(null, automobile1);
		JOptionPane.showMessageDialog(null, automobile2);
		JOptionPane.showMessageDialog(null, automobile3);
	}

}