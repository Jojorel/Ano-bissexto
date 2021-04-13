//  2020
//*** Fundamentos *** Profa.Giraffa
import java.util.*;

public class AnoBissexto {
    
               public static boolean divisor(int a, int b) {
                if (a%b==0) return true;
                  else return false;
                }
    
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);//objeto instanciado para metodo main
        System.out.println("\f");
        System.out.println("\n Ano Bissexto **** usando a premissa do calendario gregoriano  \n promulgado pelo Papa Gregório XIII em 24 de Fevereiro do ano 1582 ");
        
        System.out.println ("\n Digite  o ano candidato a bissexto");
        int ano=teclado.nextInt();
        if( ano>= 1582) {
                        if (divisor(ano,400)||divisor(ano,4)&&!divisor(ano,100)){System.out.println("\n o ano :"+ ano+" e bissexto");}
                                    else System.out.println("\n o ano :"+ ano+" nao e bissexto");
                        }
              else System.out.println("\n O ano :"+ ano+" nao é considerado no calendario gregoriano");
    }
        
    }
    
 

