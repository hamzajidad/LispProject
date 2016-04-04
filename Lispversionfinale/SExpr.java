package jus.aoo.Lisp.kernel;

public interface SExpr {
	// Permet de déterminer si l'objet courant est un Atome ou non.	
		public boolean isAtom(); 
	// Permet de déterminer si l'objet courant est une Liste ou non.
		public boolean isList();
	// Permet de déterminer si l'objet courant est de type Nil ou non.	  
		public boolean isNil();
			
		public SExpr eval() ;
			
		public boolean eq(SExpr expression);			
			
		public SExpr car();
			
		public SExpr cdr();
			
		public String toString();
	// Permet de déterminer si l'objet courant est de type SCons ou non.
		public boolean isCons();
	// Permet de déterminer si l'objet courant est une Primitive ou non.	
		public boolean isPrimitive();
}
