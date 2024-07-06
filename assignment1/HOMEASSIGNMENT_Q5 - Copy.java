package assignment1;

public class HOMEASSIGNMENT_Q5 {

	public static void main(String[] args) {
		 int W = 1, G = 2, K = 3, A = 4;
	        int X;

	        System.out.println("Before swapping: W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

	        X = W;
	        W = G;
	        G = K;
	        K = A;
	        A = X;

	        System.out.println("After swapping: W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
	}

}
