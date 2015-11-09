public class ArrayList {

	private String[] myStringArray = new String[1];
	
	public ArrayList(String[] myStringArray) {
		this.myStringArray = myStringArray;
	}
	
	public void main(String[] args) {
		ArrayList startArraylist = new ArrayList(null);
		startArraylist.launch();
	}
	
	public void launch() {
		String[] testArray = {"Tom", "Dad"};
		ArrayList array1 = new ArrayList(testArray);
	}
	
	public boolean isEmpty() {
		if (myStringArray.length <= 0) {
			return true;
		} else {
			for (int i = 0; i < myStringArray.length; i++) {
				if (myStringArray[i] != "") {
					return false;
				}
			}
			return true;
		}
	}

	public int size() {
		int counter = 0;
		for (int i = 0; i < myStringArray.length; i++) {
			if (myStringArray[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	public ReturnObject get(int index) {
		ReturnObject temp = new ReturnObjectImpl(myStringArray, index, null);
		if (temp.getReturnValue() == null) {
			return null;
		} else {
			return temp;
		}
	}
	
	public ReturnObject remove(int index) {
		ReturnObject temp = new ReturnObjectImpl(myStringArray, index, null);
		if (this.get(index) != null) {  
			if (this.myStringArray[index] != null) {
					this.myStringArray[index] = null;
			}
		}return temp;
	}
	
	public ReturnObject add(int index, String item) {
		ReturnObject temp = new ReturnObjectImpl(myStringArray, index, item);
		if (get(index) == null) {
			return temp;
		} else {
			if (myStringArray[index] != null) {
				this.myStringArray[index] = item;
			}
		}
		return temp;
	}
	
	public ReturnObject add(String item) {
		int placeholder = 0;
		ReturnObject temp = new ReturnObjectImpl(myStringArray, placeholder, item);
		if (placeholder == 0) {
			return temp;
		} else {
			this.myStringArray[myStringArray.length - 1] = item;
			return temp;
		}
	}
	
}