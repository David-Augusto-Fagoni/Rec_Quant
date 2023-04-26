package View;

import javax.swing.JOptionPane;
import Controller.Rec;

public class Main {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		Rec R = new Rec();
		System.out.println(R.Rec_C(N));
	}
}
