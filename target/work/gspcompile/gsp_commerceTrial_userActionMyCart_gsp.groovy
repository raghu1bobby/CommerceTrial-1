import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_userActionMyCart_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userAction/MyCart.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('set','g',20,['var':("total"),'value':(0l)],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
for( item in (cart) ) {
printHtmlPart(6)
invokeTag('img','g',27,['dir':("images/laptop"),'file':(item.Image),'width':("270"),'height':("200")],-1)
printHtmlPart(7)
createTagBody(4, {->
expressionOut.print(item.Title)
})
invokeTag('link','g',29,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],4)
printHtmlPart(8)
expressionOut.print(item.Price)
printHtmlPart(9)
invokeTag('set','g',31,['var':("total"),'value':(total+item.Price)],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 4)
invokeTag('link','g',33,['value':("Remove"),'id':(item.id),'controller':("userAction"),'action':("removeFromCart")],4)
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(total)
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',38,['controller':("userAction"),'action':("checkout"),'id':(total)],3)
printHtmlPart(16)
invokeTag('textField','g',45,['type':("text"),'name':("shipName"),'size':("18"),'width':("15px")],-1)
printHtmlPart(17)
invokeTag('textField','g',49,['name':("street"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(18)
invokeTag('textField','g',53,['name':("city"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(19)
invokeTag('textField','g',57,['name':("state"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(20)
invokeTag('textField','g',66,['type':("text"),'name':("ccnumber"),'size':("18"),'width':("15px")],-1)
printHtmlPart(21)
invokeTag('textField','g',70,['name':("CVV"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(22)
invokeTag('textField','g',74,['name':("fullname"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(23)
expressionOut.print(total)
printHtmlPart(24)
invokeTag('submitButton','g',79,['value':("Submit Payment"),'name':("submitButton")],-1)
printHtmlPart(25)
})
invokeTag('form','g',82,['url':([controller:'user',action:'MyAccount'])],2)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399516885000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
