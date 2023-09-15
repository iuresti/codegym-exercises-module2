package module2.leccion2;

public class CarFactory {

    public static Car getCar(int maxSpeed, int maxPrice){

        if(maxSpeed <= 200){
            return new Tiida();
        }else {
            return new Porche();
        }
    }

}
