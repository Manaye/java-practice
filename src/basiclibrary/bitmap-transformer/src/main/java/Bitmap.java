import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Bitmap {

    public static void bitmapTransformer(){
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter input image file path");
//        String inputPath = reader.nextLine();
//
//        System.out.println(inputPath);
//        System.out.println("Enter output image file path");
//        String outputPath = reader.nextLine();
//        System.out.println(outputPath);
//        System.out.println("please give name to your output file");
//        String filename = reader.nextLine();
//        System.out.println(filename);
//        reader.close();
        transformImage();
    }
    //getBitmap
    public static void transformImage(){
        File imageFile = new File("C:\\Users\\hiwot\\OneDrive\\Desktop\\asset\\me-me.jpg");
        BufferedImage img = null;
        try{
            img = ImageIO.read(imageFile);
            BufferedImage grayscaleImage =  new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
            for(int i = 0; i<img.getWidth(); i++){
                for(int j = 0; j<img.getWidth(); j++){
                    Color c = new Color(img.getRGB(j,i));
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    int a = c.getAlpha();
                    //gray scaling
                    int gr = (r+g+b)/3;
                    //create grey color
                    Color gColor = new Color(gr,gr,gr,a);
                    grayscaleImage.setRGB(j,i,gColor.getRGB());

                }

            }
            ImageIO.write(grayscaleImage, "jpg", new File("C:\\Users\\hiwot\\OneDrive\\Desktop\\asset\\me-me-grayscale.png"));
        }catch (IOException e){
            System.out.println("getBitmap: FileNotFoundException "+ e.getMessage());
        }

    }

    //main
    public static void main(String[] args) {

        bitmapTransformer();
    }
}
