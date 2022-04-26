import java.util.Scanner;
import java.util.ArrayList;

public class Index {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Borro estas variables xq la idea es que se definan cerca de donde se van a usar
        boolean valorCorrecto = true;

        // static? hmmm
        ArrayList<Contacto> agenda = new ArrayList<>();

        // esta es la pieza clave que te falto, el while que repita para ingresar el comando.
        while (true) {

        System.out.println("¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un contacto existente?");
        char opcion = sc.nextLine().charAt(0);

        switch (opcion) {
            // un truquito que vi que hacia Facu y funciona...
            case 'I':
            case 'i':
                // Propongo esto...
                String nombre;
                do {
                    System.out.println("Ingresa el nombre del contacto: ");
                    nombre = sc.nextLine();
                } while (nombre.isEmpty());

                do {
                    if (valorCorrecto == true) {
                        System.out.println("Debe tener ocho numeros: ");
                        numero = sc.nextInt();
                    } else {
                        System.out.println("Ingresa el numero de telefono: ");
                        numero = sc.nextInt();
                        valorCorrecto = true;
                    }
                } while (numero <= 9999999); // ?? Usaria un string para el numero "09812345" o "+598 (532) 123-567"

                //ingresar mail
                // el mail podrias no hacer ninguna validacion xq igual es opcional...

                // Ahora como lo agregarias a la lista? eso queda para vos :)
        
                break;

            case 'C':
            case 'c':
            // Aca hay que ingresar el nombre
                String nombre;
                do {
                    System.out.println("Ingresa el nombre del contacto: ");
                    nombre = sc.nextLine();
                } while (nombre.isEmpty());
                
                // Despues buscarlo. Se te ocurre algo?
                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).getNombre().equals(nombre)) {
                        agenda.get(i).presentYourself();
                        break;
                    }
                }
                

                break;
            default:
                break;
        }

      }
    }

    class Contacto{ 
        String nombre;
        int numero;
        String mail;

        // Lindo constructor :)
        public Contacto(String nombre, int numero, String mail) {
            this.nombre = nombre;
            this.numero = numero;
            this.mail = mail;
        }
        
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }

        public void presentYourself () {
            System.out.println("Nombre: " + nombre + " Numero: " + numero + " Mail: " + mail);
        }
    
    }

}