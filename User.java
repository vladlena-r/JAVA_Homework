package Homework;

import java.time.Year;

public class User {
    private String Name = "Vladlena";
    private String Surname = "Rusu";
     private int Year = 1998;

     public User(){}

     public User(int year, String Name, String Surname){
         this.Name = Name;
                 this.Surname = Surname;
                         this.Year = Year;
     }

    public int getYear(){
         return Year;
}
    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
}
