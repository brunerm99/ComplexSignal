package complexProject;

import java.lang.Math.*;

public class complexSignal {
	
	double phase;
	double magnitude;

	public complexSignal() {
		
	}
	
	public complexSignal(complexNumber cm) {
		this.magnitude = Math.sqrt(Math.pow(cm.re, 2) + Math.pow(cm.im, 2));
		if (cm.re != 0) this.phase = Math.atan(cm.im / cm.re);
		else if (cm.re == 0 && cm.im != 0) this.phase = 90;
		else this.phase = 0;
	}
	
	public String toString() {
		return this.magnitude + "<" + this.phase;
	}

}

