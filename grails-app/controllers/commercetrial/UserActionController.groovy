package commercetrial

class UserActionController {

	def goto_indexPage(){
		render (view :'/index')
		
	}
	
def index = {
	println "in index"
	redirect (uri: '/')
	}

	def login = {
		println params.username
		
		
		
		
		if((params.username == "retail" && params.password =="retail") || (params.username=='admin' && params.password =='admin'))
		{
			session.user = params.username
			render(view:"/index")
		}else {
		
		
		def u = User.findByUsername(params.username)
		if (u) {
			// username and password match -> log in
			session.user = u
			redirect(uri:'/')
			//redirect(controller:'main')
		} else {
			render (view : "login")
			//redirect(controller:'user')
		}
		
	}}



	def submit={
println params.username
			def previousUri = params.previousUri ?: "/"
		def u = User.findByUsername(params.username)
		
		if(u) {
			if(u.password == params.password) {
				session.user = u
				redirect (uri: previousUri)
			}
		}		
		else
		{	
			session.invalidate()
			
			println "not working"
		
			}
			
	}

	def logout() {
		def previousUri = params.previousUri ?: "/"
		session.invalidate();
		redirect (uri: previousUri)
	}

	def register()
	{
		def previousUri = params.previousUri ?: "/"
		if(request.method == "POST")
		{
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
	
	
	def addToCart = {
		def idx = params.id;
		println params
		//println session?.user.username
		
		def u = User.findByUsername(session?.user.username)
		println u.username
		if (u) {
			println "TEST"
			
			//flash.total = Shared
			
			
			def priceFind = Shared_db.getAll(u.Mycart)
			println priceFind.Price
			flash.message= priceFind.Price
			
			u.addToMycart(idx).save()
			println u['counter']
			//u['counter']= u['counter']+1
			u.counter++;
			u.save(flush:true);
			session.user = u
			redirect(controller: "laptop", action: "showAll")
			
			//redirect(controller:'main')
		} else {
		println "bobby3"
			flash.message = "Please Login to Add Items to the Cart"
			render (view : "login")
			//redirect(controller:'user')
		}
		
	}
	
	
	}
