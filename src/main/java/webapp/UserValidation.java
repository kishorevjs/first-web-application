package webapp;

public class UserValidation {

    public boolean isUserValid(String user, String password){
        if(user.equals("Vjs") && password.equals("Vjs"))
            return true;
        return false;
    }
}
