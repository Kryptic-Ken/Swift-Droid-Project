/**
 * Created by kendrickgholston on 6/4/17.
 */
public class StatusEntry {
    //private int statusid;//
    private String textField;//Text for the status
    private Photo photo;//Photo filed
    private Video vid; //Video field
    public StatusEntry(String text){// Constructor
        textField = text;
        vid = null;
        photo = null;
    }

    public void setPhoto(Photo nPhoto) { //Sets the photo field
        photo = nPhoto;
        textField = nPhoto.getCaption();
    }
    public void setVideo(Video nVid){ //Sets the video field
     vid = nVid;
     textField = vid.getCaption();
    }

    public boolean isPhoto(){ //Checks whether it is photo
        if(photo != null ){
            return true;
        }
        return false;
    }
    public boolean isVideo(){ //Checks whether is is a video
        if(vid!= null ){
            return true;
        }
        return false;
    }
}
