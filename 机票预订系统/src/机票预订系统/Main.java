package 机票预订系统;
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
			JFrame frame=new JFrame("在线机票系统");
			JPanel cp=new JPanel();
			JButton b1=new JButton("搜索机票");
			JButton b2=new JButton("查询订单");
			JButton b3=new JButton("机票退订");
			
			b1.setFont(new Font("宋体", Font.PLAIN, 25));
			b2.setFont(new Font("宋体", Font.PLAIN, 25));
			b3.setFont(new Font("宋体", Font.PLAIN, 25));
			cp.add(b1);
			cp.add(b2);
			cp.add(b3);
			frame.add(cp,BorderLayout.CENTER);
			frame.add(new JLabel("欢迎访问在线机票系统"),BorderLayout.NORTH);
			frame.setLocation(600,300);
			frame.setSize(600,300);
			frame.setVisible(true);
			//弹出窗口
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					closeThis();//创建新的窗口
					JFrame jf = new JFrame("搜索机票");
					JPanel jp=new JPanel();
					JPanel jp1=new JPanel();
					JPanel jp2=new JPanel();
					BorderLayout borderlayout=new BorderLayout();
					jf.setLocation(600,400);
					jf.setSize(800,200);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jp.add(new JLabel("起始城市"));
					jp1.add(new JLabel("目标城市"));
					JButton btn1=new JButton("搜索");
					btn1.setFont(new Font("宋体", Font.PLAIN, 25));
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
					//弹出窗口
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame jf = new JFrame("搜索结果"); 
					jf.setLocation(500,200);
	    			jf.setSize(800,600);
	    			jf.setLayout(new BorderLayout());
	    			jf.setVisible(true);
	            	jf.setResizable(false);
	            	jf.setTitle("搜索结果");
	            	JLabel jl=new JLabel("搜索结果",SwingConstants.CENTER);
	            	jl.setFont(new Font("宋体",Font.BOLD, 20));  
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
	       			closeThis();//创建新的窗口
	       			BorderLayout borderlayout=new BorderLayout();
	       			JFrame jf = new JFrame("查询订单");
					jf.setLocation(600,400);
					jf.setSize(1000,600);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jf.setTitle("查询结果");
	            	JLabel jl=new JLabel("查询结果",SwingConstants.CENTER);
	            	jl.setFont(new Font("宋体",Font.BOLD, 20));  
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
	       			closeThis();//创建新的窗口
	       			BorderLayout borderlayout=new BorderLayout();
	       			JFrame jf = new JFrame("机票退订");
					jf.setLocation(600,400);
					jf.setSize(1000,600);
					jf.setLayout(borderlayout);
					jf.setVisible(true);
					jf.setTitle("机票退订");
	            	JLabel jl=new JLabel("机票退订",SwingConstants.CENTER);
	            	jl.setFont(new Font("宋体",Font.BOLD, 20));  
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
					JButton btn2=new JButton("退机票");
	            	btn2.setFont(new Font("宋体", Font.PLAIN, 25));
	            	jp1.add(btn2);
					jf.add(jp1,borderlayout.SOUTH);
					btn2.addActionListener(new ActionListener(){
					    public void actionPerformed(ActionEvent e) {
			       			closeThis();//创建新的窗口
			       			JFrame jf = new JFrame("机票退订");
							jf.setLocation(600,400);
							jf.setSize(800,600);
							jf.add(new JLabel("退票成功。"),BorderLayout.NORTH);
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
