package Ex04;

public class BlackAndWhiteFilterStrategy implements  ImageFilterStrategy{

    @Override
    public void applyFilter(String image) {

        System.out.println("Aplicar filtro preto e branco na imagem " + image);

    }
}
