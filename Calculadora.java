import java.util.Scanner;

public class Calculadora
{
    
    public static float somar(float n1, float n2)
    {
        float soma = n1 + n2;
        return soma;
    }
    public static float subtrair(float n1, float n2)
    {
        float sub = n1 - n2;
        return sub;
    }
    public static float multiplicar(float n1, float n2)
    {
        float mult = n1 * n2;
        return mult;
    }
    public static float dividir(float n1, float n2)
    {
        if(n2 == 0)
        {
            System.out.println("Nao e possivel dividir um numero por zero! ");
            return 0;
        }
        float div = n1 / n2;
        return div;
    }
    public static float porcentagem(float valorBase, float percentual)
    {
        float valorPercentual = (valorBase * percentual) / 100;
        return valorPercentual;
    }
    public static float expo(float base, float expoente)
    {
        float resultado = (float) Math.pow(base, expoente);
        return resultado;
    }
    public static float raiz(float n1)
    {
    if(n1 < 0)
    {
        System.out.println("Nao existe raiz negativa, insira outro numero ");
        return 0;
    }
    {
        float resultado = (float) Math.sqrt(n1);
        return resultado;
    }
    }
    public static void main(String[] args)
    {
        float n1 = 0, n2 = 0;
        
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("| Qual operacao matematica vc deseja resolver?   |");
            System.out.println("--------------------------------------------------");
            System.out.println("|          Soma            (digite 1)            |");
            System.out.println("|          Subtracao       (digite 2)            |");
            System.out.println("|          Multiplicacao   (digite 3)            |");
            System.out.println("|          Divisao         (digite 4)            |");
            System.out.println("|          Porcentagem     (digite 5)            |");
            System.out.println("|          Exponenciacao   (digite 6)            |");
            System.out.println("|          Raiz quadrada   (digite 7)            |");
            System.out.println("--------------------------------------------------");

            int opc = scanner.nextInt();

            if(opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5 || opc == 6)
            {
                System.out.println("------------------------------");
                System.out.println("Insira o primeiro numero:  ");
                n1 = scanner.nextFloat();
                System.out.println("Insira o segundo numero:   ");
                n2 = scanner.nextFloat();
                System.out.println("------------------------------");
            }
            else if(opc == 7)
            {
                System.out.println("-----------------------------");
                System.out.println("Insira o primeiro numero: ");
                n1 = scanner.nextFloat();
                System.out.println("-----------------------------");
            }
            else
            {
                System.out.println("x=x=x=x=x=x=x=x=x");
                System.out.println("Opcao invalida");
                System.out.println("x=x=x=x=x=x=x=x=x");
            }

            switch (opc) {
                case 1:
                System.out.println("Resultado: " + somar(n1, n2));
                break;
                case 2:
                    System.out.println("Resultado: " + subtrair(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(n1, n2));
                    break;
                case 5:
                    System.out.println("Resultado: " + porcentagem(n1, n2));
                    break;
                case 6:
                    System.out.println("Resultado: " + expo(n1, n2));
                    break;
                case 7:
                    System.out.println("Resultado: " + raiz(n1));
                default:
                    break;
            }
        }   
    }
}
//@Bodnargui