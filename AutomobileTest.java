import javax.swing.JOptionPane;


public class AutomobileTest {

	public static void main(String[] args) {
		
		Automobile automobile1 = new Automobile("Cabbie","Yellow", 4, 6,6);
		Automobile automobile2 = new Automobile("Sporty","Red", 2, 6,6);
		Automobile automobile3 = new Automobile("Vany","Green", 5, 6,6);
		
		JOptionPane.showMessageDialog(null, "-Automobile1 Attributes- "+automobile1);
		
		JOptionPane.showMessageDialog(null, "-Automobile2 Attributes- "+automobile2);
		
		JOptionPane.showMessageDialog(null, "-Automobile3 Attributes- "+automobile3);
	}

}
