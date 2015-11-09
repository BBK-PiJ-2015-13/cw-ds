public class StackImpl extends AbstractStack {

	protected List internalList;
	
	public StackImpl(List internalList) {
		super(internalList);
		this.internalList = internalList;
	}
	
	public AbstractStack AbstractStack(List list) {
	  this.internalList = list;
	  AbstractStack abs = new StackImpl(list);
	  return abs;
    }
	
	public ReturnObject pop() {
		return null;
	}
	
	public ReturnObject top(){return null;}
	
	public void push(Object item){}
	
	public int size(){return 0;}
	
	public boolean isEmpty(){return false;}
}