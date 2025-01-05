package listaSemanal11;

import javax.swing.UIManager;

public class ReproduzirJanela {

	public static void main(String[] args) {
		 try {
	            
	            // setTheme(String themeName, String licenseKey, String logoString)
	            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Black", "INSERT YOUR LICENSE KEY HERE", "my company");
	            
	            // select the Look and Feel
	            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	            
	            // start the demo application
	            new JanelaPadrão();
	            
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
		

	}

}
