import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener{
	MenuBar mb;
	Label l;
	Demo(){
	super("Demonstration of MenuBar");
		setSize(400,400);
		setVisible(true);
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		l=new Label();
		l=new Label();
		add(l);
		l.setAlignment(l.CENTER);
		l.setFont(new Font("Arial,Font.BOLD,20"));
		mb =new MenuBar();
		setMenuBar(mb);
		String[]menu={"File","Edit","Help"};
		String[][]mi={{"Open","Save","Close"},
			{"Cut","Copy","Paste"},
			{"About","Update","Licence"}
			};
			int X=0,Y=0;
			for(String s: menu){
				Y=0;
				Menu m =new Menu(s);
				s=s.toLowerCase();
			for(int i=0;i<3;i++){
			MenuItem mmi=new MenuItem(mi[X][Y]);
			mmi.addActionListener(this);
			m.add(mmi);
			Y++;
			}
			X++;
			mb.add(m);
		}
		
		/*mb.add(new Menu("File"));
		mb.add(new Menu("Edit"));
		mb.add(new Menu("Help"));*/
		
		//mi=new MenuItem();
		//m.add(mi);
		
		
			addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
			dispose();
		}
		});
	}
	
	public void actionperformed(ActionEvent ae){
		String mstr=ae.getActionCommand();
		if(mstr.equals("Close")){
		System.exit(0);
		}
		else{
			l.setText(mstr);
		}
	}
	public static void main(String...args){
		new Demo();
		}
}
