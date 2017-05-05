/**
 * Created by Slavisa on 3.5.2017..
 */
public class Authenticator {

    public String authenticate(String username, String password) {

        if(("Slavisa83").equals(username) && ("slavisatukidid83").equals(password)) {

            return "success";

        } else {

            return  "failure";
        }

    }
}
