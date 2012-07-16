package swing.frame;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private JPanel panel = new JPanel();
	private TopPanel topPanel = new TopPanel();
	private CenterPanel centerPanel = new CenterPanel();
	
	public MainFrame(){
		
		BorderLayout panelManager = new BorderLayout();
		panelManager.setVgap(15);
		panel.setLayout(panelManager);
		this.getContentPane().add(panel);
		
		panel.add(topPanel, BorderLayout.NORTH);
		panel.add(centerPanel,BorderLayout.CENTER);
		
		this.setSize(1000,600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
	}
}
