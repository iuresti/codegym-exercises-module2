package module2.leccion2;

public final class Chihuahua extends Perro{

    @Override
    public Integer llora() {
        System.out.println("mmmmmmm");
        return 0;
    }

    public void llora(int param){
        // sobre carga
        // polimorfismo estático
    }

    @Override
    public void ingerir() {
        System.out.println("Traga");
    }

    @Override
    public String toString() {
        return "Chihuahua{}";
    }
}
