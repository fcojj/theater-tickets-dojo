package me.mov.selection.ticketcalculator;

/**
 * Fachada para abstração dos tipos  de calculos de um ingresso.
 *
 * @author Fco Jonas ROdrigues on 06/08/2016.
 */
public class TicketCalcFacade {

    public double getTicketValue(TicketCalc ticketCalcualator, WeekDays day) throws IllegalArgumentException{
        switch (day){
            case DOMINGO:{
                return ticketCalcualator.getTicketSundayValue();
            }
            case SEGUNDA_FEIRA:{
                return ticketCalcualator.getTicketMondayValue();
            }
            case TERCA_FEIRA:{
                return ticketCalcualator.getTicketTuesdayValue();
            }
            case QUARTA_FEIRA:{
                return ticketCalcualator.getTicketWednesdayValue();
            }
            case QUINTA_FEIRA:{
                return ticketCalcualator.getTicketThursdayValue();
            }
            case SEXTA_FEIRA:{
                return ticketCalcualator.getTicketFridayValue();
            }
            case SABADO:{
                return ticketCalcualator.getTicketSaturdayValue();
            }
            case FERIADO:{
                return ticketCalcualator.getTicketHolidayValue();
            }
        }
        throw new IllegalArgumentException("Invalid Day.");
    }
}
