package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfAirCrafts {
	public static void main(String[] args) {
		
		List<Aircraft> aircrafts=new ArrayList<Aircraft>();
		aircrafts.add(new Aircraft("ar123", 100));
		aircrafts.add(new Aircraft("ar133", 200));
		aircrafts.add(new Aircraft("ar143", 300));
		aircrafts.add(new Aircraft("ar153", 400));
		aircrafts.add(new Aircraft("ar163", 500));
		aircrafts.add(new Aircraft("ar173", 600));
		aircrafts.add(new Aircraft("ar183", 650));
		aircrafts.add(new Aircraft("ar193", 850));
		aircrafts.add(new Aircraft(null, 950));
		
		List<Aircraft> collect = aircrafts.stream().filter(e->e.getCapacity()>200).collect(Collectors.toList());

		 List<Boolean> resultedAircrafts = aircrafts.stream().filter(e->e.getTailplates()!=null).
				map(e->(e.getCapacity()*3%100==0)).collect(Collectors.toList());
				
			
//		+e.getTailplates()).forEach(s->);
		System.out.println(resultedAircrafts);
		
	}

}
