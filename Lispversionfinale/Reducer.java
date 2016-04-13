package jus.aoo.Lisp.kernel;

public interface Reducer {
	public SExpr apply(SExpr fonct, SExpr args);
	public SExpr reduction(SExpr fonction, SExpr args);
}
