package Ex04;

public class VintageFilterStrategy implements ImageFilterStrategy{

    @Override
    public void applyFilter(String image) {

        System.out.println("Aplicar filtro vintage na imagem " + image);

    }
}
