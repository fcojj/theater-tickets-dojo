require 'rubygems'
require 'ticket'
require 'student_ticket'
require 'children_ticket'
require 'senior_ticket'

describe Ticket, "#purchase" do
  
  it "returns R$ 11.00 when buy a common ticket" do
     ticket = Ticket.new
     price = ticket.getPrice
     price.should eql(11.00)
  end

  it "returns R$ 8.00 for a ticket to a student" do
     ticket = StudentTicket.new
     price = ticket.getPrice
     price.should eql(8.00)
  end

  it "returns R$ 5.50 when bought to a children" do
     ticket = ChildrenTicket.new
     price = ticket.getPrice
     price.should eql(5.50)
  end

  it "returns R$ 6.00 when bought to a elderly" do
     ticket = SeniorTicket.new
     price = ticket.getPrice
     price.should eql(6.00)
  end

end
