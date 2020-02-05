package complexProject;

public class complexNumber {
	
	double re;
	double im;
	
	public complexNumber() {
		this.re = 0;
		this.im = 0;
	}
	public complexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public String toString() {
		if (im == 0) return "" + re;
		if (re == 0) return "j" + im;
		return re + " + j" + im;
	}
}

