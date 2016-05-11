
//306�ƹ��P������
import java.awt.*;
import java.awt.event.*;
public class JVD306 extends Frame implements MouseListener, MouseMotionListener {
	String msg = "", info = "Dragging";
	int x = 0, y = 0;
	public static void main(String arg[]) {
		JVD306 mew = new JVD306();
	}
	JVD306() {
		super("�ƹ��P������");
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		setBackground(Color.white);
		setSize(250, 200);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent me) {
	}
	public void mouseEntered(MouseEvent me) { // ok
		// �Цb�����g�ƹ����J�ƥ�
		setBackground(Color.yellow);
		x = me.getX();
		y = me.getY();
		repaint();
		// �Цb�����g�ƹ����J�ƥ�
	}
	public void mouseExited(MouseEvent me) { // ok
		// �Цb�����g�ƹ����X�����ƥ�
		setBackground(Color.white);
		x = me.getX();
		y = me.getY();
		repaint();
		// �Цb�����g�ƹ����X�����ƥ�
	}
	public void mousePressed(MouseEvent me) { //
		// �Цb�����g�ƹ����U�ƥ�
		msg = "Mouse is pressed at ";
		info = "DOWN";
		x = me.getX();
		y = me.getY();
		repaint();
		// �Цb�����g�ƹ����U�ƥ�
	}

	public void mouseReleased(MouseEvent me) {
		// �Цb�����g�ƹ���}�ƥ�
		msg = "Mouse is released frome ";
		info = "up";
		x = me.getX();
		y = me.getY();
		repaint();
		// �Цb�����g�ƹ���}�ƥ�
	}

	public void mouseDragged(MouseEvent me) {
		// �Цb�����g�ƹ��즲�ƥ�
		msg = "Mouse is Dragging at ";
		info = "Dragging";
		x = me.getX();
		y = me.getY();
		repaint();
		// �Цb�����g�ƹ��즲�ƥ�
	}

	public void mouseMoved(MouseEvent me) {
		// �Цb�����g�ƹ����ʨƥ�
		x = me.getX();
		y = me.getY();
		msg = "Mouse is moving at ";
		repaint();
		// �Цb�����g�ƹ����ʨƥ�
	}

	public void paint(Graphics g) {
		// �Цb�����g���g�{�����o�ƹ��y��
		g.drawString(msg + x + "," + y, 10, 40);
		g.drawString(info, x, y);

		// �Цb�����g���g�{�����o�ƹ��y��
	}
}
