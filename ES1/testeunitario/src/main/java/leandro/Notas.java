package leandro;

public class Notas {
        public char VerificaAprovacao(double p1, double p2)
        {
            double media = 0;
            Calculadora c = new Calculadora();
            media = c.add(p1, p2);
            media = c.divide(media, 2);
            
            if(media < 0 || media > 10 || p1 < 0 || p2 < 0 || p1 > 10 || p2 > 10) //erro
            {
                throw new IllegalArgumentException("Nota inválida");
            }
            else if(media < 3)//reprovado
            {
                return 'R'; 
            }
            else if(media > 3 && media < 6)
            {
                return 'E'; //exame
            }
            else
            {
                return 'A';
            }

        }
}
