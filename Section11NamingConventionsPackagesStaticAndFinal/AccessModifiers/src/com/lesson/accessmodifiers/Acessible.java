package com.lesson.accessmodifiers;

interface Acessible { // Package-private
    int SOME_CONSTANT = 100; // all interface vars are public static final
    public void methodA(); // public (easy)
    void methodB(); // public (not package private b/c interface rules)
    boolean methodC(); // public (not package private b/c interface rules)

}
