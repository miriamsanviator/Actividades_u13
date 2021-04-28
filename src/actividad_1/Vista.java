package actividad_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vista extends JFrame implements ActionListener {
	private PanelDatos pd;
	private PanelResultados pr;
	private JButton b;
	
	public Vista() {
		/*pd = new PanelDatos();
		pr = new PanelResultados();
		b = new JButton("Calcular");
		
		this.setLayout(new GridLayout(3,1));
		this.add(pd);
		this.add(b);
		this.add(pr);*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}