
import java.awt.*;
import java.awt.event.*;
class JVD306D extends Frame implements MouseListener, MouseMotionListener {
	String msg="", info="Dragging";
	int mouseX=0, mouseY=0 ;
	int x,y;
	public static void main(String arg[]){
		JVD306D mew=new JVD306D();
	}
	JVD306D() {
		super("�ƹ��P������");
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		setBackground(Color.white);
		setSize(250,200);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
 		//�Цb�����g�ƹ����J�ƥ�
		setBackground(Color.YELLOW );
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseExited(MouseEvent me) {
 		//�Цb�����g�ƹ����X�����ƥ�
		setBackground(Color.WHITE );
		x=me.getX();
		y=me.getY();
		repaint();	

	}
	public void mousePressed(MouseEvent me) {
 		//�Цb�����g�ƹ����U�ƥ�
		msg="Mouse is preeed at";
		info="DOWN";
		x=me.getX();
		y=me.getY();
		repaint();		
	}
	public void mouseReleased(MouseEvent me) {
 		//�Цb�����g�ƹ���}�ƥ�
		msg="Mouse is released from ";
		info="UP";
		x=me.getX();
		y=me.getY();
		repaint();	
 		//�Цb�����g�ƹ���}�ƥ�
	}
	public void mouseDragged(MouseEvent me) {
 		//�Цb�����g�ƹ��즲�ƥ�
		msg="Mouse is Dragging at ";
		info="Dragging";
		x=me.getX();
		y=me.getY();
		repaint();	

 		//�Цb�����g�ƹ��즲�ƥ�
	}
	public void mouseMoved(MouseEvent me) {
 		//�Цb�����g�ƹ����ʨƥ�
		msg="Mouse is moving to ";
		x=me.getX();
		y=me.getY();
		repaint();	
 		//�Цb�����g�ƹ����ʨƥ�
	}
	public void paint(Graphics g) {
 		//�Цb�����g���g�{�����o�ƹ��y��
	g.drawString(msg+x+","+y, 10, 40);
	g.drawString(info,x,y);
 		//�Цb�����g���g�{�����o�ƹ��y��

	}
}