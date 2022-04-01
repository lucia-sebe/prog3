import java.util.Scanner;
import java.util.ArrayList;

public class Index {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nombre = " ", nombreConsulta = "";
        int numero = 0;
        boolean valorCorrecto = true;

        static ArrayList<Contacto> agenda = new ArrayList<>();

        System.out.println("¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un contacto existente?");
        char opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'I':
                do {
                    if (valorCorrecto == false) {
                        System.out.println("Debe tener mas de dos caracteres: ");
                        nombre = sc.next();
                    } else {
                        System.out.println("Ingresa el nombre: ");
                        nombre = sc.next();
                        valorCorrecto = false;
                    }
                } while (nombre.length() <= 2);

                do {
                    if (valorCorrecto == true) {
                        System.out.println("Debe tener ocho numeros: ");
                        numero = sc.nextInt();
                    } else {
                        System.out.println("Ingresa el numero de telefono: ");
                        numero = sc.nextInt();
                        valorCorrecto = true;
                    }
                } while (numero <= 9999999);

           //ingresar mail
        
                break;

            case 'C':
                do {
                    if (valorCorrecto == false) {
                        System.out.println("¡No existe un contacto con ese nombre!");

                    } else {
                        System.out.println("Ingresa el nombre del contacto que quieres consultar: ");
                        nombreConsulta = sc.next();
                        valorCorrecto = false;
                    }
                } while (nombreConsulta==nombre);

                break;
            default:
                break;
        }
    }

    class Contacto{ 
        String nombre;
        int numero;
        String mail;

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
    
    }

}