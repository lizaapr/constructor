public class FilmTest {
	public static void main(String[] args) {
		Korea m1 = new Korea("The Heirs",20);
		m1.showNama();
		m1.showjmlEpisode();
		m1.showGenre("Romance");
		System.out.println("=========================");

		Korea m2 = new Korea ("Train to Busan");
		m2.showNama();
		m2.showjmlEpisode();
		m2.showGenre("Horror");

	}
}