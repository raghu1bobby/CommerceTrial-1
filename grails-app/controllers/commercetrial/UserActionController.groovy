package commercetrial

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
		println "id of product ${idx}"
		//println session?.user.username

		def u = User.findByUsername(session?.user.username)
		println u.username
		if (u) {
			println "TEST"
			//	println params.products
			println params.categoryName

			u.counter++
			println session.user.counter
			u.save(flush:true)
			session.user = u
			println "${u.id} user id"
			println User.findAllById("${u.id}")
			println "xxxx"
			def user_cart= Cart.findAllByUser_id(User.findAllById("${u.id}"))
				user_cart.price = params.int("price")
				user_cart.image = '${params.image}'
				user_cart.productName = '${params.productName}'	
				user_cart.save(flush:true)
				if(!user_cart.save())
				{
					println "error saving cart"
					
				}
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




}
