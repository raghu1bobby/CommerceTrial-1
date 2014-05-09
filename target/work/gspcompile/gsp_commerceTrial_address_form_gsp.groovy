import commercetrial.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_address_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'apartment', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("address.apartment.label"),'default':("Apartment")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("apartment"),'value':(addressInstance?.apartment)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("city"),'value':(addressInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("country"),'value':(addressInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'pinCode', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("address.pinCode.label"),'default':("Pin Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("pinCode"),'value':(addressInstance?.pinCode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'state', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("state"),'value':(addressInstance?.state)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'street', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("street"),'value':(addressInstance?.street)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'user_id', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("address.user_id.label"),'default':("Userid")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("user_id"),'name':("user_id.id"),'from':(commercetrial.User.list()),'optionKey':("id"),'required':(""),'value':(addressInstance?.user_id?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506329000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
