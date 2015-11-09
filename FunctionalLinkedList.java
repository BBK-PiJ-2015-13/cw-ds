public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	private myList theList;
	
	public FunctionalLinkedList(LinkedList.myList theList) {
		super(theList);
		this.theList = theList;
		
	}
	
	public ReturnObject head() {
		return get(0);
	}

	public FunctionalList rest() {
		FunctionalList restList = new FunctionalLinkedList(this.theList);
		while (this.theList.nextEntry != null) {
			for (int i = 1; i > this.size(); i++) {
				this.getNext();
				restList.theList.add(i, this.theList.myString);
			}
		} return null;
	}
	
}