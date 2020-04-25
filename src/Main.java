import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		Random r = new Random();

		for (int i = 1; i <= 500; i++) {
			list.add(r.nextInt(100));
		}

		System.out.println(list);

		NumberSorter<Integer> sorter = new NumberSorter(new LinkedList(list));
		System.out.println(sorter.getSortedNumbers());

	}
}
