import commercetrial.Products
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_products_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/products/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: productsInstance, field: 'categories', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("products.categories.label"),'default':("Categories")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("categories"),'name':("categories.id"),'from':(commercetrial.Category.list()),'optionKey':("id"),'required':(""),'value':(productsInstance?.categories?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("products.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'value':(productsInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'extra', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("products.extra.label"),'default':("Extra")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("extra"),'from':(commercetrial.Extras.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'required':(""),'value':(productsInstance?.extra*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'image', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("products.image.label"),'default':("Image")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("image"),'value':(productsInstance?.image)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'price', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("products.price.label"),'default':("Price")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['type':("number"),'name':("price"),'value':(productsInstance.price)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'productName', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("products.productName.label"),'default':("Product Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("productName"),'value':(productsInstance?.productName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productsInstance, field: 'title', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("products.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("title"),'value':(productsInstance?.title)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506332000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
