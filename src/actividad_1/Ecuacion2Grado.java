package actividad_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ecuacion2Grado {
	public static void main(String[] args) {
		JFrame j = new JFrame("ax^2+bx+c=0");
		JPanel p = new JPanel();
		
		j.getContentPane().add(p, BorderLayout.CENTER);
		
		p.setSize(200, 600);
		p.setLayout(new BorderLayout());
		p.add(new PanelDatos(), BorderLayout.NORTH);
		p.add(new PanelResultados(), BorderLayout.SOUTH);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.pack();
		j.setVisible(true);
	}
}