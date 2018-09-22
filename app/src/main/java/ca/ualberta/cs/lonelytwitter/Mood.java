package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    protected String message;
    private Date date;

    public void setMessage(String message) throws TooLongException{
        if (this.message.length()>140){
            throw new TooLongException();
        }
        this.message=message;
    }

    public void setDate(Date date){this.date=date;}

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }
    public abstract Boolean isGood();


}
