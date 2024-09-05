package interview;

import java.util.List;
import java.util.stream.Collectors;

public class Aircraft {
	private String tailplates;
	private int capacity;
	
	
	public Aircraft(String tailplates, int capacity) {
		this.tailplates = tailplates;
		this.capacity = capacity;
	}
	public String getTailplates() {
		return tailplates;
	}
	public void setTailplates(String tailplates) {
		this.tailplates = tailplates;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
//	List<String> collect2 = aircrafts.stream().filter(e->e.getTailplates()!=null&& e.getTailplates().contains("ar") )
//			.map(e->e.getCapacity()*0.03+":"+e.getTailplates()).collect(Collectors.toList());

	

}
