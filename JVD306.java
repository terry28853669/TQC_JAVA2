
//306滑鼠感應視窗
import java.awt.*;
import java.awt.event.*;
public class JVD306 extends Frame implements MouseListener, MouseMotionListener {
	String msg = "", info = "Dragging";
	int x = 0, y = 0;
	public static void main(String arg[]) {
		JVD306 mew = new JVD306();
	}
	JVD306() {
		super("滑鼠感應視窗");
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
		// 請在此撰寫滑鼠移入事件
		setBackground(Color.yellow);
		x = me.getX();
		y = me.getY();
		repaint();
		// 請在此撰寫滑鼠移入事件
	}
	public void mouseExited(MouseEvent me) { // ok
		// 請在此撰寫滑鼠移出視窗事件
		setBackground(Color.white);
		x = me.getX();
		y = me.getY();
		repaint();
		// 請在此撰寫滑鼠移出視窗事件
	}
	public void mousePressed(MouseEvent me) { //
		// 請在此撰寫滑鼠按下事件
		msg = "Mouse is pressed at ";
		info = "DOWN";
		x = me.getX();
		y = me.getY();
		repaint();
		// 請在此撰寫滑鼠按下事件
	}

	public void mouseReleased(MouseEvent me) {
		// 請在此撰寫滑鼠放開事件
		msg = "Mouse is released frome ";
		info = "up";
		x = me.getX();
		y = me.getY();
		repaint();
		// 請在此撰寫滑鼠放開事件
	}

	public void mouseDragged(MouseEvent me) {
		// 請在此撰寫滑鼠拖曳事件
		msg = "Mouse is Dragging at ";
		info = "Dragging";
		x = me.getX();
		y = me.getY();
		repaint();
		// 請在此撰寫滑鼠拖曳事件
	}

	public void mouseMoved(MouseEvent me) {
		// 請在此撰寫滑鼠移動事件
		x = me.getX();
		y = me.getY();
		msg = "Mouse is moving at ";
		repaint();
		// 請在此撰寫滑鼠移動事件
	}

	public void paint(Graphics g) {
		// 請在此撰寫撰寫程式取得滑鼠座標
		g.drawString(msg + x + "," + y, 10, 40);
		g.drawString(info, x, y);

		// 請在此撰寫撰寫程式取得滑鼠座標
	}
}
