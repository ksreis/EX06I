package Controller;

public class Somar {
		public Somar() {
			super();
	}
		
		public static double sRec(int n) {
		    if (n == 1) {
		        return 1;
		    } else {
		        return sRec(n - 1) + 1.0 / B(n);
		    }
		}

		public static int B(int n) {
		    if (n == 1) {
		        return 1;
		    } else {
		        return n * B(n - 1);
		    }
		}
}
