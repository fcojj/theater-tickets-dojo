package me.mov.selection.ticketcalculator;

/**
 * Created by Jonas Rodrigues on 06/08/2016.
 */
public interface TicketCalc {
    double getTicketHolidayValue();
    double getTicketSundayValue();
    double getTicketMondayValue();
    double getTicketTuesdayValue();
    double getTicketWednesdayValue();
    double getTicketThursdayValue();
    double getTicketFridayValue();
    double getTicketSaturdayValue();
}
