package cs.lab;

import java.util.HashMap;

public class FinalUser {
    HashMap<String,String> finallist= new HashMap<String, String>();
    public FinalUser(){}
    public FinalUser(String title, String link){
        finallist.put(title,link);
    }

}
