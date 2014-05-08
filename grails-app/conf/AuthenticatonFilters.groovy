
class AuthenticatonFilters {

	def filters = {
		
		login(action:"*", controller: "*"){
			before = {
				if(!session.user && (actionName=='addToCart' ||actionName=='MyCart' || actionName=='MyAccount' || actionName=='removeFromCart') )
				{
					redirect(action:"login")
					return false
				}
				
			}
			
			
		}
		
		retail(action: '*', controller:'*')
		{
			before ={
				if((session.user=='retail') && (controllerName == 'user' || controllerName == 'address' || controllerName == 'productsDisplay' || controllerName =='cart'))
			
				{
					render "error 403 You are Forbidden to Enter"
					return false
				}
			}
			

		}

		
				
		
		
	}
	
}
