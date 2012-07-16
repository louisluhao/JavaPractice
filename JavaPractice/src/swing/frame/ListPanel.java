package swing.frame;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ListPanel extends JPanel {
	
	JLabel jlabel = new JLabel();
	JList jlist = new JList();
	
	public ListPanel(String label){
		this.setLayout(new BorderLayout());
		jlabel.setText(label);
		this.add(jlabel,BorderLayout.NORTH);
		this.add(jlist,BorderLayout.CENTER);
	}
	
	public void setList(List<String> lists){
		DefaultListModel model = new DefaultListModel();
		
	}
}
