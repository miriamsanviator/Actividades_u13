package actividad_1;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel  {
	JTextField tr1;
	JTextField tr2;
	
	public PanelResultados() {
		this.setBorder(new TitledBorder("Resultados"));
		
		tr1 = new JTextField();
		tr1.setBounds(50, 50, 150, 20);
		
		tr2 = new JTextField();
		tr2.setBounds(50, 100, 150, 20);
		
		this.setLayout(new GridLayout(1,2));
		this.add(tr1);
		this.add(tr2);
	}
	
	public JTextField getTr1() {
		return tr1;
	}
	
	public void setTr1(JTextField tr1) {
		this.tr1 = tr1;
	}
	
	public JTextField getTr2() {
		return tr2;
	}
	
	public void setTr2(JTextField tr2) {
		this.tr2 = tr2;
	}
}