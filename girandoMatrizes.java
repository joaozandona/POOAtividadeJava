import java.util.Scanner;

class Main {
  public static int[][] rotacao(int matriz[][], int angulo){
    if(angulo == 0){
      return matriz;
    }else if(angulo == 90){

      return giraNoventa(matriz);
    
    }else if(angulo == 180){
      for(int i = 0; i < 2; i++){
        matriz = giraNoventa(matriz);
      }
      return matriz;
    }else if(angulo == 270){
      for(int i = 0; i < 3; i++){
        matriz = giraNoventa(matriz);
      }
      return matriz;
    }else if(angulo == 360){
      for(int i = 0; i < 4; i++){
        matriz = giraNoventa(matriz);
      }
      return matriz;
    }else{
      return matriz;
    }
  }

  public static void exibe(int matriz[][]){
    for (int i = 0; i < matriz.length; i++){
       for (int j = 0; j < matriz[i].length; j++){
          System.out.print("["+matriz[i][j]+"]");
       } 
       System.out.println("");
    }
  }
  
  public static int[][] giraNoventa(int matriz[][]){
    int matrizDois[][] = new int[matriz.length][matriz.length];
      for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
          matrizDois[j][(matriz.length - 1) - i] = matriz[i][j]; 
        }  
      }
    return matrizDois;
  }

  
  
  public static void main(String[] args) {
    Scanner digita = new Scanner(System.in);
    System.out.println("Escreva o tamanho da matriz desejada: ");
    int lado = digita.nextInt();
    int matriz[][] = new int[lado][lado];

    for(int i = 0; i < matriz.length; i++ ){
      for(int j = 0; j < matriz.length; j++ ){
        System.out.println("Coloque o valor da linha "+j+" na coluna "+i);
        matriz[i][j] = digita.nextInt();
      } 
    }

    System.out.println("Quer girar em qual angulo? ");
    int gira = digita.nextInt();

    matriz = rotacao(matriz, gira);
    exibe(matriz);
    
    digita.close();
    
  }
}
