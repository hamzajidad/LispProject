package jus.aoo.Lisp.kernel;

public class Cdr {

	public Cdr(){}
	public SExpr Reduction(SCons s){return s.cdr().cdr().eval();}
	
}
