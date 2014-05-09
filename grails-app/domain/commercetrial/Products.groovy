package commercetrial

class Products {

String productName
def image
String title
String description
Integer price


static belongsTo =[categories:Category]
    
static constraints = {	
		
    }

}
