package me.mov.selection.ticketcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste unitário {@link ElderlyTicket}.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class ElderlyTicketTest {
    @Test
    public void shouldCalcValueTicketFromMonday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 5.4;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketMondayValue();

        //then
        assertEquals(ticketValueExpected,result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromTuesday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 5.10;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketTuesdayValue();

        //then
        assertEquals(ticketValueExpected, result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromFourth(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 3.6;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketWednesdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFifth(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 4.20;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketThursdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFriday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 6.0;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketFridayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSaturday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 5.70;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketSaturdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSunday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 5.70;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketSundayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromHoliday(){
        //given
        ElderlyTicket idosoIngresso = new ElderlyTicket();
        double ticketValueExpected = 5.70;
        double precision = 0.01;

        //when
        double result = idosoIngresso.getTicketHolidayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

}
