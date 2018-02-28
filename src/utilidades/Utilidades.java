package utilidades;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Utilidades {
	protected Toolkit herramientas;
	protected Image imagen;
	
	public Utilidades() {
		this.herramientas = Toolkit.getDefaultToolkit();
	}
	public Image traerImagen(String direccion) {
		this.imagen = this.herramientas.getImage(direccion);
		return this.imagen;
	}
	public int getPorcentaje(int cien_porciento, int x) {
		int y, cien = 100;
		y = (x * cien) / cien_porciento;
		return y;
	}
	public Color rgb(int r, int g, int b) {
		Color cl = new Color(r, g, b);
		return cl;
	}
}
