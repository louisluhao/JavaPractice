package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MidIterPopupFrame extends JFrame {
	
	JFrame mySelf;
	
	JPanel panel = new JPanel();
	
	/*
	 * top panel
	 */
	JPanel topPanel = new JPanel();
	ListPanel leftPanel = new ListPanel("Left");
	ListPanel rightPanel = new ListPanel("Right");
	
	/*
	 * buttom panel
	 */
	JPanel bottomPanel = new JPanel();
	JButton button = new JButton("confirm");
	
	
	public MidIterPopupFrame(){
		mySelf = this;
		
		this.getContentPane().add(panel);
		
		panel.setLayout(new BorderLayout());
		
		panel.add(topPanel, BorderLayout.CENTER);
		panel.add(bottomPanel, BorderLayout.SOUTH);
		
		GridLayout gridLayout = new GridLayout(1, 2);
		gridLayout.setHgap(10);
		topPanel.setLayout(gridLayout);
		topPanel.add(leftPanel);
		topPanel.add(rightPanel);
		
		bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		bottomPanel.add(button);
		
		this.setSize(600, 500);
		
		setActionListener();
	}
	
	private void setActionListener() {
		this.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				List<String> leftList = new ArrayList<String>();
				List<String> rightList = new ArrayList<String>();
				
				for(Object object : leftPanel.jlist.getSelectedValues()){
					leftList.add((String) object);
				}
				
				for(Object object : rightPanel.jlist.getSelectedValues()){
					rightList.add((String) object);
				}
				
				for(String test : leftList){
					System.out.println(test);
				}
				
				
				WindowEvent wev = new WindowEvent(mySelf, WindowEvent.WINDOW_CLOSING);
				Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
			}
		});
	}

//	public static void main(String[] args){
//		MidIterPopupFrame test = new MidIterPopupFrame();
//		test.setVisible(true);
//	}
}
