package practice;

public class LoginTest {
    public static void main(String[] args) {
        LoginPage obj=new LoginPage();
        obj.login();
        String str=obj.getTitleOfPage();
        System.out.println("Title Of the Page is "+str);

    }
}
