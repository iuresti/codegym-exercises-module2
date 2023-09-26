package module2.leccion5;

import java.util.List;




public class Zoo <T extends Animal> {

    private List<T> animales;
    private Class<T> type;

    public Zoo(Class<T> type) {
        this.type = type;
    }

    public void addAnimal(T animal){

    }

    public T createAnimal(){
        try {
            return type.newInstance(); // checked exception
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> getAnimales(){
        return animales;
    }

}
