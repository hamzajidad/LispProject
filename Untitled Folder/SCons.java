package jus.aoo.Lisp.kernel;


public class SCons implements List{
	private SExpr car;
	private SExpr cdr;

	public SCons(SCons clone){
		car = clone.car();
		cdr = clone.cdr();
	}

	public SCons(SExpr a1, SExpr a2){
		car = a1;
		cdr = a2;
	}

	public SExpr car(){return car;}
	public SExpr cdr(){return cdr;}
	public boolean isList(){ return true;}
	public boolean isAtom(){ return false;}
	public boolean isNil(){ return false;}
	
	public String toString(){
		SExpr courant = new SCons(this);
		String chaine = "(";
		while(!(courant.cdr().isAtom())){
			chaine += courant.car().toString()+" ";
			courant = courant.cdr();
		}
		return chaine += courant.car().toString()+"."+courant.cdr().toString()+")";
	}
	
	public SExpr eval(){
		SExpr evaluation = new SCons(car().eval(),cdr().eval());
		return evaluation;
	}

	public boolean eq(SExpr exp) {
		if (!(exp.isList())){
			return(this.car().eq(exp.car()) && this.cdr().eq(exp.cdr()));
		}
		return false;
	}
}
