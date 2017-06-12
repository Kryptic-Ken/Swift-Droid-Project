/**
 * Created by kendrickgholston on 6/11/17.
 */
public class EmptyCollectionException extends RuntimeException
{
    public EmptyCollectionException(String collection){
        super("The " + collection + " is empty.");
    }
}
