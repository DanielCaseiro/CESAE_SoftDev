package Ex04;

public class ImageProcessor {
    private ImageFilterStrategy imageFilterStrategy;

    public ImageProcessor(ImageFilterStrategy imageFilterStrategy) {
        this.imageFilterStrategy = imageFilterStrategy;
    }

    public void applyFilter(String image){
        this.imageFilterStrategy.applyFilter(image);
    }
}
