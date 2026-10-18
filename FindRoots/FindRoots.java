public class FindRoots {
    public static void main(String[] args) {
        // Define the coefficients of the polynomial
        double[] coefficients = {-1, 3, -1, -5, 7};

        // Find the roots using the Newton-Raphson method
        double[] roots = findRoots(coefficients);

        // Print the roots
        System.out.println("Roots:");
        for (double root : roots) {
            System.out.println(root);
        }
    }

    // Newton-Raphson method to find roots
    private static double[] findRoots(double[] coefficients) {
        int degree = coefficients.length - 1;
        double[] roots = new double[degree];

        // Initial guess for the roots
        for (int i = 0; i < degree; i++) {
            double x = i; // You can adjust the initial guess as needed
            roots[i] = newtonRaphson(coefficients, x);
        }

        return roots;
    }

    private static double newtonRaphson(double[] coefficients, double x0) {
        double x = x0;
        final double EPSILON = 1e-10;

        while (true) {
            double f = evaluatePolynomial(coefficients, x);
            double fPrime = evaluatePolynomialDerivative(coefficients, x);

            double x1 = x - f / fPrime;

            if (Math.abs(x1 - x) < EPSILON) {
                return x1;
            }

            x = x1;
        }
    }

    private static double evaluatePolynomial(double[] coefficients, double x) {
        double result = 0.0;
        int degree = coefficients.length - 1;

        for (int i = degree; i >= 0; i--) {
            result = result * x + coefficients[i];
        }

        return result;
    }

    private static double evaluatePolynomialDerivative(double[] coefficients, double x) {
        double result = 0.0;
        int degree = coefficients.length - 1;

        for (int i = degree; i > 0; i--) {
            result = result * x + i * coefficients[i];
        }

        return result;
    }
}
