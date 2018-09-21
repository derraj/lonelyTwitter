package ca.ualberta.cs.lonelytwitter;

import Exception;

/**
 * Created by mahinay on 9/20/18.
 */

public class TooLongTweetException extends Exception {
    @Override
    public Boolean isImportant(){
        return true;
    }
}
