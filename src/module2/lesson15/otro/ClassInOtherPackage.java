package module2.lesson15.otro;

import module2.lesson15.Main;

public class ClassInOtherPackage {

    public void metodo(){
        Main.InnerClass innerClass = new Main().new InnerClass();
    }
}
