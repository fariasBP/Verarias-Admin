package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class EventosBoton implements ActionListener{
	int key_btn;
	JButton[] btns;
	JButton btn;
	public EventosBoton(JButton btn) {
		this.btn = btn;
		btns = null;
	}
	public EventosBoton(int key_btn, JButton[] btns) {
		this.key_btn = key_btn;
		this.btns = btns;
		btn = null;
	}
	public void actionPerformed(ActionEvent e) {
		if (btns == null && btn != null) {
			if (btn.getName().equals("Salir")) {
				System.exit(0);
			}
		} else if(btns != null && btn == null) {
			for (int e1=0; e1 < btns.length; e1++) {
				if (e1 == key_btn) {
					btns[e1].setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(255, 101, 0)));
				} else {
					btns[e1].setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(103, 58, 183)));
				}
			}
		}
	}
	
}
