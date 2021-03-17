package taller3.televisores;

public class Control {
	TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
		
		
	}
	
	// metodos compartidos con tv
	
	public void turnOn() {
		this.tv.turnOff();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void  canalUp() {
		this.tv.canalUp();
	}
	public void  canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDownn() {
		this.tv.volumenDown();
	}
	public void setCanal(int ControlCanal) {
		this.tv.setCanal(ControlCanal);
	}
	
	// metodos enlazar
	
	public void enlazar(TV tv) {
		this.tv = tv;
		
	}
}

