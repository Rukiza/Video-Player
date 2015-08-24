package user;

import utility.XMLAble;

/**
 * Created by Shane Brewer on 13/08/15.
 */
public class User implements XMLAble{

    //Fields
    private String firstName;
    private String lastName;

    public User (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toXML(){
        return null;
    }

    //TODO Set up a user profile that can be loaded in from XML
}
