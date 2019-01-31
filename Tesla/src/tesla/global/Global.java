package tesla.global;
import java.util.*;
import tesla.vehicle.*; 

public class Global {
	private static ArrayList<Vehicle> arr_list = null;
	private static ListIterator iter = null;
	private Global() {
		
	}
	public static ArrayList getInstance() {
		if(arr_list == null) {
			arr_list = new ArrayList();
		}
		return arr_list;
	}
	public static ListIterator getIterator() {
		if(iter == null) {
			iter = arr_list.listIterator();
		}
		return iter;
	}
}
