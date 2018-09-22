package ca.ualberta.cs.lonelytwitter;

public class BadMood extends Mood{
    @Override
    public Boolean isGood(){
        return false;
    }
}
