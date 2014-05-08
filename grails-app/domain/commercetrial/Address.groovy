package commercetrial

class Address {
	static mapWith= "mongo"
	
	String street
	String apartment
	String city
	String state
	String pinCode
	String country
	static belongsTo = [user_id:User]
	
    static constraints = {
    }
	
}
