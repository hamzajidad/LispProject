package jus.aoo.Lisp.kernel;

public abstract class Atome implements SExpr{

	@Override public boolean isAtom(){return true;}
	@Override public boolean isList(){return false;}
	@Override public boolean isNil(){return false;}
	@Override public boolean eq(SExpr expression){return this==expression;}
	@Override public SExpr eval() {return this;}
	@Override public SExpr car() { throw new LispException("car non applicable à un atome");}
	@Override public SExpr cdr() { throw new LispException("cdr non applicable à un atome");}
	@Override public boolean isCons(){return false;}
	public boolean isPrimitive(){ return false;}
	
}
