package me.mov.selection.ticketcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste unitário {@link ChildTicket}.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class ChildTicketTest {
    @Test
    public void shouldCalcValueTicketFromMonday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 4.95;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketMondayValue();

        //then
        assertEquals(ticketValueExpected,result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromTuesday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 4.67;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketTuesdayValue();

        //then
        assertEquals(ticketValueExpected, result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromFourth(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 3.85;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketWednesdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFifth(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 5.50;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketThursdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFriday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 4.90;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketFridayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSaturday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 5.50;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketSaturdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSunday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 5.50;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketSundayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromHoliday(){
        //given
        ChildTicket childTicket = new ChildTicket();
        double ticketValueExpected = 5.50;
        double precision = 0.01;

        //when
        double result = childTicket.getTicketHolidayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

}
