import java.util.Scanner;
public class Solution1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        int rodada;
        double[] temps = new double[12];
        double soma = 0;
        
        
        
            for(rodada = 0;rodada <12;rodada++){
                System.out.print("Digite a temperatura " + (rodada +1)+ " : ");
                temp = scanner.nextDouble();
                if(temp < 4 || temp > 10){
                System.out.println("Há um valor inválido. Digite novamente:");
                rodada--;
                continue;                           
            }
            temps[rodada]=temp;
            soma+=temp;
              
        }
        double media = soma/12;
        System.out.println("A temperatura média é: "+media);
        scanner.close();
    }
}            


