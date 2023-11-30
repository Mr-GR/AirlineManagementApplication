package creds;

//MyCreds.java
//MyCreds.java
public class Mycreds {
 private static Mycreds defaultInstance;  // Static variable for default instance
 private String username;
 private String password;

 // Private constructor to enforce instantiation through factory methods
 private Mycreds(String username, String password) {
     this.username = username;
     this.password = password;
 }

 // Factory method to create an instance with custom credentials
 public static Mycreds create(String username, String password) {
     return new Mycreds(username, password);
 }

 // Factory method to get the default instance or create it if it doesn't exist
 public static Mycreds getDefaultInstance() {
     if (defaultInstance == null) {
         // Set default credentials here
         defaultInstance = new Mycreds("obsidian", "SolidState?");
     }
     return defaultInstance;
 }

 public String getUsername() {
     return username;
 }

 public String getPassword() {
     return password;
 }
}
