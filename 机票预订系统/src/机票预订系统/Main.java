package ��ƱԤ��ϵͳ;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Main {
		static JFrame frame = new JFrame();
		public static void main(String[] args) {
			new Main();
		}
		Main(){
			JFrame frame=new JFrame("���߻�Ʊϵͳ");
			JPanel cp=new JPanel();
			JButton b1=new JButton("������Ʊ");
			JButton b2=new JButton("��ѯ����");
			JButton b3=new JButton("��Ʊ�˶�");
			
			b1.setFont(new Font("����", Font.PLAIN, 25));
			b2.setFont(new Font("����", Font.PLAIN, 25));
			b3.setFont(new Font("����", Font.PLAIN, 25));
			cp.add(b1);
			cp.add(b2);
			cp.add(b3);
			frame.add(cp,BorderLayout.CENTER);
			frame.add(new JLabel("��ӭ�������߻�Ʊϵͳ"),BorderLayout.NORTH);
			frame.setLocation(600,300);
			frame.setSize(600,300);
			frame.setVisible(true);
			//��������
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					closeThis();//�����µĴ���
					JFrame jf = new JFrame("������Ʊ");
					JPanel jp=new JPanel();
					JPanel jp1=new JPanel();
					JPanel jp2=new JPanel();
					BorderLayout borderlayout=new BorderLayout();
					jf.setLocation(600,400);
					jf.setSize(800,200);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jp.add(new JLabel("��ʼ����"));
					jp1.add(new JLabel("Ŀ�����"));
					JButton btn1=new JButton("����");
					btn1.setFont(new Font("����", Font.PLAIN, 25));
					JTextField ip1=new JTextField(5);
					JTextField ip2=new JTextField(5);
					jp.add(ip1);
					jp1.add(ip2);
					jp2.add(btn1);
					jf.add(jp,borderlayout.NORTH);
					jf.add(jp1,borderlayout.CENTER);
					jf.add(jp2,borderlayout.SOUTH);
					jp.setVisible(true);
					jp1.setVisible(true);
					jp2.setVisible(true);
					//��������
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame jf = new JFrame("�������"); 
					jf.setLocation(500,200);
	    			jf.setSize(800,600);
	    			jf.setLayout(new BorderLayout());
	    			jf.setVisible(true);
	            	jf.setResizable(false);
	            	jf.setTitle("�������");
	            	JLabel jl=new JLabel("�������",SwingConstants.CENTER);
	            	jl.setFont(new Font("����",Font.BOLD, 20));  
	            	Object[] s = { "AirlineCode", "AirlineName", "DNumber", "ENumber", "Distance"
	            			,"Fare","DepatureTime","ArrivalTime","Discount"};
	            	Object[][] ob = new Object[20][9];
	            	JPanel jp=new JPanel();
	            	jf.add(jp);
	            	jp.setLayout(new BorderLayout());
	            	jp.add(jl,BorderLayout.NORTH);
	            	JTable table = new JTable(ob, s);
	            	JScrollPane scrollPane = new JScrollPane(table);
	            	jp.add(scrollPane,BorderLayout.CENTER);
	            	table.setPreferredScrollableViewportSize(new Dimension(20,20));
	                
				}
			});
				}
			});
	 		            	
	    	b2.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
	       			closeThis();//�����µĴ���
	       			BorderLayout borderlayout=new BorderLayout();
	       			JFrame jf = new JFrame("��ѯ����");
					jf.setLocation(600,400);
					jf.setSize(1000,600);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jf.setTitle("��ѯ���");
	            	JLabel jl=new JLabel("��ѯ���",SwingConstants.CENTER);
	            	jl.setFont(new Font("����",Font.BOLD, 20));  
	            	Object[] s = { "PassengerNum" ,"PassengerName","FNumber" ,"DNumber",
	            			"ENumber","DepatureTime","ArrivalTime"};
	            	Object[][] ob = new Object[20][7];
	            	JPanel jp=new JPanel();
	            	jf.add(jp);
	            	jp.setLayout(new BorderLayout());
	            	jp.add(jl,BorderLayout.NORTH);
	            	JTable table = new JTable(ob, s);
	            	JScrollPane scrollPane = new JScrollPane(table);
	            	jp.add(scrollPane,BorderLayout.CENTER);
	            	table.setPreferredScrollableViewportSize(new Dimension(20,20));			
	 		       			}
	 		            	});
	    	
	    	b3.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
	       			closeThis();//�����µĴ���
	       			BorderLayout borderlayout=new BorderLayout();
	       			JFrame jf = new JFrame("��Ʊ�˶�");
					jf.setLocation(600,400);
					jf.setSize(1000,600);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jf.setTitle("��Ʊ�˶�");
	            	JLabel jl=new JLabel("��Ʊ�˶�",SwingConstants.CENTER);
	            	jl.setFont(new Font("����",Font.BOLD, 20));  
	            	Object[] s = { "PassengerNum" ,"PassengerName","FNumber" ,"DNumber",
	            			"ENumber","DepatureTime","ArrivalTime"};
	            	Object[][] ob = new Object[20][7];
	            	JPanel jp=new JPanel();
	            	jf.add(jp);
	            	jp.setLayout(new BorderLayout());
	            	jp.add(jl,BorderLayout.NORTH);
	            	JTable table = new JTable(ob, s);
	            	JScrollPane scrollPane = new JScrollPane(table);
	            	jp.add(scrollPane,BorderLayout.CENTER);
	            	table.setPreferredScrollableViewportSize(new Dimension(20,20));
	            	JPanel jp1=new JPanel();
					JButton btn2=new JButton("�˻�Ʊ");
	            	btn2.setFont(new Font("����", Font.PLAIN, 25));
	            	jp1.add(btn2);
					jf.add(jp1,borderlayout.SOUTH);
					btn2.addActionListener(new ActionListener(){
					    public void actionPerformed(ActionEvent e) {
			       			closeThis();//�����µĴ���
			       			JFrame jf = new JFrame("��Ʊ�˶�");
							jf.setLocation(600,400);
							jf.setSize(800,600);
							jf.add(new JLabel("��Ʊ�ɹ���"),BorderLayout.NORTH);
							jf.setVisible(true);						
					    }
					});
	 		       			}
	 		            	});
				}
			public static void closeThis(){
			frame.dispose();
			}
		public void actionPerformed(ActionEvent e){	
			}

	}
