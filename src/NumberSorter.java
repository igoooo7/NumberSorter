import java.util.LinkedList;

public class NumberSorter<T extends Number> {

	private LinkedList<T> numbers;

	public NumberSorter() {

	}

	public NumberSorter(LinkedList<T> numbers) {
		this.numbers = numbers;
	}

	public LinkedList<T> getNumbers() {
		return numbers;
	}

	public void setNumbers(LinkedList<T> numbers) {
		this.numbers = numbers;
	}

	public LinkedList<Double> getSortedNumbers() {

		LinkedList<Double> dl = new LinkedList<>();

		for (T num : numbers) {
			dl.add(Double.parseDouble(num.toString()));
		}

		Boolean sorted = true;
		int i = -1;

		while (true) {

			i++;
			if (i < (dl.size() - 1)) {
				if (dl.get(i + 1) < dl.get(i)) {
					Double tmp = dl.get(i);
					dl.set(i, dl.get(i + 1));
					dl.set(i + 1, tmp);
					sorted = false;
				}
			}

			if (i >= dl.size() && sorted) {
				break;
			} else if (i >= dl.size() && !sorted) {
				sorted = true;
				i = -1;
			}
		}
		return dl;
	}
}
