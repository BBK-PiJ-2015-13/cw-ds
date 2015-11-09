public class LinkedList implements List {
	
	private class myList {

	private String myString;
	private myList nextEntry;
	
	public myList(String myString) {
		this.myString = myString;
		this.nextEntry = null;
	}
	
	}
	
	private myList theList;
	
	public LinkedList(myList theList) {
		this.theList = theList;
	}
	
	static void main(String[] args) {
		LinkedList f = new LinkedList(null);
		f.launch();
	}
	
	public void launch() {
		myList firstEntry = new myList("Hello");
		myList secondEntry = new myList("Goodbye");
		firstEntry.nextEntry = secondEntry;
	}
	
	public boolean isEmpty() {
		if (this.theList.myString == null) {
			return true;
		} else {
			return false;
		}
	}


	public int size() {
		int counter = 0;
		while (this.theList.nextEntry != null) {
			if (this.theList.myString != "") {
				counter++;
			}
			this.getNext();
		}
		return counter;
	}

	public ReturnObject get(int index) {
		for (int i = 0; i <= index; i++) {
			if (i != index) {
				this.getNext();
			} else if (i == index) {
				String[] tempArray = {this.theList.myString};
				ReturnObject temp = new ReturnObjectImpl(tempArray, 0, this.theList.myString);
				return temp;
			}
		}
		return null;
	}

	public ReturnObject remove(int index) {
		if (this.get(index) == null) {
			return null;
		} else {
			for (int i = 0; i <= index; i++) {
				if (i != index) {
					this.getNext();
				} else if (i == index) {
					this.theList.nextEntry = theList.nextEntry.nextEntry;
					return this.get(index);
				}
			}
		} return null;
	}


	public ReturnObject add(int index, String item) {
		if (this.get(index) == null) {
			return null;
		} else {
			for (int i = 0; i <= index; i++) {
				if (i != index) {
					this.getNext();
				} else if (i == index) {
					myList newList = new myList(item);
					newList.nextEntry = this.theList.nextEntry;
					this.theList.nextEntry = newList;
				}
			}
		} return null;
	}

	
	
	public ReturnObject add(String item) {
		if (item == null) {
			return null;
		} else {
			while (this.theList.nextEntry != null) {
				this.getNext();
			}
			this.theList.nextEntry.myString = item;
			this.theList.nextEntry.nextEntry = null;
			String[] tempArray = {this.theList.nextEntry.myString};
			ReturnObject placeholder = new ReturnObjectImpl(tempArray, 0, this.theList.nextEntry.myString);
			return placeholder;
		}
	}
	
	public void getNext() {
		this.theList.nextEntry = theList.nextEntry.nextEntry;
	}
	
	public ReturnObject add(int index, Object item) {return null;}
	
	public ReturnObject add(Object item) {return null;}
	
}