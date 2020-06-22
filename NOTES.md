# Notes

Originally I thought of having a Discount service that could process all the discounts in the basket and give an adjusted 
price, however after going down that route a bit I thought it was a bit of a dead end so changed to building on 
Products and the Item interface to include the calculating of discounts. 

I also implemented the ItemDiscount interface 
which each Product can have an instance of and each product can then have a ItemDiscount implementation applied and 
the discount determined through that. We can implement new ItemDiscounts types for different discounts. 
With the multibuy discounts we want to make sure that a product is only discounted the intended number of times which
is the bug in my solution at the moment. 

My Solution also limits expansion in the discounts to multibuy until the basket discount application is fixed to handle 
different types, but due to time constraints I went a bit more single minded here. 