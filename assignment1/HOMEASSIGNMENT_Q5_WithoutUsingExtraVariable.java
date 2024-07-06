package assignment1;

public class HOMEASSIGNMENT_Q5_WithoutUsingExtraVariable {

	public static void main(String[] args) {
		int W = 1, G = 2, K = 3, A = 4;

        System.out.println("Before swapping: W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        W = W + G;
        G = W - G;
        W = W - G;

        W = W + K;
        K = W - K;
        W = W - K;

        W = W + A;
        A = W - A;
        W = W - A;

        System.out.println("After swapping: W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

	}

}
