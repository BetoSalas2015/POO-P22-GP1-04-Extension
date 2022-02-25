
/**
 * Write a description of class Circulo here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class Circulo extends Punto
{
     private int radio;
     
     public Circulo(int x, int y, int r) {
         super(x, y);
         setRadio(r);
     }
     
     public void setRadio(int r) {
         radio = (r >= 0) ? r : 0;
     }
     
     public int getRadio() {
         return radio;
     }
     
     public String toString() {
        return "Centro " + super.toString() + ", Radio = " + radio;
     }
}
