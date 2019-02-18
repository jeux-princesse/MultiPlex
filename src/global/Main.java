package global;

public class Main {

	public static void main(String[] args) {
		BoardManager<Character> bm = new BoardManager<>(5, 5);
		bm.insert(2, 3, 'a');
		bm.show();
		System.out.println();
		BoardManager<String> bm2 = new BoardManager<>(5, 5);
		bm2.insert(2, 3, "AA");
		bm2.show();

	}

}
