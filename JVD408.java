
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class JVD408 extends JFrame {
	JTable myTable;
	JScrollPane myPanel;
	TableModel myModel;

	public JVD408() {

		setTitle("員工基本資料表");

		// 建立 Table Model
		myModel = new EmployeeTable();
		myTable = new JTable(myModel);
		myPanel = new JScrollPane(myTable);

		// 將表格物件和ScrollPanel加到JFrame物件上
		getContentPane().add(myPanel, "Center");

		// 設定每一個ROW的高度
		myTable.setRowHeight(25);

		// 初始ComboBox值，並加入表格中
		JComboBox c = new JComboBox();
		c.addItem("博士");
		c.addItem("碩士");
		c.addItem("學士");
		c.addItem("高中");
		/*
		 * ################################ 請在此處加上設定ComboBox的原始碼
		 * ################################
		 */
		TableColumnModel tt = myTable.getColumnModel();
		tt.getColumn(2).setCellEditor(new DefaultCellEditor(c));

		// 顯示JFrame
		setBounds(100, 100, 500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JVD408();
	}
}

// ***************自定表格模型*******************
class EmployeeTable extends AbstractTableModel {
	// 設定每一列的資料，設定欄位名稱
	/*
	 * ##################################### 請在此處加上設定Table原始資料的程式碼
	 * #####################################
	 */

	String header[] = { "員編", "姓名", "學歷", "性別", "備考" };
	Object object[][];

	public EmployeeTable() {
		object = new Object[][] {
				new Object[] { "1", "Evan", "碩士", Boolean.FALSE, "備考1" },
				new Object[] { "2", "Sam", "大學", Boolean.FALSE, "備考2" },
				new Object[] { "3", "Antia", "大學", Boolean.FALSE, "備考3" },
				new Object[] { "4", "James", "碩士", Boolean.TRUE, "備考4" },
				new Object[] { "5", "Jean", "碩士", Boolean.FALSE, "備考5" } };
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

	public void setValueAt(Object obj, int i, int j) {// 設定某個cell中的值
		object[i][j] = obj;
	}
	/*
	 * ##############################################################
	 * 請在此處加上顯示Table原始內容的程式碼，您可以考慮重寫下列方法： 一、getRowCount() 二、getColumnCount()
	 * 三、getValueAt() 四、getColumnClass 五、getColumnName 六、isCellEditable
	 * ##############################################################
	 */

}// end class
