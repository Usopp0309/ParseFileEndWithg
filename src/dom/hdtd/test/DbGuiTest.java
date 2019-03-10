package dom.hdtd.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DbGuiTest {
	public static void main(String[] args) {

		// 设置frame
		final JFrame frame = new JFrame("帮助");
		frame.setBounds(20, 20, 200, 200);
		frame.setVisible(true);
		frame.setLayout(null);// 布局
		frame.setBackground(Color.lightGray);// 背景色
		frame.setSize(650, 360);// 设置大小
		frame.setLocationRelativeTo(null); // 居中显示
		
		// 按钮
		JButton yesBtn = new JButton("确定更改");
		// helpButton.setl
		yesBtn.setBounds(180, 220, 90, 30);
		frame.add(yesBtn);
		
		// 按钮
		JButton hideBtn = new JButton("取消更改");
		// helpButton.setl
		hideBtn.setBounds(330, 220, 90, 30);
		frame.add(hideBtn);
		

		final JTextField textField1 = new JTextField(30);
		textField1.setBounds(200, 40, 240, 30);
		textField1.setVisible(true);
		frame.add(textField1);
		
		final JTextField textField2 = new JTextField(30);
		textField2.setBounds(200, 100, 240, 30);
		textField2.setVisible(true);
		frame.add(textField2);
		
		final JTextField textField3 = new JTextField(30);
		textField3.setBounds(200, 160, 240, 30);
		textField3.setVisible(true);
		frame.add(textField3);
		
		JLabel jl1 = new JLabel("数据库名 ：", SwingConstants.CENTER);
		jl1.setFont(new Font("", 0, 16));
		jl1.setBounds(80, 40, 100, 30);
		frame.add(jl1);
		
		JLabel jl2 = new JLabel("用户名 ：", SwingConstants.CENTER);
		jl2.setFont(new Font("", 0, 16));
		jl2.setBounds(80, 100, 100, 30);
		frame.add(jl2);
		
		JLabel jl3 = new JLabel("密码 ：", SwingConstants.CENTER);
		jl3.setFont(new Font("", 0, 16));
		jl3.setBounds(80, 160, 100, 30);
		frame.add(jl3);
		
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("config/db.properties")));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
//		System.out.println(properties);
		
		String url = (String) properties.get("jdbc.url");
//		jdbc:mysql://localhost:3306/hdtdgfile?characterEncoding=utf-8
		url = url.replace("jdbc:mysql://localhost:3306/", "");
		url = url.replace("?characterEncoding=utf-8", "");
		textField1.setText(url);
		textField1.setFont(new Font("", 1, 14));
		
		String username = (String) properties.get("jdbc.username");
		textField2.setText(username);
		textField2.setFont(new Font("", 1, 14));
		
		String password = (String) properties.get("jdbc.password");
		textField3.setText(password);
		textField3.setFont(new Font("", 1, 14));
		
//		final String url2 = textField1.getText();
//		final String username2 = textField2.getText();
//		final String password2 = textField3.getText();
		
//		System.out.println(url2);
	
		// 关闭按钮
		hideBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		yesBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final String url2 = textField1.getText();
				final String username2 = textField2.getText();
				final String password2 = textField3.getText();
				try {
//					jdbc.driver=com.mysql.jdbc.Driver
//							jdbc.url=jdbc:mysql://localhost:3306/hdtdgfile?characterEncoding=utf-8
//							jdbc.username=root
//							jdbc.password=root
					System.err.println(url2);
					System.err.println(username2);
					System.err.println(password2);

					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("config/db.properties")));
					bw.write("jdbc.driver=com.mysql.jdbc.Driver");
					bw.newLine();
					bw.write("jdbc.url=jdbc:mysql://localhost:3306/" + url2 + "?characterEncoding=utf-8");
					bw.newLine();
					bw.write("jdbc.username=" + username2);
					System.out.println(username2);
					bw.newLine();
					bw.write("jdbc.password=" + password2);
					System.out.println(password2);
					bw.newLine();
					bw.flush();
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
	}
}
