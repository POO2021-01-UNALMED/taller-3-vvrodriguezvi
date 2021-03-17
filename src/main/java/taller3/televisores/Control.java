package taller3.televisores;

public class Control {
	TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
		
	}

	public Control(TV tv) {
		this.tv = tv;
		TV.numTV++;
		
	}
	
	// metodos compartidos con tv
	
	public void turnOn() {
		this.tv.turnOff(tv.getEstado());
	}
	public void turnOff() {
		this.tv.turnOff(tv.getEstado());
	}
	public void  canalUp() {
		this.tv.canalUp(tv.getCanal());
	}
	public void  canalDown() {
		this.tv.canalDown(tv.getCanal());
	}
	public void volumenUp() {
		this.tv.volumenUp(tv.getVolumen());
	}
	public void volumenDownn() {
		this.tv.volumenDown(tv.getVolumen());
	}
	public void setCanal() {
		this.tv.setCanal(tv.canal);
	}
	
	// metodos enlazar
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
		
	}
}
