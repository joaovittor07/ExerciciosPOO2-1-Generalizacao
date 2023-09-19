package Item;

public class ItemMain {

	public static void main(String[] args) {
		
		Item i = new Item();
		i.setCodigo(000);
		i.setDescricao("Medio");
		System.out.println(i);
		
		Livro l = new Livro();
		l.setAutor("João");
		System.out.println(l);
		
		Midia m = new Midia();
		m.setGravadora("JP");
		m.setDuracao(100);
		System.out.println(m);
		
		CD cd = new CD();
		cd.setFaixa(00);
		cd.setArtista("João");
		cd.setAlbum("V");
		System.out.println(cd);
		
		VHS vhs = new VHS();
		vhs.setTitulo("Mid");
		System.out.println(vhs);
	
	}

}
