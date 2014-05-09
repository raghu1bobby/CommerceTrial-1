package commercetrial

class Extras {
static mapWith = "mongo"

String name
String value

static belongsTo= [products:Products]
    static constraints = {
    }
	static mapping = {
		version false
		
		
	}
}
