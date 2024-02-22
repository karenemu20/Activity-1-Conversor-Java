import java.util.Scanner;
import java.io.File;

public class Main {
  public static void main(String[] args) {
    while (true){
      Scanner lec = new Scanner(System.in);
      System.out.println("\n--------------------<< MENU >>--------------------\nEliga el tipo de conversión que desea ejecutar: \n1. Binario a Decimal \n2. Binario a Hexa \n3. Decimal a Hexa \n4. Decimal a Binario \n5. Hexa a Decimal \n6. Hexa a Binario \n7. Salir\n<<---------------------------------------------->>\n");
      int option = lec.nextInt();
      int numero;
      if (option !=6){
        switch (option) {
          case 1 : // BinaryToDecimal
            binaryToDecimal();
            break; 
          case 2 : // BinaryToHex
            binaryToHexadecimal();
            break;
          case 3 : // DecimalToHex
            decimalToHexadecimal();
            break;
          case 4 : // DecimalToBinary
            decimalToBinary();
            break;
          case 5 : // HexToDecimal
            hexadecimalToDecimal();
            break;
          case 6 : // HexToBinary
            hexadecimalToBinary();
            break;
          case 7 : // Exit
            System.out.println("Saliendo del conversor.");
            break;
            default:
              System.out.println("\nOpción invalida!\n");
            break;
        }
      }else {break;
              }
  }
    
    //scanner.close();
}
  // BinaryToDecimal
  private static void binaryToDecimal() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número binario: ");
      String binary = scanner.next();
      int decimal = Integer.parseInt(binary, 2);
      System.out.println("Conversión Binario a Decimal: " + decimal);
  }

  private static void binaryToHexadecimal() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número binario: ");
      String binary = scanner.next();
      int decimal = Integer.parseInt(binary, 2);
      String hex = Integer.toHexString(decimal);
      System.out.println("Conversión Binario a Hexadecimal: " + hex.toUpperCase());
  }

  private static void decimalToHexadecimal() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número decimal: ");
      int decimal = scanner.nextInt();
      String hex = Integer.toHexString(decimal);
      System.out.println("Conversión Decimal a Hexadecimal: " + hex.toUpperCase());
  }

  private static void decimalToBinary() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número decimal: ");
      int decimal = scanner.nextInt();
      String binary = Integer.toBinaryString(decimal);
      System.out.println("Conversión Decimal a Binario: " + binary);
  }

  private static void hexadecimalToDecimal() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número hexadecimal: ");
      String hex = scanner.next();
      int decimal = Integer.parseInt(hex, 16);
      System.out.println("Conversión Hexadecimal a Decimal: " + decimal);
  }

  private static void hexadecimalToBinary() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el número hexadecimal: ");
      String hex = scanner.next();
      int decimal = Integer.parseInt(hex, 16);
      String binary = Integer.toBinaryString(decimal);
      System.out.println("Conversión Hexadecimal a Binario: " + binary);
  }
}