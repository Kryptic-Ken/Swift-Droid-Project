/**
 * Created by kendrickgholston on 6/12/17.
 */
public class Video {
    private String caption;//Caption for the photo as most uploaded to an app come with a caption
    private String fileLocation;//File location of the picture on the computer. For the purposes of this app, oictures will come from the given inputted location

    public Video(String captionN, String nFile){
        caption = captionN;
        fileLocation = nFile;
    }
    public String getFile(){ //Returns the file location
        return fileLocation;
    }
    public String getCaption(){ //Returns the caption
        return caption;
    }
}

