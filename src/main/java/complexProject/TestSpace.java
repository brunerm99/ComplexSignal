package complexProject;

public class TestSpace {
	public static void main(String[] args) {
		complexNumber cm = new complexNumber(0, 3);
		complexSignal sig = new complexSignal(cm);
		System.out.println(sig.toTime());
		//System.out.println(sig);
	}
}
