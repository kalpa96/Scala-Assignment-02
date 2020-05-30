object Q2{
	def main(args:Array[String])
		{
			var price:Int=15;
			var attendees:Int=120+(15-price:Int)/5*20;
			var revenue:Int=(attendees*price):Int;
			var cost:Int=500+3*attendees:Int;
			var profit:Int=(revenue-cost):Int;
			println("The highest profit:"+profit);
		}
	def attendees(price:Int):Int={
		120+(15-price)/5*20;
		}
	def revenue(price:Int):Int={
		attendees(price)*price;
		}
	def cost(price:Int):Int={
		500+3*attendees(price);
		}
	def profit(price:Int):Int={
		revenue(price)- cost(price);
		}
}