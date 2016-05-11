//############################# JVA03.java ###############################
/*
 設計一個簡易繪圖板，畫布大小為400*200，並設定背景顏色為藍色
 拖曳滑鼠時，產生繪圖效果，並顯示滑鼠座標
 若按下"c"鍵，則設定畫筆為藍色，若按下其餘的按鍵，則設定畫筆為紅色
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JVD304 extends JFrame {
	int x, y, kcode;
	private JLabel label;
	public JVD304() {
		super("簡易繪圖板");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.white);
		c.add(label);
		
			
		addWindowListener(new MyListener());
		/*
		 * 請在此處加上程式碼，您必須
		 *  1、啟動物件來處理滑鼠及按鍵事件 
		 *  2、設定背景顏色 
		 *  3、設定JFrame大小並顯示
		 */
		/************************************************/
		addMouseMotionListener(new MouseMotion());
		addKeyListener(new KEvent());
		c.setBackground(Color.blue);
		label.setBackground(Color.GRAY);
		setSize(400, 200);
		setVisible(true);
		/************************************************/
	}

	// 處理程式關閉
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	// 滑鼠拖曳事件處理程式
	class MouseMotion extends MouseMotionAdapter {
		/*
		 * 請在此處加上程式碼，您必須 
		 * 1、顯示滑鼠座標
		 * 2、處理繪圖
		 */
		/************************************************/
		public void mouseDragged(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			label.setText("滑鼠座標：(x:" + x + "  y:" + y + ")");
			repaint();
		}
		public void mouseMoved(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			label.setText("滑鼠座標：(x:" + x + "  y:" + y + ")");
			//repaint();
		}
		/************************************************/
	}

	// 取得按鍵的字元
	class KEvent extends KeyAdapter {
		/*
		 * 請在此處加上程式碼，您必須 1、取得按鍵值
		 */
		/***********************************************/
		public void keyPressed(KeyEvent k) {
			kcode = k.getKeyCode();
		}
		/***********************************************/
	}

	// 判斷按鍵是否為"c"，若是則色筆為藍色，若否，則色筆為紅色，並繪製
	public void paint(Graphics g) {
		/*
		 * 請在此處加上程式碼，您必須 1、判斷按鍵，並設定畫筆顏色 2、繪圖
		 */
		/***********************************************/
		
		if (kcode == 67) {
			g.setColor(Color.blue);
			g.fillOval(x, y, 10, 10);			
		} else {
			g.setColor(Color.red);
			g.fillOval(x, y, 3, 3);
		}
		/***********************************************/
	}

	public static void main(String args[]) {
		new JVD304();
	}
}
