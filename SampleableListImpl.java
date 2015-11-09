public class SampleableListImpl implements SampleableList {
	
	private String[] list = new String[1];
	
	public SampleableListImpl() {
		super();
		this.list = null;
	}

	public SampleableList sample() {
		String[] result = new String[this.list.length / 2];
		ReturnObject temp = new ReturnObjectImpl(this.list, 0, "");
		if (temp.getReturnValue() != null) {
			for (int i = 0; i < this.list.length; i++) {
				if (i % 2 == 0) {
					result[i/2] = this.list[i];
				}
			}
			SampleableListImpl kekka = new SampleableListImpl();
			kekka.list = result;
			return kekka;
		} else {
			SampleableListImpl empty = new SampleableListImpl();
			return empty;
		}
	}

	public boolean isEmpty() {return false;}
	
	public int size() {
		return 0;
	}

	public ReturnObject get(int index) {
		return null;
	}

	public ReturnObject remove(int index) {
		return null;
	}

	public ReturnObject add(int index, String item) {
		return null;
	}

	
	public ReturnObject add(String item) {
		return null;
	}
	
	public ReturnObject add(int index, Object item){return null;}
	
	public ReturnObject add(Object item) {return null;}
}