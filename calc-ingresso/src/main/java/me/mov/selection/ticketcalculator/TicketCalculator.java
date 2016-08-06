package me.mov.selection.ticketcalculator;

/**
 * Classe principal do programa de cálculo
 * de ingressos.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class TicketCalculator
{
    public static void main( String[] args )
    {
        boolean temCarteira = true;
        TicketCalcFacade ticketCalcFacade = new TicketCalcFacade();

        //criando ingressos de todos os tipos possíveis.
        ChildTicket childTicket = new ChildTicket();
        StudentTicket estudanteComCarteiraIngresso = new StudentTicket(temCarteira);
        StudentTicket estudanteSemCarteiraIngresso = new StudentTicket(!temCarteira);
        ElderlyTicket idosoIngresso = new ElderlyTicket();

        // cálculo dos valores.
        double criancaIngressoValor = ticketCalcFacade.getTicketValue(childTicket, WeekDays.QUARTA_FEIRA);
        double estudanteComCarteiraIngressoValor = ticketCalcFacade.getTicketValue(estudanteComCarteiraIngresso, WeekDays.QUARTA_FEIRA);
        double estudanteSemCarteiraIngressoValor = ticketCalcFacade.getTicketValue(estudanteSemCarteiraIngresso, WeekDays.QUARTA_FEIRA);
        double idosoIngressoValor = ticketCalcFacade.getTicketValue(idosoIngresso, WeekDays.QUARTA_FEIRA);

        // impressão dos dados calculados.
        System.out.println("################ VALORES DOS INGRESSOS ################ ");
        imprimirDadosIngresso("CRIANÇA", WeekDays.QUARTA_FEIRA, criancaIngressoValor);
        imprimirDadosIngresso("ESTUDANTE COM CARTEIRA", WeekDays.QUARTA_FEIRA, estudanteComCarteiraIngressoValor);
        imprimirDadosIngresso("ESTUDANTE SEM CARTEIRA", WeekDays.QUARTA_FEIRA, estudanteSemCarteiraIngressoValor);
        imprimirDadosIngresso("IDOSO", WeekDays.QUARTA_FEIRA, idosoIngressoValor);

    }

    private static void imprimirDadosIngresso(String categoriaIngresso, WeekDays dia, double valor) {
        System.out.println(categoriaIngresso
                + " " + WeekDays.QUARTA_FEIRA
                + " - VALOR: R$ "
                + valor);
    }
}
