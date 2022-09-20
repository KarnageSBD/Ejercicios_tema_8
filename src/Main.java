public class Main {
    public static void main(String[] args) {


        class Persona {
            private int edad;
            private String nombre;
            private int telefono;
            public void setEdad(int edad){
                this.edad = edad;
            }
            public int getEdad(){
                return this.edad;
            }

            public void setNombre(String nombre){
                this.nombre = nombre;
            }

            public String getNombre(){
                return this.nombre;
            }

            public void setTelefono(int telefono){
                this.telefono = telefono;
            }

            public int getTelefono(){
                return this.telefono;
            }
        }

        Persona persona1 = new Persona();

        persona1.setEdad(38);
        System.out.println(persona1.getEdad());

        persona1.setNombre("José Antonio");
        System.out.println(persona1.getNombre());

        persona1.setTelefono(666123456);
        System.out.println(persona1.getTelefono());

    }
}