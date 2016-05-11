
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
		super("滑鼠感應視窗");
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
 		//請在此撰寫滑鼠移入事件
		setBackground(Color.YELLOW );
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseExited(MouseEvent me) {
 		//請在此撰寫滑鼠移出視窗事件
		setBackground(Color.WHITE );
		x=me.getX();
		y=me.getY();
		repaint();	

	}
	public void mousePressed(MouseEvent me) {
 		//請在此撰寫滑鼠按下事件
		msg="Mouse is preeed at";
		info="DOWN";
		x=me.getX();
		y=me.getY();
		repaint();		
	}
	public void mouseReleased(MouseEvent me) {
 		//請在此撰寫滑鼠放開事件
		msg="Mouse is released from ";
		info="UP";
		x=me.getX();
		y=me.getY();
		repaint();	
 		//請在此撰寫滑鼠放開事件
	}
	public void mouseDragged(MouseEvent me) {
 		//請在此撰寫滑鼠拖曳事件
		msg="Mouse is Dragging at ";
		info="Dragging";
		x=me.getX();
		y=me.getY();
		repaint();	

 		//請在此撰寫滑鼠拖曳事件
	}
	public void mouseMoved(MouseEvent me) {
 		//請在此撰寫滑鼠移動事件
		msg="Mouse is moving to ";
		x=me.getX();
		y=me.getY();
		repaint();	
 		//請在此撰寫滑鼠移動事件
	}
	public void paint(Graphics g) {
 		//請在此撰寫撰寫程式取得滑鼠座標
	g.drawString(msg+x+","+y, 10, 40);
	g.drawString(info,x,y);
 		//請在此撰寫撰寫程式取得滑鼠座標

	}
}