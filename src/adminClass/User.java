
package adminClass;

// create abstract class for user
public abstract class User {
    private String username;
    private String password;
    
    // constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    // constructor
    public User(){}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    //abstract login() method
    public abstract boolean login();

}
