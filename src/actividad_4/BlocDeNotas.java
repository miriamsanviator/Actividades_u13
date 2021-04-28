package actividad_4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import actividad_1.PanelDatos;
import actividad_1.PanelResultados;

public class BlocDeNotas extends JPanel {
	private JLabel nombre;
	private JTextField tf;
	private JTextArea texto;
	private JButton limpiar;
	private JButton guardar;
	private JButton salir;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Bloc de notas");
		JPanel p = new JPanel();
		
		p.setSize(200, 600);
		p.setLayout(new BorderLayout());
		p.add(new BlocDeNotas(), BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	
	public BlocDeNotas() {
		nombre = new JLabel("Nombre");
		tf = new JTextField();
		texto = new JTextArea();
		limpiar = new JButton();
		guardar = new JButton();
		salir = new JButton();
		
		limpiar.setBounds(50, 100, 100, 30);
		
		this.setLayout(new GridLayout(3,1));
		this.add(nombre); this.add(tf);
		this.add(texto);
		this.add(limpiar); this.add(guardar); this.add(salir);
	}
	
	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}
	
	public JTextField getTf() {
		return tf;
	}

	public void setTf(JTextField tf) {
		this.tf = tf;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	public JButton getLimpiar() {
		return limpiar;
	}

	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}
}