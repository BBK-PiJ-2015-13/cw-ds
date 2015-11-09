public class ReturnObjectImpl implements ReturnObject {
	
	private String[] myArray;
	
	private int inDex;
	
	private String iTem;
	
	public ReturnObjectImpl(String[] myArray, int inDex, String iTem) {
		this.myArray = myArray;
		this.inDex = inDex;
		this.iTem = iTem;
	}
	
	public boolean hasError() {
		if (this.myArray == null) {
			return true;
		} else if (this.inDex < 0 || this.inDex >= this.myArray.length) {
			return true;
		} else if (this.iTem == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public ErrorMessage getError() {
		if (!this.hasError()) {
			return ErrorMessage.NO_ERROR;
		} else if (this.myArray == null) {
			return ErrorMessage.EMPTY_STRUCTURE;
		} else if (this.inDex < 0 || this.inDex >= this.myArray.length) {
			return ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else if (this.iTem == null) {
			return ErrorMessage.INVALID_ARGUMENT;
		} else {
			return ErrorMessage.NO_ERROR;
		}
	}
	
	public Object getReturnValue() {
		if(!this.hasError()) {
			return this.myArray[inDex];
		} else {
			return this.getError();
		}
	}

}