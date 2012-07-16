package swing.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CenterPanel extends JPanel {
	
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
	
	ListPanel pSeedListPanel = new ListPanel("Positive Seed");
	ListPanel nSeedListPanel = new ListPanel("Negative Seed");
	
	JPanel rightPanel = new JPanel();
	ListPanel topRankListPanel = new ListPanel("Top Rank Seed");
	
	JPanel rightBottomPanel = new JPanel();
	JLabel precisionLabel = new JLabel("Precision:");
	JTextField precisionField = new JTextField();
	
	
	
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
	
	public void setIter(String iter){
		this.iterTextField.setText(iter);
	}


	private void setupCenterPanel() {
		
		GridLayout gridLayout = new GridLayout(1, 3);
		gridLayout.setHgap(10);
		
		
		centerPanel.setLayout(gridLayout);
		centerPanel.add(pSeedListPanel);
		centerPanel.add(nSeedListPanel);
		centerPanel.add(rightPanel);
		
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(topRankListPanel, BorderLayout.CENTER);
		rightPanel.add(rightBottomPanel, BorderLayout.SOUTH);
		
		rightBottomPanel.setLayout(new BoxLayout(rightBottomPanel, BoxLayout.Y_AXIS));
		rightBottomPanel.add(precisionLabel);
		rightBottomPanel.add(precisionField);
	}




	
	
}
