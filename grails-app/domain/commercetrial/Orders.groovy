package commercetrial


class Orders{
	
	static mapWith = 'mongo'
	String order_status 
	Date orderDate
	Double total
	static belongsTo = [user_id:User]
	
	static constraints = {
	}
	
	}

