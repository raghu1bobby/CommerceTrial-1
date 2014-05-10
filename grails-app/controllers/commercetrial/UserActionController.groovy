package commercetrial

import java.util.Date;

class UserActionController {

	def goto_indexPage(){
		render (view :'/index')
	}

	def index = {
		println "in index"
		redirect (uri: '/')
	}





	def login={
		println params.username
		def previousUri = params.previousUri ?: "/"
		def u = User.findByUsername(params.username)

		if(u) {
			if(u.password == params.password) {
				session.user = u
				if(session.user.username == "admin" || session.user.username =='retail') {

					render (view :'/index')
				}else{

					redirect (uri: previousUri)
				}
			}
		}
		else {
			session.invalidate()

			println "not working"
		}
	}

	def logout() {
		def previousUri = params.previousUri ?: "/"
		session.invalidate();
		redirect (uri: previousUri)
	}

	def register() {
		def previousUri = params.previousUri ?: "/"
		if(request.method == "POST") {
			def u = new User(username:params.username,password:params.password, confirm_password:params.confirm, email:params.email)
			//u.save(flush:true)

			if(!u.save(flush:true)){
				return [user:u]
			} else {
				session.user = u
				redirect (uri: previousUri )

			}


		}

	}


	def addToCart(){
		def idx = params.id;
		println params
		//println session?.user.username

		def u = User.findByUsername(session?.user.username)
		println u.username
		if (u) {
			println "TEST"
			//	println params.products

			u.counter++
			
			u.save(flush:true)
			session.user = u
			
		
			def user_cart= Cart.findAllByUser_id(User.findAllById("${u.id}"))
	def prod_details =  Products.findAllById(params.id)
	println prod_details.price
	println "xxx"
          //  println user_cart.user_id
		def c = new Cart(user_id: "${u.id}", image:prod_details.image, price:prod_details.price, productName:prod_details.productName , quantity:5, total:400)
		c.save(flush:true)
		if(!c.save())
		{
			println "error in saving cart"
			
		}
		
		//user_cart.save(flush:true)
			
			//user_cart.price = prod_details.price
			//String image = prod_details.image
		//	user_cart.image = image
		//	user_cart.image = prod_details.image	
		//	user_cart.save()
				//user_cart.save(flush:true)
				
			if(!u.save())
			{
				println "errror saving counter"
			}
		}

		//	User.save()
		forward(action:"showAll", controller:'productsDisplay', model:[categoryName:params.categoryName])
		//flash.total = Shared


		//def priceFind = Shared_db.getAll(u.Mycart)
		//println priceFind.Price
		//			flash.message= priceFind.Price
		//
		//			u.addToMycart(idx).save()
		//			println u['counter']
		//			//u['counter']= u['counter']+1
		//			u.counter++;
		//			u.save(flush:true);
		//			session.user = u
		//
		//			//redirect(controller:'main')
		//		} else {
		//		println "bobby3"
		//			flash.message = "Please Login to Add Items to the Cart"
		//			render (view : "login")
		//			//redirect(controller:'user')
		//		}
		//
	}
	
	def removeFromCart = {
		
				def idx = params.id;
				def u = User.findByUsername(session?.user.username)
				println idx
		
				//def a= u.Mycart.get(idx)
				//list = [1,2,3,4]
				
				//println u.Mycart - idx
				def cart = Cart.get(idx)
				cart.delete(flush:true)
				u.counter--
				//u.update("MyCart":[3,5,10])
				u.save()
				session.user = u
		/*		Iterator i = u.Mycart.iterator()
				while (i.hasNext()) {
					println i
					if (i.next() == idx) {
						println i
						i.remove()
						break
						}
				}
			*/	/*
				u.Mycart.remove(1)
				println u.Mycart.find()*/
				//def rm = u.Mycart.find(idx) //{ it.id == idx }
				//println rm
				//u.removeFromMycart(rm)
				//render (view:"MyCart")
				redirect (controller:"userAction", action:"MyCart")
			}
	
def MyCart()
{
	def idx = params.id;
	println params.id
	def u = User.findByUsername(session?.user.username)
	println u.username
	
	[cart:Cart.findAllByUser_id(User.findAllById("${u.id}"))]
	
}

def MyAccount = {
	
	def name = params.fullname
	def ccnumber=params.ccnumber
	def cvv=params.cvv
	def u = User.findByUsername(session?.user.username)
	
	def shipName = params.shipName
	def street=params.street
	def city=params.city
	def state = params.state
	
	
	def o = Cart.findAllByUser_id(User.findAllById("${u.id}"))
	def c = new Orders(user_id: "${u.id}", "image":o.image, price:o.price, "productName":o.productName , quantity:5, total:400)
	c.save(flush:true)
	println "cart ${o}"
	println o.id
o.each {
	it.delete()
	
	}

	//o.delete(flush:true)
		
		//u.setAddress("name":shipName,"street":street,"city":city,"state":state)
	
	//u.Completedorder = u.Mycart
	
	
	
	//def order = new Orders(user_id:"${u.id}", order_status:"Completed", orderDate:new Date(), total:0 )
	
	//u.addToCompletedorder(u.Mycart).save()
	println u['counter']
	//u['counter']= u['counter']+1
	u.counter=0;
	
	//u.removeFromMycart(u.Mycart)
	
	u.save(flush:true);
	session.user = u
	
	
	//
	[cart:Orders.findAllByUser_id(User.findAllById("${u.id}"))]
	//redirect(controller: "user", action: "MyAccount")
	
	
	
}

}
