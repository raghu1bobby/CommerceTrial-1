package commercetrial

class Category {
	static mapWith = "mongo"
	String categoryName
	static hasMany = [product_id:Products]
	
    static constraints = {
    }
	
	static mapping = {
		version false
		id 'category_id'
	
	}
	
}
