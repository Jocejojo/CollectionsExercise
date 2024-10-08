package collectionsJoce;

public class MySortedSet <T extends Comparable<T>>{

	
	private T[] data = (T[]) new Comparable[10];
	
	//number of items added to the set must be < data.length
	private int size = 10;
	
	public boolean add(T value) {
		//Insert the item in the correct sorted place in data
		//Expands the array if it is not big enough (double sizes)
		
		int index = findIndexByLoop(value);
		if (value.equals(data[index])) {
			return false;
		}
		if(data.length -1 == size) {
			T[] data2 = (T[]) new Comparable[data.length *2];
			for (int i = 0; i < data.length ; i ++) {
				data2[i] = data[i];
			}
			data = data2;
		}
		for(int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		size++;
		data[index] = value;
		
		return true;
	}
	
	
	
	public boolean contains(T value) {
		// Use binary search to find the item in the sorted data
		int index = findIndex(value, 0, size);
		if (value.equals(data[index])) {
			return true;
		}
		return false;
	}
	
	public boolean romove(T value) {
		// Remove the item from the data array
		
		return true;
	}
	
	private int findIndexByLoop(T value) {
		int low = 0;
		int high = size;
		while(low != high) {
			int mid = (low + high) / 2;
			T item = data[mid];
			int compareResult = value.compareTo(item);
			if(compareResult < 0) {
				high = mid;
			}else if(compareResult > 0) {
				low = mid + 1;
			}else {
				return mid;
			}			
		}
		return low;
	}
	
	private int findIndex(T value, int low, int high) {
		if(low == high) {
			return low;
		}
		
		int mid = low + (high - low) / 2;
		int compareResult = value.compareTo(this.data[mid]);
		
		if(compareResult < 0) {
			return findIndex(value, low, high);
		}else if (compareResult > 0) {
			return findIndex(value, low, high);
		}else {
			return mid;
		}
	}
}
