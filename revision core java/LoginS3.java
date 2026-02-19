import javax.swing.*;
import java.awt.event.*;
class LoginS3 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
    LoginS3(String s2){
     super(s2);
    }
    LoginS3(){
    }
    void setComponents(){
         l1 = new JLabel("Welcome to our college");
         l2 = new Jlabel("User Name");
         l3 = new Jlabel("password");
         l4 = new Jlabel();
         t1 = new JTextField();
         t2 = new JTextField();
         b1 = new JButton("login");
         b2 = new JButton("Clear");
         b1.addActionListener(new Log());
         b2.addActionListener(new Clear());
         setLayout(null);
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         add(t1);
         add(t2);
         add(b1);
         add(b2);
      l1.setBounds(195, 50,400,40);
      l2.setBounds(100,200,100,30);
      l3.setBounds(100,350,100,30);
      l4.setBounds(100,550,250,30);
      t1.setBounds(350,200,100,30);
      t2.setBounds(350,350,100,30);
      b1.setBounds(200,450,100,30);
      b2.setBounds(400,450,100,30);
     // b1.setBounds()
    }
    public static void main(String[]args){
         LoginS3 s1 = new LoginS3("Welcome to our college:");
         s1.setVisible(true);
         s1.setSize(700,700);
         s1.setComponents();
         s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class log implements ActionListener{
        public void actionperformed(ActionEvent e1){
             String s1 =t1.getText();
             String s2 =t2.getText();
             if(s1.equals("khushi")&& s2.equals("patidar")){
                l4.setText("Login Successfull");
             }
             else{
                l4.setText("login UnSuccessfull");
             }
        }
    }
    class Clear implements  ActionListener{
        public void actionPerformed( ActionEvent e1){
      t1.setText("");
      t2.setText("");
        }
    }
}