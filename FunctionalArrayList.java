public class FunctionalArrayList extends ArrayList implements FunctionalList {

	private String[] myStringArray = new String[1];
	
	public FunctionalArrayList(String[] myStringArray){
		super(myStringArray);
		this.myStringArray = myStringArray;
	}

	public ReturnObject head(){
		ReturnObject temp = new ReturnObjectImpl(this.myStringArray, 0, "A");
		if (temp.hasError() == false) {	
			String result = this.myStringArray[0];
			ReturnObject temp2 = new ReturnObjectImpl(this.myStringArray, 0, "");
			return temp;
		} else {
			return null;
		}
	}
	
	public FunctionalList rest() {
		ReturnObject temp = new ReturnObjectImpl(this.myStringArray, 0, "A");
		if (temp.hasError() != false) {
			String[] result = new String[this.myStringArray.length - 1];
			for (int i = 0; i < (this.myStringArray.length - 1); i++) {
				result[i] = this.myStringArray[i];
			}
			FunctionalList placeholder = new FunctionalArrayList(result);
			return placeholder;
		} else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public int size() {
		return super.size();
	}

	public ReturnObject get(int index) {
		return super.get(index);
	}

	public ReturnObject remove(int index) {
		return super.remove(index);
	}

	public ReturnObject add(int index, String item) {
		return super.add(index, item);
	}

	
	public ReturnObject add(String item) {
		return super.add(item);
	}
	
	public ReturnObject add(int index, Object item){return null;}
	
	public ReturnObject add(Object item) {return null;}
	
}