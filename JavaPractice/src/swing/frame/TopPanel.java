package swing.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TopPanel extends JPanel {
	JLabel label = new JLabel("number:");
	JTextField textField = new JTextField();
	JButton button = new JButton("confirm");
	
	public TopPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(label);
		this.add(textField);
		this.add(button);
		
		setComponentsSize();
		setActionListener();
	}

	private void setActionListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bom!");
			}
		});
	}

	private void setComponentsSize() {
		label.setSize(300, 100);
		textField.setSize(300, 100);
		button.setSize(300, 100);
	}
}
