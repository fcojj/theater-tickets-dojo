require 'ticket'

class StudentTicket < Ticket

  def initialize
  end

  def getPrice(day_of_week = 0)
    if day_of_week == 1
        7.20
    else
        8.00
    end
  end

end
