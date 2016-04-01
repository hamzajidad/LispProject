package jus.aoo.Lisp.kernel;

public class Expr extends Reducteur{

	/* evalue foncteur
	 * construire liste arg en les évaluant
	 * appliquer foncteur à la liste des args evaluée*/
	
	protected SExpr listEval(SExpr args){
	
		SExpr listeEvalue = new SCons(args.car().eval(), args.car().eval());
		return listeEvalue;
	}
}
