package class_design.immutable_classes;

public class complex {
	
	private final double real;
	private final double imaginary;
	
	public complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public complex plus(complex b) {
		double newReal = real + b.real;
		double newImaginary = imaginary + b.imaginary;
		return new complex(newReal, newImaginary);
	}
	
	public complex minus(complex b) {
		double newReal = real - b.real;
		double newImaginary = imaginary - b.imaginary;
		return new complex(newReal, newImaginary);
	}
	
	public complex times(complex b) {
		double newReal = real * b.real - imaginary * b.imaginary;
		double newImaginary = real * b.imaginary + imaginary * b.real;
		return new complex(newReal, newImaginary);
	}
	
	public static complex plus(complex a, complex b) {
		double real = a.real + b.real;
		double imaginary = a.imaginary + b.imaginary;
		return new complex(real, imaginary);
		// can also comment the 3 line above and write like this
        // return a.plus(b);
	}
	
	public static void main(String[] args) {
		complex a = new complex(5.0, 6.0);
		complex b = new complex(-3.0, 4.0);
		
		complex bPlusA = b.plus(a);
		complex bPlusA2 = complex.plus(a, b);
		
		System.out.println("a real= " + a.real + " imaginary= " + a.imaginary);
		System.out.println("b real= " + b.real + " imaginary= " + b.imaginary);
		System.out.println("b + a real= " + bPlusA.real + " imaginary= " + bPlusA.imaginary);
		System.out.println("b + a real= " + bPlusA2.real + " imaginary= " + bPlusA2.imaginary);

	}

}
