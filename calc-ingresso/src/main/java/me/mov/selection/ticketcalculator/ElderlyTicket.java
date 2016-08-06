package me.mov.selection.ticketcalculator;

/**
 * Representa o ingresso para Idosos,
 * realiza o calculo desse ingresso
 * para todos os dias da semana,
 * inclusive feriados.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class ElderlyTicket implements Ticket, TicketCalc {

    public static final double ELDERLY_TICKET_VALUE = 6.0;

    public double getTicketMondayValue() {
        return ELDERLY_TICKET_VALUE - ELDERLY_TICKET_VALUE * 10/100;
    }

    public double getTicketTuesdayValue() {
        return ELDERLY_TICKET_VALUE - ELDERLY_TICKET_VALUE * 15/100;
    }

    public double getTicketWednesdayValue() {
        return ELDERLY_TICKET_VALUE - ELDERLY_TICKET_VALUE * 40/100;
    }

    public double getTicketThursdayValue() {
        return ELDERLY_TICKET_VALUE - ELDERLY_TICKET_VALUE * 30/100;
    }

    public double getTicketFridayValue() {
        return ELDERLY_TICKET_VALUE;
    }

    public double getTicketSaturdayValue() {
        return getWeekendAndHoliday();
    }

    public double getTicketSundayValue() {
        return getWeekendAndHoliday();
    }

    public double getTicketHolidayValue() {
        return getWeekendAndHoliday();
    }

    private double getWeekendAndHoliday() {
        return ELDERLY_TICKET_VALUE - ELDERLY_TICKET_VALUE * 5/100;
    }
}
