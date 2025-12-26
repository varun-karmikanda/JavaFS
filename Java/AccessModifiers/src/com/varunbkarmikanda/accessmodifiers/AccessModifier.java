package com.varunbkarmikanda.accessmodifiers;

public class AccessModifier {

    // public: Can be accessed from anywhere

    // private: Can be accessed inside the class only

    // protected: only a class that extends the parent class can acces it


    // When we don't want to create the student object then just make the constructor access modifier as private
    // When we do this when there is no sense creating a object of the particular class(Use static methods of that class)

    // __________________________________________________________________________________
    // |   Context      |   private     |   default     |   protected   |   public      |
    // |--------------------------------------------------------------------------------|
    // |    Same class  |   yes         |   yes         |   yes         |   yes         |
    // |--------------------------------------------------------------------------------|
    // |  Same Package  |   no          |   yes         |   yes         |   yes         |
    // |--------------------------------------------------------------------------------|
    // |     Subclass   |   no          |   yes         |   yes         |   yes         |
    // |  (Same Package)|               |               |               |               |
    // |--------------------------------------------------------------------------------|
    // |     Subclass   |   no          |   no          |   yes         |   yes         |
    // |  (Diff Package)|               |               |               |               |
    // |--------------------------------------------------------------------------------|
    // |  Diff Package  |   no          |   no          |   no          |   yes         |
    // | (Non-subclass) |               |               |               |               |
    // ----------------------------------------------------------------------------------
}
