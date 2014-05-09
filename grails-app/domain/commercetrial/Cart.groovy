package commercetrial

class Cart {
static mapWith = "mongo"
	String productName
	Integer quantity
	Double price
	Integer total
	String image
	static belongsTo = [user_id:User]
	
    static constraints = {
    }
}
