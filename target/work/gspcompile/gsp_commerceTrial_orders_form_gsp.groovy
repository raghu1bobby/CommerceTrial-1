import commercetrial.Orders
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_orders_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/orders/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: ordersInstance, field: 'orderDate', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("orders.orderDate.label"),'default':("Order Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',10,['name':("orderDate"),'precision':("day"),'value':(ordersInstance?.orderDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ordersInstance, field: 'order_status', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("orders.order_status.label"),'default':("Orderstatus")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("order_status"),'value':(ordersInstance?.order_status)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ordersInstance, field: 'total', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("orders.total.label"),'default':("Total")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['type':("number"),'name':("total"),'value':(ordersInstance.total)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ordersInstance, field: 'user_id', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("orders.user_id.label"),'default':("Userid")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("user_id"),'name':("user_id.id"),'from':(commercetrial.User.list()),'optionKey':("id"),'required':(""),'value':(ordersInstance?.user_id?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
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
