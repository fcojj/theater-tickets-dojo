require 'ticket'

class ChildrenTicket < Ticket

  CHILDREN_PRICE = 5.50

  def initialize
  end

  def getPrice(day_of_week = 0)
    if day_of_week == 1
      4.95
    else
      CHILDREN_PRICE
    end
  end

end
