package sept15;
import java.awt.*;  
import java.awt.event.*;  
class RegistrationForm extends Frame implements ActionListener{  
TextField tf; 
TextField tf1;
TextField tf2;
RegistrationForm(){  
  
//create components  
tf=new TextField();
tf.setBounds(60,50,170,20);
tf1=new TextField(); 
tf1.setBounds(60,100,170,20);
tf2=new TextField();  
tf2.setBounds(60,150,170,20);
Button b=new Button("Submit");  
b.setBounds(100,200,80,30);  
//register listener  
b.addActionListener(this);//passing current instance  

//add components and set size, layout and visibility  
add(b);add(tf);add(tf1);  
add(tf2);  
setSize(300,300);  
setLayout(null);  
setVisible(true); 
tf.setText("Name"); 
tf1.setText("UID");
tf2.setText("Address");
}  
public void actionPerformed(ActionEvent e){  
tf.setText("Name"); 
tf1.setText("UID");
tf2.setText("Address");
//tf.setText("Name");
}  
public static void main(String args[]){  
new RegistrationForm();  
}  
}