import java.awt.event.*;
import java.awt.*;
class LAB7P1{
	public static void main(String... args){
	Frame f= new Frame();
	FlowLayout fl = new FlowLayout();
	f.setLayout(new FlowLayout());
	TextField tf=new TextField(50);
	Button b = new Button("click");
	Label l1=new Label();
	Label l2= new Label();
	l1.setPreferredSize(new Dimension(30,30));
	l2.setPreferredSize(new Dimension(100,30));
	b.setSize(100,100);
	f.add(l1);
	f.add(b);
	f.add(tf);
	f.add(l2);
	f.setSize(400,400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
	public void Windowclosing(WindowEvent we){
	f.dispose();
	}
	});
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		//System.out.println
		tf.setText("hello");
		tf.setText(tf.getText());
		}
	});
	}
}	
