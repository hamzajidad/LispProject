package jus.aoo.Lisp.kernel;

public class FExpr extends Reducteur{

	/* evalue foncteur
	 * construire liste arg sans les évaluer
	 * appliquer foncteur à la liste des args*/
	
	protected SExpr listEval(SExpr args){
		return args;
	}
	
}
