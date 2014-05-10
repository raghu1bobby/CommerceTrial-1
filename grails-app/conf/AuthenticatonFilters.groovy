
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
				if((session?.user?.username =='retail') && (controllerName == 'user' || controllerName == 'address' || controllerName == 'productsDisplay' || controllerName =='cart'))
			
				{
					render "You are Forbidden to Enter, Please contact Professor for more details"
					return false
				}
			}
			

		}

		
				
		
		
	}
	
}
