import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();
    IDandPasswords(){
        logininfo.put("Password1","123");
        logininfo.put("Password2","password");
        logininfo.put("Password3","abc");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }


}
