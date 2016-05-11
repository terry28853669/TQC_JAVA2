//############################# JVA03.java ###############################
/*
 �]�p�@��²��ø�ϪO�A�e���j�p��400*200�A�ó]�w�I���C�⬰�Ŧ�
 �즲�ƹ��ɡA����ø�ϮĪG�A����ܷƹ��y��
 �Y���U"c"��A�h�]�w�e�����Ŧ�A�Y���U��l������A�h�]�w�e��������
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JVD304 extends JFrame {
	int x, y, kcode;
	private JLabel label;
	public JVD304() {
		super("²��ø�ϪO");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.white);
		c.add(label);
		
			
		addWindowListener(new MyListener());
		/*
		 * �Цb���B�[�W�{���X�A�z����
		 *  1�B�Ұʪ���ӳB�z�ƹ��Ϋ���ƥ� 
		 *  2�B�]�w�I���C�� 
		 *  3�B�]�wJFrame�j�p�����
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

	// �B�z�{������
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	// �ƹ��즲�ƥ�B�z�{��
	class MouseMotion extends MouseMotionAdapter {
		/*
		 * �Цb���B�[�W�{���X�A�z���� 
		 * 1�B��ܷƹ��y��
		 * 2�B�B�zø��
		 */
		/************************************************/
		public void mouseDragged(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			label.setText("�ƹ��y�СG(x:" + x + "  y:" + y + ")");
			repaint();
		}
		public void mouseMoved(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			label.setText("�ƹ��y�СG(x:" + x + "  y:" + y + ")");
			//repaint();
		}
		/************************************************/
	}

	// ���o���䪺�r��
	class KEvent extends KeyAdapter {
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B���o�����
		 */
		/***********************************************/
		public void keyPressed(KeyEvent k) {
			kcode = k.getKeyCode();
		}
		/***********************************************/
	}

	// �P�_����O�_��"c"�A�Y�O�h�ⵧ���Ŧ�A�Y�_�A�h�ⵧ������A��ø�s
	public void paint(Graphics g) {
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B�P�_����A�ó]�w�e���C�� 2�Bø��
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
