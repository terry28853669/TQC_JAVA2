import java.awt.*;
import java.awt.event.*;

public class JVD301 implements TextListener {
	TextField input = new TextField("");
	TextField u = new TextField(""); // 美金現值
	TextField j = new TextField(""); // 日圓現值
	TextField h = new TextField(""); // 港幣現值
	TextField g = new TextField(""); // 英鎊現值
	TextField e = new TextField(""); // 歐元現值

	public static void main(String args[]) {
		// 請在此撰寫程式碼
		JVD301 jvd = new JVD301();
		jvd.start();
		// 請在此撰寫程式碼
	}

	public void start() {
		Frame f = new Frame("各國貨幣換算");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(400, 300);
		// 註冊事件處理含式
		input.addTextListener(this);
		// 請在此撰寫程式碼
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(5, 5));
		panel.add(new Label("美金現值"));
		panel.add(u);
		panel.add(new Label("日圓現值"));
		panel.add(j);
		panel.add(new Label("港敝現值"));
		panel.add(h);
		panel.add(new Label("英鎊現值"));
		panel.add(g);
		panel.add(new Label("歐元現值"));
		panel.add(e);
		f.add(input, "South");
		f.add(panel, "North");
		f.setVisible(true);
		// 請在此撰寫程式碼
	}

	public void textValueChanged(TextEvent ee) {
		int origin = 0;
		if (input.getText() != null) {
			//int originvalue = 0;
			try {
				origin = Integer.valueOf(input.getText());
				// 請在此撰寫程式碼
				u.setText(String.valueOf(0.029 * origin));
				j.setText(String.valueOf(33.53 * origin));
				h.setText(String.valueOf(0.22 * origin));
				g.setText(String.valueOf(0.018 * origin));
				e.setText(String.valueOf(0.03 * origin));
				// 請在此撰寫程式碼
			} catch (Exception exc) {
				// 請在此撰寫程式碼
				u.setText("請勿輸入非數字字元");
				j.setText("請勿輸入非數字字元");
				h.setText("請勿輸入非數字字元");
				g.setText("請勿輸入非數字字元");
				e.setText("請勿輸入非數字字元");
				// 請在此撰寫程式碼
			}
		}
	}
}
