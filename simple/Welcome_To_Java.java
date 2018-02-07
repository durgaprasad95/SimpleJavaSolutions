package simple;

import javax.swing.JOptionPane;

class Welcome_To_Java {

	public static void main(String[] args) {
        String S=JOptionPane.showInputDialog("enter the string");
        if(S.equals("start"))
        	JOptionPane.showMessageDialog(null,"Welcome To Java.........S DURGA PRASAD MURTHY");
        else
        	JOptionPane.showMessageDialog(null,"You Entered Wrong Input");
        String M=JOptionPane.showInputDialog("enter the string");
        if(M.equals("hello java.how r u"))
        	JOptionPane.showMessageDialog(null,"hello.........S DURGA PRASAD MURTHY."+" I am fine");
        else
        	JOptionPane.showMessageDialog(null,"You Entered Wrong Input");
	}
}
