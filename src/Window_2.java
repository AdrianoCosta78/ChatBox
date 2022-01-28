import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_2 extends JFrame {

	static String username2;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_2 frame = new Window_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBorder(new LineBorder(new Color(0, 0, 0)));
		display2.setBounds(10, 56, 314, 195);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBorder(new LineBorder(new Color(0, 0, 0)));
		text2.setBounds(10, 284, 228, 22);
		contentPane.add(text2);
		
		send2 = new JButton("Enviar");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")) {
					return;
				}
					display2.append(username2 + ":"+s+"\n");
					Window_1.sendText();
					text2.setText("");
				}
			
		});
		send2.setBounds(245, 284, 79, 23);
		contentPane.add(send2);
		
		label2 = new JLabel("Chat window for: "+username2);
		label2.setBorder(new LineBorder(new Color(0, 0, 0)));
		label2.setBounds(10, 11, 228, 22);
		contentPane.add(label2);
		
		JButton clear = new JButton("Limpar");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear.setBounds(245, 11, 79, 23);
		contentPane.add(clear);
	}

	public static void sendText() {//enviarTexto
		String s = Window_1.text1.getText();//s=enviar
		if(s.equals("")) {
			return;
		}
		display2.append(Window_1.username1 + ":"+s+"\n");
	}
	
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;//displayUsuario1
	private javax.swing.JButton send2;//EnviarUsuario1
	public static javax.swing.JTextArea text2;//textoUsuario1
}
