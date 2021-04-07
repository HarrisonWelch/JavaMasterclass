package com.company;

public interface ITelephone { // Note the use of "interface" instead of class
    // access modifiers are useless here. This is elected at implementation
    void powerOn();
    void dial(int phoneNumber); // defining the "signature" (params & return type(s))
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
