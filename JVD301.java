import java.awt.*;
import java.awt.event.*;

public class JVD301 implements TextListener {
	TextField input = new TextField("");
	TextField u = new TextField(""); // �����{��
	TextField j = new TextField(""); // ���{��
	TextField h = new TextField(""); // ����{��
	TextField g = new TextField(""); // �^��{��
	TextField e = new TextField(""); // �ڤ��{��

	public static void main(String args[]) {
		// �Цb�����g�{���X
		JVD301 jvd = new JVD301();
		jvd.start();
		// �Цb�����g�{���X
	}

	public void start() {
		Frame f = new Frame("�U��f������");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(400, 300);
		// ���U�ƥ�B�z�t��
		input.addTextListener(this);
		// �Цb�����g�{���X
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(5, 5));
		panel.add(new Label("�����{��"));
		panel.add(u);
		panel.add(new Label("���{��"));
		panel.add(j);
		panel.add(new Label("��Ͳ{��"));
		panel.add(h);
		panel.add(new Label("�^��{��"));
		panel.add(g);
		panel.add(new Label("�ڤ��{��"));
		panel.add(e);
		f.add(input, "South");
		f.add(panel, "North");
		f.setVisible(true);
		// �Цb�����g�{���X
	}

	public void textValueChanged(TextEvent ee) {
		int origin = 0;
		if (input.getText() != null) {
			//int originvalue = 0;
			try {
				origin = Integer.valueOf(input.getText());
				// �Цb�����g�{���X
				u.setText(String.valueOf(0.029 * origin));
				j.setText(String.valueOf(33.53 * origin));
				h.setText(String.valueOf(0.22 * origin));
				g.setText(String.valueOf(0.018 * origin));
				e.setText(String.valueOf(0.03 * origin));
				// �Цb�����g�{���X
			} catch (Exception exc) {
				// �Цb�����g�{���X
				u.setText("�Фſ�J�D�Ʀr�r��");
				j.setText("�Фſ�J�D�Ʀr�r��");
				h.setText("�Фſ�J�D�Ʀr�r��");
				g.setText("�Фſ�J�D�Ʀr�r��");
				e.setText("�Фſ�J�D�Ʀr�r��");
				// �Цb�����g�{���X
			}
		}
	}
}
