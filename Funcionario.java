import java.util.Scanner;

public class Funcionario {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in); 
            
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
    
        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
    
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scanner.next();
    
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
    
        scanner.close();
        
    }

}
 