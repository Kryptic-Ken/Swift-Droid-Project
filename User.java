/**
 * Created by kendrickgholston on 6/2/17.
 */
import java.util.*;
public class User {
 private String fName;
 private String lName;
 private int age;
 private String bio;
 private HashMap<String, Friend> dictionary = new HashMap<String, Friend>();
 public User(String name, String name2, int ageN){
     fName = name;
     lName = name2;
     age = ageN;
     bio = "";
 }

 public String getName(){
     return fName + " " +lName;
 }
 public int getAge(){
     return age;
 }
 public void setAge(int ageN){
     age = ageN;
 }
 public String getBio(){
     if (bio.length() == 0){
         return"You have not written a bio yet";
     }
     else{
         return bio;
     }
 }
 public void appendBio(String append){
     bio = bio + append;
 }

}
