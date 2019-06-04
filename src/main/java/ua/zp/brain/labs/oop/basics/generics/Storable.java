package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public interface  Storable <S>{
    S read ();
    void  write (S data);
    Type getType ();


}
