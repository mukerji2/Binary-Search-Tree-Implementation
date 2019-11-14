// Students may use and edit this class as they choose
// Students may add or remove or edit fields, methods, constructors for this class
// Students may inherit from an use this class in any way internally in other classes.
// Students are not required to use this class. 
// BUT, IF YOUR CODE USES THIS CLASS, BE SURE TO SUBMIT THIS CLASS
//
// RECOMMENDED: do not use public or private visibility modifiers
// package level access means that all classes in the package can access directly.
//
// Classes that use this type:  <TODO, list which if any classes use this type>
class BSTNode<K extends Comparable<K>,V> {
	
	K key;
	V value;
	BSTNode<K,V> left;
	BSTNode<K,V> right;
	int balanceFactor;
	int height;
	

	/**
	 * @param key
	 * @param value
	 * @param leftChild
	 * @param rightChild
	 */
	BSTNode(K key, V value, BSTNode<K,V>  leftChild, BSTNode<K,V> rightChild) {
		this.key = key;
		this.value = value;
		this.left = leftChild;
		this.right = rightChild;
		this.height = 0;
		this.balanceFactor = 0;
	}
	
	BSTNode(K key, V value) { 
	  this(key,value,null,null); 
	}
	
	public K getKey() {
	  return this.key;
	}
	
	public BSTNode<K,V> getLeftChild() {
	  return this.left;
	}
	
	public BSTNode<K,V> getRightChild() {
      return this.right;
    }
	
	public void setRightChild(K key, V value) {
	  this.right = new BSTNode(key, value);
	}
	
	public void setLeftChild(K key, V value) {
      this.left = new BSTNode(key, value);
    }
	
	public void setRightChild(BSTNode<K,V> rightChild) {
	  this.right = rightChild;
	}
	
	public void setLeftChild(BSTNode<K,V> leftChild) {
      this.left = leftChild;
    }
	
	public V getVal() {
	  return this.value;
	}
	
	public void setKey(K key) {
	  this.key = key;
	}
	
	public void setVal(V value) {
	  this.value = value;
	}
	
	 
}
