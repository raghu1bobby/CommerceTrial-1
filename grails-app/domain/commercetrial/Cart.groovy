package commercetrial

class Cart {

	String productName
	Integer quantity
	Integer price
	Integer total
	String image
	static belongsTo = [user_id:User]
	
    static constraints = {
    }
}
