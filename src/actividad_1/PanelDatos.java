package actividad_1;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {
	private JLabel labelA;
	private JLabel labelB;
	private JLabel labelC;
	private JTextField ta;
	private JTextField tb;
	private JTextField tc;
	
	public PanelDatos() {
		this.setBorder(new TitledBorder("Coeficientes"));
		
		labelA = new JLabel("a = ");
		labelB = new JLabel("b = ");
		labelC = new JLabel("c = ");
		ta = new JTextField();
		tb = new JTextField();
		tc = new JTextField();
		
		this.add(labelA); this.add(ta);
		this.add(labelB); this.add(tb);
		this.add(labelC); this.add(tc);
		this.setLayout(new GridLayout(3,1));
	}

	public JLabel getLabelA() {
		return labelA;
	}

	public void setLabelA(JLabel labelA) {
		this.labelA = labelA;
	}

	public JLabel getLabelB() {
		return labelB;
	}

	public void setLabelB(JLabel labelB) {
		this.labelB = labelB;
	}

	public JLabel getLabelC() {
		return labelC;
	}

	public void setLabelC(JLabel labelC) {
		this.labelC = labelC;
	}

	public JTextField getTa() {
		return ta;
	}

	public void setTa(JTextField ta) {
		this.ta = ta;
	}

	public JTextField getTb() {
		return tb;
	}

	public void setTb(JTextField tb) {
		this.tb = tb;
	}

	public JTextField getTc() {
		return tc;
	}

	public void setTc(JTextField tc) {
		this.tc = tc;
	}
}