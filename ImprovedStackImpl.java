public class ImprovedStackImpl implements ImprovedStack {
	
	private String[] myArray = new String[1];
	
	public ImprovedStackImpl(String[] myArray) {
		super();
		this.myArray = myArray;
	}
	
	public void main(String[] args) {
		launch();
	}
	
	public void launch() {
		String[] testArray = new String[1];
		ImprovedStackImpl yorStack = new ImprovedStackImpl(testArray);
		yorStack.reverse();
	}
	
	public ImprovedStack reverse() {
		String[] result = new String[this.myArray.length];
		for (int i = 0; i < this.myArray.length; i++) {
			result[myArray.length - i] = this.myArray[i];
		}
		ImprovedStack gyakku = new ImprovedStackImpl(result);
		return gyakku;
	}
	
	public void remove(Object object) {
		for (int i = 0; i < this.myArray.length; i++) {
			if (this.myArray[i].equals(object)) {
				this.myArray[i] = null;
			}
		}
	}
	
	public ReturnObject pop() {
		return null;
	}
	
	public ReturnObject top(){return null;}
	
	public void push(Object item){}
	
	public int size(){return 0;}
	
	public boolean isEmpty(){return false;}
}