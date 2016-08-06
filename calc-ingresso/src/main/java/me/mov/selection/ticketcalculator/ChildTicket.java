package me.mov.selection.ticketcalculator;

/**
 * Representa o ingresso para Crianças,
 * realiza o calculo desse ingresso
 * para todos os dias da semana,
 * inclusive feriados.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class ChildTicket implements Ticket, TicketCalc {
    public static final double CHILD_TICKET_VALUE = 5.5 ;

    public double getTicketMondayValue() {
        return CHILD_TICKET_VALUE - CHILD_TICKET_VALUE * 10/100;
    }

    public double getTicketTuesdayValue() {
        return CHILD_TICKET_VALUE - CHILD_TICKET_VALUE * 15/100;
    }

    public double getTicketWednesdayValue() {
        return CHILD_TICKET_VALUE - CHILD_TICKET_VALUE * 30/100;
    }

    public double getTicketThursdayValue() {
        return CHILD_TICKET_VALUE;
    }

    public double getTicketFridayValue() {
        return CHILD_TICKET_VALUE - CHILD_TICKET_VALUE * 11/100;
    }

    public double getTicketSaturdayValue() {
        return CHILD_TICKET_VALUE;
    }

    public double getTicketSundayValue() {
        return CHILD_TICKET_VALUE;
    }

    public double getTicketHolidayValue() {
        return CHILD_TICKET_VALUE;
    }
}
