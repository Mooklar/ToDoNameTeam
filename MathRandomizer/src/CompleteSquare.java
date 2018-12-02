
public class CompleteSquare {
	double rightHS, d, e, x1, x2;

	public void completeSolve (double a, double b, double c) {
		//factor out a and put in form a(x+d^2 + e = 0)
		d = (b/(2*a));
		e = c - ((b*b)/(4*a));
		//move e to the right hand side
		rightHS = -1*e;

		//solve for x
		x1 = (Math.sqrt(rightHS/a)-d);
		x2 = (-Math.sqrt(rightHS/a)-d);
	}
}