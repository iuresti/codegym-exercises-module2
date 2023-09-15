package module2.leccion2;

public abstract class Animal {

    private int barrigaLlena = 0;

    final protected void come(){ // template method
        System.out.println("1. Buscar comida");
        System.out.println("2. Sentarse");
        ingerir();
        System.out.println("4. Reposar");

        barrigaLlena++;
    }

    public abstract void ingerir();

    public void duerme(){
        System.out.println("Durmiendo");
    }

    public abstract void habla(Number number);

    protected abstract Number llora();

}
