package commercetrial

class Products {
static mapWith = "mongo"
String productName
String image
String title
String description
Double price

static hasMany= [extra:Extras]
static embedded = ["extra"]

static belongsTo =[categories:Category]
    
static constraints = {	
		
    }

}
