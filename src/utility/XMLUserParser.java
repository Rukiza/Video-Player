package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import user.User;

/**
 * Created by Shane on 24/08/15.
 */
public class XMLUserParser {

    //Pattens for matching User XML.
    private final Pattern usersOpenTag = Pattern.compile("<Users>");
    private final Pattern usersCloseTag = Pattern.compile("</Users>");
    private final Pattern userOpenTag = Pattern.compile("<User>");
    private final Pattern userCloseTag = Pattern.compile("</User>");
    private final Pattern firstNameOpenTag = Pattern.compile("<FirstName>");
    private final Pattern firstNameCloseTag = Pattern.compile("</FirstName>");
    private final Pattern lastNameOpenTag = Pattern.compile("<LastName>");
    private final Pattern lastNameCloseTag = Pattern.compile("</LastName>");
    private final Pattern spaces = Pattern.compile("(\n|\r|\t)*");

    //TODO: Documentation for parseUser.
    public List<User> parseUsers (Scanner scan){
        List<User> userList = new ArrayList<>();
        chompPattern(scan, usersOpenTag, "There was no users tag in the user XML to indicate a list of users");
        //Ensures that there is another user to load.
        while (chompSpace(scan) && scan.hasNext(userOpenTag)){
            userList.add(parseUser(scan));
        }
        chompPattern(scan, usersCloseTag, "Close tag is missing from XML unknown end of list");
        return userList;
    }

    //TODO: Document user parsing.
    private User parseUser (Scanner scan){
        User user;
        chompPattern(scan, userOpenTag, "There is no user open tag.");
        String firstName = parseFirstName(scan);
        String lastName = parseLastName(scan);
        user = new User(firstName, lastName);
        //TODO: Add in saved user items.
        chompPattern(scan, userCloseTag, "There is no user close tag.");
        return user;
    }

    //TODO: Document first name parsing.
    private String parseFirstName (Scanner scan){
        String firstName = null;
        chompPattern(scan, firstNameOpenTag, "There is no first name open tag.");
        //TODO: Add First name parsing.
        chompPattern(scan, firstNameCloseTag, "There is no first name close tag.");
        return firstName;
    }

    //TODO: Document last name parsing.
    private String parseLastName (Scanner scan){
        String lastName = null;
        chompPattern(scan, lastNameOpenTag, "There is no last name open tag.");
        //TODO: Add Last name parsing.
        chompPattern(scan, lastNameCloseTag, "There is no last name close tag.");
        return lastName;
    }

    //TODO: Chomp patten documentation it.
    private boolean chompPattern (Scanner scan, Pattern pattern, String error){
        chompSpace(scan);
        boolean hasPatten = scan.hasNext(pattern);
        if (hasPatten){
            scan.next(pattern);
        }
        else {
            //TODO: Throw user xml error
        }
        chompSpace(scan);
        return hasPatten;
    }

    //TODO: Documentation for chompSpace
    private boolean chompSpace (Scanner scan){
        while (scan.hasNext(spaces)){
            scan.next();
        }
        return true;
    }

}
