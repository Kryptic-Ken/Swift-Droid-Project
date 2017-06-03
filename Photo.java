/**
 * Created by kendrickgholston on 6/2/17.
 */
public class Photo {
    private String caption;
    private String fileLocation;

    public Photo(String captionN, String nFile){
        caption = captionN;
        fileLocation = nFile;
    }
    public String getFile(){
        return fileLocation;
    }
    public String getCaption(){
        return caption;
    }
}
