package swing.frame;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CenterPanel extends JPanel {
	
	/*
	 * north panel
	 */
	JPanel northPanel = new JPanel();
	JLabel iterLabel = new JLabel("Iteration #:");
	JTextField iterTextField = new JTextField();
	
	
	
	/*
	 * center panel
	 */
	JPanel centerPanel = new JPanel();
	
	
	
	public CenterPanel(){
		
		setupNorthPanel();
		setupCenterPanel();
		
		this.setLayout(new BorderLayout());
		this.add(northPanel, BorderLayout.NORTH);
		this.add(centerPanel,BorderLayout.CENTER);
		
	}

	private void setupNorthPanel() {
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
		northPanel.add(iterLabel);
		northPanel.add(iterTextField);
	}


	private void setupCenterPanel() {
		
	}




	
	
}
