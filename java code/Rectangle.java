import java.util.Scanner;
public class Rectangle { private 
double length; private double 
breadth;
 public void readDimensions() {
 Scanner scanner = new Scanner(System.in); 
System.out.print("Enter length: "); length = 
scanner.nextDouble(); System.out.print("Enter breadth: "); breadth = scanner.nextDouble();
 }
 public double calculateArea() { 
return length * breadth;
 }
 public void display() {
 System.out.println("Length: " + length);
 System.out.println("Breadth: " + breadth);
 System.out.println("Area: " + calculateArea());
 }
 public static void main(String[] args) { 
Rectangle rectangle = new Rectangle(); 
rectangle.readDimensions(); rectangle.display();
 }
}

   
