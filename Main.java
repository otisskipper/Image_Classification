package a4;

import java.io.IOException;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) throws IOException{
		//String picLocation = "/Users/otisskipper/Desktop/Lagan/bw.jpg";
		String clutchLocation = "/Users/otisskipper/Desktop/images/Clutch";
		//Picture pic = new Picture(Location);
		PictureCollection clutchColl = new PictureCollection(clutchLocation,1);
		
		
		PictureCollection train = new PictureCollection(clutchColl.getTrainingSetPictures());
		PictureCollection test = new PictureCollection(clutchColl.getTestingSetPictures());
		
	}
}
