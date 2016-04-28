import javax.swing.JOptionPane;


public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobile automobile1 = new Automobile("Yellow", 4, 6,6);
		Automobile automobile2 = new Automobile("Red", 2, 6,6);
		Automobile automobile3 = new Automobile("Green", 5, 6,6);
		
		automobile1.setName("Cabbie");
		JOptionPane.showMessageDialog(null, "-Automobile1 Attributes- "+automobile1);
		
		automobile2.setName("Sporty");
		JOptionPane.showMessageDialog(null, "-Automobile2 Attributes- "+automobile2);
		
		automobile3.setName("Vany");
		JOptionPane.showMessageDialog(null, "-Automobile3 Attributes- "+automobile3);
	}

}
