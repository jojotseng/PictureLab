/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
      Picture beach= new Picture("beach.jpg");
      beach.explore();
      beach.zeroRed();
      beach.zeroGreen();
      beach.explore();
  }
  public static void testKeepOnlyRed()
  {
      Picture beach= new Picture("beach.jpg");
      beach.explore();
      beach.zeroGreen();
      beach.zeroBlue();
      beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
      Picture beach= new Picture("beach.jpg");
      beach.explore();
      beach.zeroRed();
      beach.zeroBlue();
      beach.explore();
  }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture download = new Picture("download.jpg");
    download.explore();
    download.mirrorVertical();
    download.explore();
  }
  public static void testVerticalRighttoLeft()
  {
    Picture download = new Picture("download.jpg");
    download.explore();
    Pixel[][] pixels = download.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
    download.explore();
  }
  
  public static void testMirrorHorizontalBottomtoTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    Pixel[][] pixels = caterpillar.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width ; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
    caterpillar.explore();
 }
 public static void testMirrorHorizontalToptoBottom()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    Pixel[][] pixels = caterpillar.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width ; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
    caterpillar.explore();
 }
  public static void testMirrorDiagnol()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
     
      Pixel[][] pixels = beach.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int max = pixels.length;

    for (int row = 1; row < max; row++)

    {
        for (int col = 0; col < row; col++)
        {
            leftPixel = pixels[row][col];
            rightPixel = pixels[col][row];
            rightPixel.setColor(leftPixel.getColor());
        }
    }
    beach.explore();
 }
    
   
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testVerticalRighttoLeft();
    testMirrorHorizontalBottomtoTop();
    testMirrorHorizontalToptoBottom();
    testMirrorDiagnol();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}