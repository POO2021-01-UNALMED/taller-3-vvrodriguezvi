package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;

	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
		
		
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int ControlCanal) {
		if(ControlCanal <= 120 && ControlCanal >=1 && this.estado == true) {
			this.canal = ControlCanal;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int nuevoVolumen) {
		if(nuevoVolumen <= 7 && nuevoVolumen >= 1 && this.estado == true) {
			this.volumen = nuevoVolumen;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getNumTV() {
		return numTV++;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean getEstado() {
		return estado;
	}

	
	public void turnOn() { // Encender 
		if(this.estado == false) {
			this.estado = true;
			
		}
	}
	public void turnOff() {
		if(this.estado == true) {
			this.estado = false;
			
		}
	}
	public void canalUp(){
			if(this.canal >= 120 && this.canal <= 1 && this.estado ==  true ) {
				this.canal++;
			}
	}
	public void canalDown(){
			if(this.canal >= 120 && this.canal <= 1 && this.estado == true ) {	
				this.canal++;
			}
		}
	
	public void volumenUp(){
			if(this.volumen >= 7 && this.volumen <= 1 && this.estado == true) {
				this.volumen++;
			}		
		}
		
	public void volumenDown(){
			if(this.volumen >= 7 && this.volumen <= 1 && this.estado == true ) {
				this.volumen--;
			}
	}
		
}

