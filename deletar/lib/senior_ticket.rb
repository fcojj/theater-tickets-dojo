require 'ticket'

class SeniorTicket < Ticket

  SENIOR_PRICE = 6.00

  def getPrice(day_of_week=0)
    if day_of_week == 1 
	5.40
    else	
	SENIOR_PRICE
    end
  end

end
