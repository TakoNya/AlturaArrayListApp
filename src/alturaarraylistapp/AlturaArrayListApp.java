package alturaarraylistapp;
import java.util.ArrayList;
import java.util.Scanner;

public class AlturaArrayListApp {

        public static void main(String[] args) {
            //creamos el ArrayList que contendrá las alturas de los alumnos
            ArrayList<Double> alturas =new ArrayList();
            int cantidad;
            double media;
            //obtenemos el número de alumnos de la clase
            cantidad = cantidadAlumnos();
            //leemos la altura de los N alumnos
            leerAlturas(alturas, cantidad);
            //calculamos la media
            media = calcularMedia(alturas);
            //mostramos los resultados
            mostrarResultados(alturas, media);
        
    }
        //Método para pedir por teclado el número de alumnos de la clase
        public static int cantidadAlumnos(){
            Scanner teclado = new Scanner(System.in);
            int cantidad;
            do {
                System.out.print("Introduce la cantidad de alumnos del aula: ");
                cantidad = teclado.nextInt();
                
            } while (cantidad < 1);
            return cantidad;
            
        }
        
        //Pide por teclado la altura de todos los alumnos y guardalas en el ArrayList
        public static void leerAlturas(ArrayList<Double> alturas,int cantidad) {
            Scanner teclado = new Scanner (System.in);
            int i;
            double alto;
            for (i=1;i<=cantidad;i++){
                do{
                    System.out.print("Alumno " + i + " altura: ");
                    alto = teclado.nextDouble();
                } while (alto <= 0);
                alturas.add(alto);
            }
        }
        //Calcula y devuelve la media de todas las alturas
        public static double calcularMedia(ArrayList<Double> alturas){
            double media =0;
            for (Double item:alturas){
                media=media+item;
            }
            return media/alturas.size();
        }
        //Muestra la altura de los alumnos, altura media y cuantos superan o están debajo de la media
        public static void mostrarResultados(ArrayList<Double> alturas, double media){
            int superior = 0, inferior = 0;
            System.out.println("Alturas introducidas: ");
            System.out.println(alturas);
            for (Double item : alturas){
                if (item > media)
                    superior++;
                else if (item < media)
                    inferior++;
            }
            System.out.printf("Media: %.2f %n",media);
            System.out.println("Hay " + superior + " alumnos más altos que la media.");
            System.out.println("Hay " + inferior + " alumnos más bajos que la media.");
            
            
        }
       
    
}
