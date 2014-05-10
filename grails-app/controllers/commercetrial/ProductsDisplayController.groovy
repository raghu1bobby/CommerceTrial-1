package commercetrial

import org.apache.jasper.compiler.Node.ParamsAction;

class ProductsDisplayController {

    def index() { 
		
	println "in products display index"
	println "${params.categoryName}"
	println Products.findAllByCategory(Category.findBycategoryName(params.categoryName))
	
	println params.category_id
	def cat = Category.get(params.category_id)
	println cat
	println Products.findAllByCategory(Category.findByID(cat))
		//println Products.findAllByCategory(Category.get("${params.category_id}"))
	//	println findAllByProducts(Products.get(params.category_id))
		//println findAllByCategories()
		
    redirect (uri:"/")
	}
def showAll() {
	println "in showall"
	println "${params.categoryName}"
	def cat = Category.findByCategoryName("${params.categoryName}")
	//println cat
	println cat
//	def c =  Products.findBycategories(cat)

	//println c
	//println Category.findById(cat)
//	println Products.findAllByCategories(Category.findByCategoryName("${params.categoryName}"))
	
//	println Products.findAllByCategory()
[products: Products.findAllByCategories(Category.findByCategoryName("${params.categoryName}")), category: params.categoryName]
	
	
	}


def details(){
	println "in details"
	def idx = params.id;
	println idx
//println c
	//def d = Extras.findAll()
//	println Products.findByImage("camera1.jpg")
	//println Products.findAllByExtra("ZoomX")
	//println Products.findAllByExtra(Extras.findAll())
	//println Extras.findAllByProducts(Products.findByImage("camera1.jpg"))
	//Products.findAllByExtra(Extras.findAllByID())
	//println Extras.findAllById()
	//[shared:Products.findAllById(idx), custom:Extras.findAllByProduct_id(idx)]
	println Products.findAllById(idx)
	[products: Products.findAllById(idx)]
	}

}