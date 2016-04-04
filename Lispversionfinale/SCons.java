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
	@Override public boolean isList(){ return true;}
	@Override public boolean isAtom(){ return false;}
	@Override public boolean isNil(){ return false;}
	@Override public boolean isCons(){return true;}

	
	public String toString(){
		SExpr courant = this;
		String chaine = "(";
		while((courant.isCons())){
			chaine += courant.car().toString()+ " ";
			courant = courant.cdr();
		}
		if(courant.isNil())return chaine +=")";
		return chaine += " . "+ courant.toString()+")";
	}

	public SExpr eval(){
		SExpr foncteur = this.car();
		SExpr fonction = foncteur.eval();
		if (fonction.isPrimitive()){
			return ((Primitive)fonction).reduction(fonction,cdr());
		}else{
			if (fonction.car().toString() == "lambda"){
				Expr lambda = new Expr();
				return lambda.reduction(fonction, this.cdr);
			}
			else if (fonction.car().toString() == "flambda"){
				FExpr flambda = new FExpr();
				return flambda.reduction(fonction, this.cdr);
			}
			else throw new LispException("ERREUR");
		}
	}

	public boolean eq(SExpr exp) {
		if (!(exp.isList())){
			return(this.car().eq(exp.car()) && this.cdr().eq(exp.cdr()));
		}
		return false;
	}

	@Override
	public boolean isPrimitive() {
		return false;
	}
}
