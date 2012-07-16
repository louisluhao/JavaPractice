package swing.frame;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SeedInputFrame extends JFrame {

	JPanel panel = new JPanel();
	List<JPanel> textPanels = new ArrayList<JPanel>();
	JButton confirmButton = new JButton("        Confirm        ");
	
	public SeedInputFrame(int seedNum){
		this.getContentPane().add(panel);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < seedNum; i++){
			TextPanel newTextPanel = new TextPanel(i+1);
			textPanels.add(newTextPanel);
			panel.add(newTextPanel);
		}
		panel.add(confirmButton);
		
		setActionListener();
		
		this.setSize(300, 40*(seedNum+1));
		this.setVisible(true);
	}
	
	private void setActionListener() {
		
	}

//	public static void main(String[] args) {
//		SeedInputFrame seedInputFrame = new SeedInputFrame(5);
//		seedInputFrame.setVisible(true);
//	}
	
	class TextPanel extends JPanel{
		
		public JLabel label = new JLabel();
		public JTextField textField = new JTextField();
		
		public TextPanel(int num){
			this.label.setText("Seed #" + String.valueOf(num) + " :");
			this.label.setSize(100,60);
			this.textField.setSize(200,60);
			
			this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			this.add(label);
			this.add(textField);
			
		}
	}

}
