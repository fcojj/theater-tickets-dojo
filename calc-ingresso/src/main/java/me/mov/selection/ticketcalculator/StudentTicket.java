package me.mov.selection.ticketcalculator;

/**
 * Representa o ingresso para Estudante,
 * realiza o calculo desse ingresso
 * para todos os dias da semana,
 * inclusive feriados.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class StudentTicket implements Ticket, TicketCalc {

    private final static double STUDENT_TICKET_VALUE = 8.0;
    private final boolean hasStudentId;

    public StudentTicket(boolean hasStudentId){
        this.hasStudentId = hasStudentId;
    }

    public double getTicketHolidayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : STUDENT_TICKET_VALUE;
    }

    public double getTicketSundayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : STUDENT_TICKET_VALUE;
    }

    public double getTicketMondayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : (STUDENT_TICKET_VALUE - STUDENT_TICKET_VALUE * 10/100);
    }

    public double getTicketTuesdayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : (STUDENT_TICKET_VALUE - STUDENT_TICKET_VALUE * 5/100);
    }

    public double getTicketWednesdayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : (STUDENT_TICKET_VALUE - STUDENT_TICKET_VALUE * 50/100);
    }

    public double getTicketThursdayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : (STUDENT_TICKET_VALUE - STUDENT_TICKET_VALUE * 30/100);
    }

    public double getTicketFridayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : STUDENT_TICKET_VALUE;
    }

    public double getTicketSaturdayValue() {
        return hasStudentId ? getTicketWithStudentIdValue() : STUDENT_TICKET_VALUE;
    }

    private double getTicketWithStudentIdValue(){
        return  STUDENT_TICKET_VALUE - STUDENT_TICKET_VALUE * 35/100;
    }
}
