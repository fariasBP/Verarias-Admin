package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;

import paneles.Paneles;

public class VentantaPrincipal extends Paneles{
	protected JFrame frame;
	protected JPanel panelPrin, panelA, panelB, panelC;
	private String title;
	public VentantaPrincipal(String title) {
		super();
		frame = new JFrame();
		this.title = title;
		createFrame();
		componentes();
	}
	public void createFrame() {
		frame.setTitle(title);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(950, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
	public void visible(boolean oprt) {
		frame.setIconImage(this.traerImagen("assets/img/photo.png"));
		frame.setVisible(oprt);
	}
	private void componentes() {
		frame.setLayout(null);
		
		frame.add(menuLateral(true));
		frame.add(cuerpo(true));
		
	}
}
