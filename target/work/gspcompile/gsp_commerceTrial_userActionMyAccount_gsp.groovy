import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_userActionMyAccount_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userAction/MyAccount.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(session?.user.counter)
printHtmlPart(4)
expressionOut.print(address.name)
printHtmlPart(5)
expressionOut.print(address.street)
printHtmlPart(6)
expressionOut.print(address.city)
printHtmlPart(7)
expressionOut.print(address.state)
printHtmlPart(8)
for( item in (previouscart) ) {
printHtmlPart(9)
invokeTag('img','g',45,['dir':("images/laptop"),'file':(item.Image),'width':("270"),'height':("200")],-1)
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(item.Title)
})
invokeTag('link','g',47,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],3)
printHtmlPart(11)
expressionOut.print(item.Price)
printHtmlPart(12)
}
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',58,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399516887000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
