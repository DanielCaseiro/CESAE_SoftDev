package Ex04;

public class SepiaFilterStrategy implements  ImageFilterStrategy{

    @Override
    public void applyFilter(String image) {

        System.out.println("Aplicar filtro sépia na imagem " + image);

    }
}
