import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class TestListedlist {
	public static void main(String[] args){
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(0,100);
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
