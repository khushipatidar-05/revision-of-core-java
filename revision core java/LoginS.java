import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginS extends JFrame{
     JLabel l1,l2,l3,l4,l0;
     JTextField t1;
     JPasswordField t2;
     JButton b1,b2,b3;
      LoginS(String s1){
     super(s1);
      }
      LoginS(){
    
      }
      void setComponents(){
        l0 = new JLabel();
        ImageIcon i1 = new ImageIcon("c:/Users/kartik/Downloads/final2.jpeg"); 
        l0.setIcon(i1);
       // Cursor c1 = new Cursor(Cursor.CROSSHAIR_CURSOR);
         // Cursor c1 = new Cursor(Cursor.WAIT_CURSOR);
         Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
         Font f3 = new Font("Callibri",Font.BOLD,22);
         Font f1 = new Font("Times New Roman ",Font.BOLD,28);
         Font f2 = new Font("Callibri ",Font.ITALIC,22);
         Font f4 = new Font("Callibri" ,Font.ITALIC,20);
        l1 = new JLabel("Welcome to Coding Seekho Institute ");
        l1.setFont(f1);
        l1.setForeground(Color.BLUE);
        l2 = new JLabel("USERNAME");
        l2.setFont(f3);
       // l3.setFont(f3);
        l3 = new JLabel("PASSWORD");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
       b1.setFont(f2);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.GREEN);
        b1.setCursor(c1);
        b2 = new JButton("Clear");
        b2.setFont(f4);
        b2.setBackground(Color.GREEN);
        b3 = new JButton("Add");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(l0);
        l1.setBounds(150,50,500,40);
        l2.setBounds(100,200,160,50);
        l3.setBounds(100,350,160,50);
        l4.setBounds(100,550,250,30);
        l0.setBounds(1,10,200,150);
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);
        b1.setBounds(200,450,100,30);
        b2.setBounds(400,450,100,30);
        b3.setBounds(500,550,100,30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        l1.addMouseListener(new MouseL());

       
      }
      class MouseL implements MouseListener{
       public void mouseEntered(MouseEvent e1){
        l2.setForeground(Color.RED);
       }
       public void mouseExited(MouseEvent e1){
       l2.setForeground(Color.RED);
      }
       public void mouseReleased(MouseEvent e1){
         l2.setText("USERNAME");
            l2.setForeground(Color.RED);
       }
      public void mousePressed(MouseEvent e1){
        l2.setText("");
      }
      public void mouseClicked(MouseEvent e1){

      }
      }
    public static void main(String[]args){
      LoginS s1 = new LoginS("welcome to  Coding Seekho!");
      s1.setVisible(true);
       s1.setSize(700,700);
       s1.setComponents();
       s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       class Log implements ActionListener{
        public void actionPerformed(ActionEvent e1){
          String s1 = t1.getText();
          String s2 = t2.getText();
          if(s1.equals("khushi")&& s2.equals("patidar")){
           // JOptionPane.showMessageDialog(null,"Login Successfull");
            l4.setText("Login Successful");
          }
          else{
           JOptionPane.showMessageDialog(null,"Login UnSuccessfull");
           l4.setText("Login UnSuccessful");
          }
        }
       }
         class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
          t1.setText("");
          t2.setText("");
     /*
        t1.setText("khushi");
        t2.setText("patidar");
        */
        }
       }
        class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1){
          // ye dono line risky hai arg string me deta liukha to exception aayergi isliye try catch
          try{
         int a = Integer.parseInt(t1.getText());
         int b = Integer.parseInt(t2.getText());
         int c = a+b;
         l4.setText("Addition is "+c);
          }
          catch(Exception e2){
            l4.setText("you use add Button pls enter number only!");
          }
        }
       }
    } 
