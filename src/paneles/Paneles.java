package paneles;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import eventos.EventosBoton;
import utilidades.Utilidades;

public class Paneles extends Utilidades{
	protected JPanel panelLateral;
	protected JPanel panelCuerpo;
	protected JPanel panelMenu;
	
	protected JPanel[] SubPaneles;
	
	protected JButton btnSalir;
	
	protected JButton[] botonesMenu;
	protected JPanel[] panelesCuerpo;
	
	public Paneles() {
		super();
		panelLateral = new JPanel();
		panelCuerpo = new JPanel();
		panelMenu = new JPanel();
		
		
		
		btnSalir = new JButton();
		
		botonesMenu = new JButton[5];
		panelesCuerpo = new JPanel[5];
	}
	
	public Component cuerpo(boolean oprt) {
		panelCuerpo.setBackground(rgb(246, 251, 254));
		panelCuerpo.setVisible(oprt);
		return panelCuerpo;
	}
	
	public Component menuLateral(boolean oprt) {
		this.crearBtnSalir();
		crearMenu();
		
		panelLateral.setLayout(null);
		panelLateral.setBounds(0, 0, 950, 100);
		panelLateral.setBackground(rgb(103, 58, 183));
		panelLateral.setVisible(oprt);
		
		panelLateral.add(btnSalir);
		panelLateral.add(panelMenu);
		
		return panelLateral;
	}
	private void crearBtnSalir() {
		ImageIcon img = new ImageIcon("assets/img/exit_icon.png");
		
		btnSalir.setIcon(img);
		btnSalir.setName("Salir");
		btnSalir.setBackground(rgb(103, 58, 183));
		btnSalir.setBorderPainted(false);
		btnSalir.setBounds(927, 8, 18, 15);
		btnSalir.setMargin(new Insets(0, 0, 0, 0));
		btnSalir.setFocusable(false);
		btnSalir.addActionListener(new EventosBoton(btnSalir));
	}
	private void crearMenu() {
		componentesMenu();
		panelMenu.setBounds(10, 50, 930, 100);
		panelMenu.setBackground(rgb(103, 58, 183));
		panelMenu.setLayout(null);
		
		for (JButton clave: botonesMenu) {
			panelMenu.add(clave);
		}
	}
	private void componentesMenu() {	
		botonesMenu[0] = new JButton("Estructura");
		botonesMenu[1] = new JButton("Historia");
		botonesMenu[2] = new JButton("Ganancias");
		botonesMenu[3] = new JButton("Gastos");
		botonesMenu[4] = new JButton("Ahorro");
		int i = 0;
		for (JButton clave: botonesMenu) {
			clave.setBackground(rgb(103, 58, 183));
			clave.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, rgb(103, 58, 183)));
			
			clave.setMargin(new Insets(0, 0, 0, 0));
			clave.setFocusable(false);
			clave.setForeground(rgb(255, 255, 255));
			switch (i) {
				case 0:
					clave.setName("Estructura");
					clave.setBounds(15+(i*100), 0, 100, 50);
					clave.addActionListener(new EventosBoton(i , botonesMenu));
					break;
				case 1:
					clave.setName("Historia");
					clave.setBounds(15+(i*100), 0, 100, 50);
					clave.addActionListener(new EventosBoton(i , botonesMenu));
					break;
				case 2:
					clave.setName("Ganancias");
					clave.setBounds(15+(i*100), 0, 100, 50);
					clave.addActionListener(new EventosBoton(i , botonesMenu));
					break;
				case 3:
					clave.setName("Gastos");
					clave.setBounds(15+(i*100), 0, 100, 50);
					clave.addActionListener(new EventosBoton(i , botonesMenu));
					break;
				case 4:
					clave.setName("Ahorro");
					clave.setBounds(15+(i*100), 0, 100, 50);
					clave.addActionListener(new EventosBoton(i , botonesMenu));
			}
			botonesMenu[0].setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, rgb(255, 101, 0)));			

			i++;
		}
		
	}
	private void crearPanelesCuerpo() {
		panelesCuerpo[0] = new JPanel();
		panelesCuerpo[1] = new JPanel();
		panelesCuerpo[2] = new JPanel();
		panelesCuerpo[3] = new JPanel();
		panelesCuerpo[4] = new JPanel();
		int i = 0;
		for (JPanel clave: panelesCuerpo) {
			switch (i) {
			case 0:
				clave.setBackground(rgb(84, 171, 65));
				clave.setBounds(130, 50, 900, 400);
				break;
			
			}
			i++;
		}
	}
}