
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JVD404 extends JFrame {
	/**
  * 
  */
	private static final long serialVersionUID = 1L;

	public JVD404(String s) {
		super(s);
		c = null;
		c = getContentPane();
		c.setLayout(new BorderLayout());
		final JTextArea t = new JTextArea();
		t.setLineWrap(true);
		JScrollPane jscrollpane = new JScrollPane(t);
		c.add(jscrollpane, "Center");
		final JFileChooser fc = new JFileChooser();
		JMenuBar jmenubar = new JMenuBar();
		jmenubar.setBorder(BorderFactory.createBevelBorder(1));
		setJMenuBar(jmenubar);
		JMenu jmenu = new JMenu("檔案");
		JMenuItem jmenuitem = new JMenuItem("開新檔案");
		jmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				t.setText("");
			}
		});
		jmenu.add(jmenuitem);
		JMenuItem jmenuitem1 = new JMenuItem("開啟舊檔");
		jmenuitem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				int i = fc.showOpenDialog(JVD404.this);
				if (i == 0)
					try {
						File file = fc.getSelectedFile();
						BufferedReader bufferedreader = new BufferedReader(
								new FileReader(file.getAbsolutePath()));
						t.setText(bufferedreader.readLine());
						String s1;
						while ((s1 = bufferedreader.readLine()) != null)
							t.append("\n" + s1);
						bufferedreader.close();
					} catch (IOException ioexception) {
					}
			}
		});
		jmenu.add(jmenuitem1);
		JMenuItem jmenuitem2 = new JMenuItem("儲存檔案");
		jmenuitem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {

				try {
					File file = fc.getSelectedFile();
					if (file != null) {
						PrintWriter printwriter = new PrintWriter(
								new BufferedWriter(new FileWriter(file
										.getAbsolutePath())));
						printwriter.write(t.getText());
						printwriter.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		jmenu.add(jmenuitem2);
		jmenu.addSeparator();
		JMenuItem jmenuitem3 = new JMenuItem("離開");
		jmenuitem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				System.exit(0);
			}
		});
		jmenu.add(jmenuitem3);
		jmenubar.add(jmenu);
		JMenu jmenu1 = new JMenu("編輯");
		JMenuItem jmenuitem4 = new JMenuItem("複製");
		jmenuitem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				t.copy();
			}
		});
		jmenu1.add(jmenuitem4);
		JMenuItem jmenuitem5 = new JMenuItem("貼上");
		jmenuitem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				t.paste();
			}
		});
		jmenu1.add(jmenuitem5);
		JMenuItem jmenuitem6 = new JMenuItem("剪下");
		jmenuitem6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				t.cut();
			}
		});
		jmenu1.add(jmenuitem6);
		jmenubar.add(jmenu1);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				System.exit(0);
			}
		});
		try {
			UIManager.setLookAndFeel("com.sun.swing.plaf.gtk.GTKLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception exception) {
		}
		setSize(400, 250);
		setVisible(true);
	}

	public static void main(String args[]) {
		JVD404 jva04 = new JVD404("簡易記事本");
	}

	Container c;
}// end class
