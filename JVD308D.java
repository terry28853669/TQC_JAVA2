
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JVD308D extends JFrame{
        private JRadioButton button[][] = new JRadioButton[ 4 ][ 3 ];  //new出12個JRadioButton	     
        private ButtonGroup radiogroup[] = new ButtonGroup[ 4 ];  //new出4個ButtonGroup
        private RadioButtonHandler handler[] = new RadioButtonHandler[ 4 ];  //new出4個RadioButtonGroup
        private JTextArea note;  //new出1個JTextArea
        private JPanel innerpanel, outerpanel, artistpanel;  //創造出兩個panel
        private JLabel bestlabel, showcommentlabel;  //new出2個JLabel
        private String character[][] = { { "王光良", "周杰倫", "張智成", "0" },            //男藝人的名字
                                                                         { "傷心地鐵", "若無其事", "光", "1" },  	       //王光良唱過的三首歌
                                                                         { "爸,我回來了", "雙截棍", "安靜", "2" },	       //周杰倫唱過的三首歌
                                                                         { "刺心", "May I Love You", "重返寂寞", "3" } };  //張智成唱過的三首歌
        private String songinfo[][] = { 
        		{ "這首是【傷心地鐵】\n\n音樂評等:★★★★★", "這首是【若無其事】\n\n音樂評等:★★★★", "這首是【光】\n\n音樂評等:★★★★☆" },
                { "這首是【爸，我回來了】\n\n音樂評等:★★★☆☆", "這首是【雙截棍】\n\n音樂評等:★★☆☆☆", "這首是【安靜】\n\n音樂評等:★★★★☆" },
                { "這首是【刺心】\n\n音樂評等:★★★☆☆", "這首是【May I Love You】\n\n音樂評等:★★☆☆☆", "這首是【重返寂寞】\n\n音樂評等:★★★★☆" } };
        static int choice = 1;  //switch case之用



        public JVD308D()
        {
                super( "藝人音樂評等" );

                Container container = getContentPane();  //新增一個container

                //設定成GridLayout
                innerpanel = new JPanel( new GridLayout( 3, 1 ) );  
                outerpanel = new JPanel( new GridLayout( 1, 2 ) );
                choice();

                outerpanel.add( innerpanel );  //把innerpanel加入outerpanel中

                note = new JTextArea();  //新增JTextArea
                note.setLineWrap(true);  //設定自動換行
                note.setText(songinfo[0][0]);                  
                note.setEditable(false);                    //設定不可編輯

                Box box = Box.createHorizontalBox();
                box.add( new JScrollPane( note) );  //加上一個JScrollPane
                outerpanel.add( box );

                container.add( outerpanel );

                artistpanel = new JPanel( new GridLayout( 1, 3 ) );

                //呼叫addradiobutton這個method，輸入的參數型態是( String, JPanel)
                addradiobutton( character[ 0 ], artistpanel );
                container.add( artistpanel, BorderLayout.SOUTH );  //設定artistpanel的BorderLayout為SOUTH

                setSize( 300, 200 );  //設定大小
                show();  //顯現出來
        }

        //這個method處理好所有有關JRadioButton的事情!
        public void addradiobutton( String s[], JPanel panel )
        {
                int temp = Integer.parseInt( s[ 3 ] );

                //新增3個JRadioButton
                button[ temp ][ 0 ] = new JRadioButton( s[ 0 ], true );
                panel.add(button[temp][0]);

                button[ temp ][ 1 ] = new JRadioButton( s[ 1 ], false );
                panel.add(button[temp][1]);

                button[ temp ][ 2 ] = new JRadioButton( s[ 2 ], false );
                panel.add(button[temp][2]); 

                //把JRadioButton加進去handler裡面
                handler[ temp ] = new RadioButtonHandler();

                for( int count = 0; count < button[ temp ].length; count++ )
                        button[ temp ][ count ].addItemListener( handler[ temp ] );

                //然後再設成同一個ButtonGroup
                radiogroup[ temp ] = new ButtonGroup();

                for( int count = 0; count < button[ temp ].length; count++ )
                        radiogroup[ temp ].add( button[ temp ][ count ] );
        }

        public void choice()
        {
                innerpanel.removeAll();  //將所有innerpanel裡的元件移除掉

                //用switch case來判定三個人所唱的三首歌
                switch( choice )
                {
                        case 1:
                                

                        case 2:
                                

                        case 3:
                                

                        default:
                               
                }

                innerpanel.validate();  //讓新加入innerpanel裡的元件出現
        }

        public static void main( String args[] )
        {
                JFrame.setDefaultLookAndFeelDecorated(true);  //讓整個JFrame看起來好看

                JVD308D newartist = new JVD308D();  //new出一個artist的物件

                newartist.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  //設定結束
        }

        //處理RadioButton的事件
        private class RadioButtonHandler implements ItemListener
        {
                public void itemStateChanged( ItemEvent event )
                {

                        //當點選內容為藝人姓名
                     


                        //當點選內容為光良的歌
                      


                        //當點選內容為周杰倫的歌
                    


                        //當點選內容為張智成的歌
                   


                        //結束處理內容
                }
        }
}
