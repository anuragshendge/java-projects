package random.practice;

public class EmptyBST<D extends Comparable> implements Tree<D> {

	
	public EmptyBST(){
		
	}
	public boolean isEmpty(){
		return true;
	}
	
	public int cardinality(){
		return 0;
	}
	public boolean member(D ele){
		return false;	
	}
	
	public NonEmptyBST<D> add(D ele){
		return new NonEmptyBST<D>(ele );
	}

		

}

