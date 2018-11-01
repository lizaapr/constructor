public class Korea extends Film{
	
	public int jml_eps;
	public String genre;

	public Korea(String nama, int jml_eps){
		super(nama);		
		this.jml_eps = jml_eps;
	}

	public Korea(String nama){
		super(nama);
	}


	public void showjmlEpisode(){
		System.out.println("Jumlah episode = "+jml_eps);
	}
	 public void showGenre(String genre){
	 	System.out.println("Genre = "+genre);

	 }

}