package module2.leccion6;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>, Cloneable {
    private String clave;
    private String lastName;
    private String name;

    private StringBuilder calificaciones = new StringBuilder();

    public void añadeCalificacion(String valor){
        calificaciones.append(valor);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getLastName() {
        return lastName;
    }

    /*public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nameToUpperCase(){
        name = name.toUpperCase();
    }

    @Override
    public int compareTo(Alumno o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "clave='" + clave + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;

        if (!clave.equals(alumno.clave)) return false;
        if (!Objects.equals(lastName, alumno.lastName)) return false;
        return Objects.equals(name, alumno.name);
    }

    @Override
    public int hashCode() {
        int result = clave.hashCode();
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public Alumno clone(){
        try {
            Alumno cloned = (Alumno) super.clone();

            cloned.calificaciones = new StringBuilder();

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
