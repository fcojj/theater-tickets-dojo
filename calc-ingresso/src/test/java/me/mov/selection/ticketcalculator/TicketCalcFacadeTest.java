

package me.mov.selection.ticketcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste unitário {@link TicketCalcFacade}.
 *
 * @author Fco Jonas Rodrigues
 * 06/08/2016
 */
public class TicketCalcFacadeTest {

    @Test
    public void shouldCalcTicketValue(){
        //given
        TicketCalc ticketCalc = new ChildTicket();
        WeekDays dia = WeekDays.SEGUNDA_FEIRA;
        TicketCalcFacade ticketCalcFacade = new TicketCalcFacade();
        double ticketValueExpected = 4.95;
        double precision = 0.01;

        //when
        double result = ticketCalcFacade.getTicketValue(ticketCalc, dia);

        //then
        assertEquals(ticketValueExpected,result,precision);
    }
}
