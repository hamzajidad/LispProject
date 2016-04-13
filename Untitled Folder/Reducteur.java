package jus.aoo.Lisp.kernel;

public abstract class Reducteur implements Reducer{
	
	@Override
	public SExpr apply(SExpr fonction, SExpr args){
		Context.bind(fonction.cdr().car(),args);
		SExpr r = fonction.cdr().cdr().car().eval();
		Context.unBind(fonction.cdr().car());
		return r;
	}

	@Override
	public SExpr reduction(SExpr fonction, SExpr args) {
		SExpr listeArgs = listEval(args);
		return apply(fonction,listeArgs);
	}
	
	protected abstract SExpr listEval(SExpr args);
}
