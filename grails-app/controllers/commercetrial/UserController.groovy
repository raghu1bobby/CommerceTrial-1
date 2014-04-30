package commercetrial

class UserController {

def index = {
	redirect (uri: '/')
	}

	def login = {
	}


	def submit () {
		def previousUri = params.previousUri ?: "/"
		def u = User.findByUsername(params.username)
		
		if(u) {
			if(u.password == params.password) {
				session.user = u
				redirect (uri: previousUri)
			}
		}
		
		else
			session.invalidate()
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
		def u = new User(username:params.username,email:params.email,password:params.password,confirm:params.confirm)
		//u.save(flush:true)
		if(!u.save(flush:true)){
			return [user:u]
		} else {
		session.user = u
		redirect (uri: previousUri )
		
		}
		
		
		}
		
	}
	
	}
