package me.mov.selection.ticketcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste unitário {@link StudentTicket}.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class StudentTicketTest {
    @Test
    public void shouldCalcValueTicketFromMonday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 7.20;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketMondayValue();

        //then
        assertEquals(ticketValueExpected,result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromTuesday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 7.60;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketTuesdayValue();

        //then
        assertEquals(ticketValueExpected, result,precision);
    }

    @Test
    public void shouldCalcValueTicketFromFourth(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 4.00;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketWednesdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFifth(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 5.60;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketThursdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromFriday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 8.00;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketFridayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSaturday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 8.00;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketSaturdayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromSunday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 8.00;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketSundayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

    @Test
    public void shouldCalcValueTicketFromHoliday(){
        //given
        StudentTicket estudanteIngresso = new StudentTicket(false);
        double ticketValueExpected = 8.00;
        double precision = 0.01;

        //when
        double result = estudanteIngresso.getTicketHolidayValue();

        //then
        assertEquals(ticketValueExpected, result, precision);
    }

}
