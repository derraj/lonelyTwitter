package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by mahinay on 9/20/18.
 */

public class DomesticDuck extends Animal implements FlyingBehaviour{
    public DomesticDuck(String type, String food){
        super(type, food);
    }

    public void swim(){
        Log.d("cmput-301", "Yeah, I love to swim");
    }
    public void doesLikeFlying(){
        Log.d("chowdhury", "No, I fly only when a cat attacks me");
    }
}
