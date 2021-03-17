package taller3.televisores;

public class Control {
	TV tv;
	
	
	public void setTV (TV nuevoTV) {
		this.tv = nuevoTV;
	}
	public TV getTv () {
		return this.tv;
	}
	
	
	public void enlazar (TV EnlaceTV) {
		this.tv = EnlaceTV;
		EnlaceTV.control = this;
	}
	
	
	public void turnOn () {
		this.tv.turnOn();
	}
	public void turnOff () {
		this.tv.turnOff();
	}
	
	
	public void canalUp () {
		this.tv.canalUp();
	}
	public void canalDown () {
		this.tv.canalDown();
	}
	
	// Aumentar y bajar volumen
	
	public void volumenUp () {
		this.tv.volumenUp();
	}
	public void volumenDown () {
		this.tv.volumenDown();
	}
	
	
	public void setCanal (int ControlCanal) {
		this.tv.setCanal(ControlCanal);
	}
}


