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

	public void setCanal(int canal) {
		this.canal = canal;
		if(this.canal <= 1 && this.canal >=1) {
			return;
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

	public void setVolumen(int volumen) {
		this.volumen = volumen;
		if(this.volumen <= 7 && this.volumen >= 1) {
			this.volumen = volumen;
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

	
	public void turnOn(boolean estado) { // Encender 
		if(this.estado == false) {
			setEstado(true);
			return;
			
		}
	}
	public void turnOff(boolean estado) {
		if(this.estado == true) {
			setEstado(false);
			return;
			
		}
	}
	public void canalUp(int canal){
		if(this.estado =  true) {
			if(this.canal > 120 && this.canal < 1 ) {
				this.canal++;
			}
		}
	}
	public void canalDown(int canal){
		if(this.estado=  true) {
			if(this.canal > 120 && this.canal < 1 ) {
				this.canal--;
			}
		}
	}
	public void volumenUp(int volumen){
		if(this.estado = true) {
			if(this.volumen > 7 && this.volumen < 1 ) {
				this.volumen++;
			}		
		}
		
	}
	public void volumenDown(int volumen){
		if(this.estado = true) {
			if(this.volumen > 7 && this.volumen < 1 ) {
				this.volumen--;
			}
		}
	}
} 