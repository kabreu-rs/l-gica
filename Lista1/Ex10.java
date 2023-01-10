/*Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
deverá digitar 4 informações de
entrada para o sistema, são elas:
- Valor de cada ingresso
- Número de pessoas (público do evento) que são sócias do clube
- Número de pessoas (público do evento) não pagantes (menores de 10
anos)
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
e o valor que deixou de ser arrecadada devido aos descontos e isenções.*/

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float vi, nps, pnp, pp,pt,rt,vna, ds, tvp, vpn;
        System.out.print("Informe o valor do ingresso do evento : ");
        vi = in.nextInt();
        System.out.print(" Informe o números de sócios do clube no evento : ");
        nps = in.nextInt();
        System.out.print(" Informe o número de não pagantes do evento : ");
        pnp = in.nextInt();
        System.out.print(" Informe o numero de pagantes do evento : ");
        pp = in.nextInt();
        pt = ( nps + pnp + pp);
        ds = ((vi *nps) - vi * 0.3f);
        vpn = (pnp * vi);
        vna = ( ds + vpn );
        tvp = ( pp*vi );
        rt = ( tvp + ds);
        System.out.println(" O publico total do evento foi : " + pt);
        System.out.println(" Informe a renda total do evento : " + rt);
        System.out.println(" Informe o valor não arrecadado do evento : " + vna);


        




    }
}