package Controller;

public class Rec {
	public int Rec_C(int N) {
		if (N > 0) {
			N = 1+Rec_C((int)N/10);
			return N;
		}else {
			return 0;
		}
	}
}