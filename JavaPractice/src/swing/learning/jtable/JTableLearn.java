package swing.learning.jtable;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;

public class JTableLearn extends JPanel {
	static Logger logger = Logger.getLogger(JTableLearn.class);

	public JTableLearn() {
		super(new GridLayout(1, 0));

	}

	class MyTableModel extends AbstractTableModel {
		private String[] columnNames = { "First Name", "Last Name", "Sport",
				"# of Years", "Vegetarian" };
		private Object[][] data = {
				{ "Kathy", "Smith", "Snowboarding", new Integer(5),
						new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2),
						new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20),
						new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } };

		public final Object[] longValues = { "Jane", "Kathy",
				"None of the above", new Integer(20), Boolean.TRUE };

		@Override
		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			return data.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			return getValueAt(0, columnIndex).getClass();
		}
		
		
		
		
	}

	public static void main(String[] args) {

	}

}
