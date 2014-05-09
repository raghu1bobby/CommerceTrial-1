import commercetrial.Cart
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_cart_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cart/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: cartInstance, field: 'image', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("cart.image.label"),'default':("Image")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("image"),'value':(cartInstance?.image)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cartInstance, field: 'price', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("cart.price.label"),'default':("Price")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['type':("number"),'name':("price"),'value':(cartInstance.price)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cartInstance, field: 'productName', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("cart.productName.label"),'default':("Product Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("productName"),'value':(cartInstance?.productName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cartInstance, field: 'quantity', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("cart.quantity.label"),'default':("Quantity")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("number"),'name':("quantity"),'value':(cartInstance.quantity)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cartInstance, field: 'total', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("cart.total.label"),'default':("Total")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['type':("number"),'name':("total"),'value':(cartInstance.total)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cartInstance, field: 'user_id', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("cart.user_id.label"),'default':("Userid")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['id':("user_id"),'name':("user_id.id"),'from':(commercetrial.User.list()),'optionKey':("id"),'required':(""),'value':(cartInstance?.user_id?.id),'class':("many-to-one")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506330000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
