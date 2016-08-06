require 'rubygems'
require 'student_ticket'
require 'children_ticket'
require 'senior_ticket'

describe Ticket, "#OFF" do

  it "returns 10% off to students without little card" do
    ticket = StudentTicket.new
    ticket.getPrice(1).should eql(7.20)
  end 

  it "returns 10% off to Childrens" do
    ticket = ChildrenTicket.new
    ticket.getPrice(1).should eql(4.95)
  end
  
  it "returns 10% off to senior" do
    ticket = SeniorTicket.new
    ticket.getPrice(1).should eql(5.40)
  end


end
