package com.lesson._final;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    //    @Override
    //    public void storePassword() { // 'storePassword()' cannot override 'storePassword()' in 'com.lesson._final.Password'; overridden method is final
    //        System.out.println("Saving password as " + this.decryptedPassword);
    //    }
}
