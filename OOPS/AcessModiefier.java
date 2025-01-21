//Acess Modiefier
//Access modifiers are used to set the visibility of classes, interfaces, methods, and fields.

//There are four types of Java access modifiers:
//1. public: The access modifier public is used to access the class, method, and variables from any other class.

//2. private: The access modifier private is used to access the variables and methods within the same class.

//3. protected: The access modifier protected is used to access the variables and methods within the same package and subclasses.

//4. default: The access modifier default is used to access the variables and methods within the same package.

public class AcessModiefier {
    public static void main(String[] args) {
        Bank myaccount = new Bank();
        myaccount.username = "Rahul";
        myaccount.setUserPassword("1234");
        System.out.println(myaccount.username);
        System.out.println(myaccount.getUserPassword());
    }
}

class Bank {
    public String username;
    private String password;

    public void setUserPassword(String password) {
        this.password = password;
    }

    public String getUserPassword(){
        return this.password;
    }
}
