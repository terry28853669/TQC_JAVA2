
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class JVD408 extends JFrame {
	JTable myTable;
	JScrollPane myPanel;
	TableModel myModel;

	public JVD408() {

		setTitle("���u�򥻸�ƪ�");

		// �إ� Table Model
		myModel = new EmployeeTable();
		myTable = new JTable(myModel);
		myPanel = new JScrollPane(myTable);

		// �N��檫��MScrollPanel�[��JFrame����W
		getContentPane().add(myPanel, "Center");

		// �]�w�C�@��ROW������
		myTable.setRowHeight(25);

		// ��lComboBox�ȡA�å[�J��椤
		JComboBox c = new JComboBox();
		c.addItem("�դh");
		c.addItem("�Ӥh");
		c.addItem("�Ǥh");
		c.addItem("����");
		/*
		 * ################################ �Цb���B�[�W�]�wComboBox����l�X
		 * ################################
		 */
		TableColumnModel tt = myTable.getColumnModel();
		tt.getColumn(2).setCellEditor(new DefaultCellEditor(c));

		// ���JFrame
		setBounds(100, 100, 500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JVD408();
	}
}

// ***************�۩w���ҫ�*******************
class EmployeeTable extends AbstractTableModel {
	// �]�w�C�@�C����ơA�]�w���W��
	/*
	 * ##################################### �Цb���B�[�W�]�wTable��l��ƪ��{���X
	 * #####################################
	 */

	String header[] = { "���s", "�m�W", "�Ǿ�", "�ʧO", "�Ʀ�" };
	Object object[][];

	public EmployeeTable() {
		object = new Object[][] {
				new Object[] { "1", "Evan", "�Ӥh", Boolean.FALSE, "�Ʀ�1" },
				new Object[] { "2", "Sam", "�j��", Boolean.FALSE, "�Ʀ�2" },
				new Object[] { "3", "Antia", "�j��", Boolean.FALSE, "�Ʀ�3" },
				new Object[] { "4", "James", "�Ӥh", Boolean.TRUE, "�Ʀ�4" },
				new Object[] { "5", "Jean", "�Ӥh", Boolean.FALSE, "�Ʀ�5" } };
	}

	public int getRowCount() {
		return object.length;
	}

	public int getColumnCount() {
		return object[0].length;
	}

	public Object getValueAt(int i, int j) {
		return object[i][j];
	}

	public Class getColumnClass(int j) {
		return object[0][j].getClass();
	}

	public String getColumnName(int j) {
		return header[j];
	}

	public boolean isCellEditable(int i, int j) {
		if (j == 2 || j == 3) {
			return true;
		}
		return false;
	}

	public void setValueAt(Object obj, int i, int j) {// �]�w�Y��cell������
		object[i][j] = obj;
	}
	/*
	 * ##############################################################
	 * �Цb���B�[�W���Table��l���e���{���X�A�z�i�H�Ҽ{���g�U�C��k�G �@�BgetRowCount() �G�BgetColumnCount()
	 * �T�BgetValueAt() �|�BgetColumnClass ���BgetColumnName ���BisCellEditable
	 * ##############################################################
	 */

}// end class
