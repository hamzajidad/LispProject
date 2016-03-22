package jus.aoo.Lisp.kernel;

public interface SExpr {
	
			public boolean isAtom(); 

			public boolean isList();
		  
			public boolean isNil();
			
			public SExpr eval() ;
			
			public boolean eq(SExpr expression);			
			
			public SExpr car();
			
			public SExpr cdr();
			
			public String toString();
}
