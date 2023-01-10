import java.util.Scanner;

public class Lista2Exec8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float eleitores, vv, vb, vn, perctvb , perctvn, perctvv;

        System.out.println(" Informe número total de eleitores ");
        eleitores = in.nextFloat();

        System.out.println(" Informe número total de votos brancos ");
        vb = in.nextFloat();
        System.out.println("Informe número total de votos nulos");
        vn = in.nextFloat();
        System.out.println("Informe número total de votos válidos ");
        vv = in.nextFloat();
      
        perctvb = ((vb*100)/eleitores);
        perctvn = ((vn*100)/eleitores);
        perctvv = ((vv *100)/eleitores);
        System.out.println(" O percentual de votos brancos é : " + perctvb + 
        "O percentual de votos nulos é : " + perctvn + 
        " O percentual  de votos válidos é: " + perctvv );

        
    }
    
}
/*8.Escreva um algoritmo para ler o número total de eleitores de um município,
o número de votos brancos,nulos e válidos.Calcular e escrever o percentual
que cada um representa em relação ao total de eleitores*/