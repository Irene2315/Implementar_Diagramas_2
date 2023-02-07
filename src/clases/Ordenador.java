package clases;

public class Ordenador {
	private CPU cpu;
	private Pantalla pantalla;
	private Teclado teclado;
	private Raton raton;
	
	
	public CPU getCpu() {
		return cpu;
	}
	public void addCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Pantalla getPantalla() {
		return pantalla;
	}
	public void addPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void addTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Raton getRaton() {
		return raton;
	}
	public void addRaton(Raton raton) {
		this.raton = raton;
	}
	
	
	
	

}
