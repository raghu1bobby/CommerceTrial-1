import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_productsDisplaydetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/productsDisplay/details.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
loop:{
int i = 0
for( item in (products) ) {
printHtmlPart(5)
invokeTag('img','g',22,['dir':("images"),'file':(item.image),'width':("200"),'height':("200")],-1)
printHtmlPart(6)
expressionOut.print(item.productName)
printHtmlPart(7)
expressionOut.print(item.title)
printHtmlPart(8)
expressionOut.print(item.price)
printHtmlPart(9)
expressionOut.print(item.description)
printHtmlPart(10)
for( ex in (item.extra) ) {
printHtmlPart(11)
expressionOut.print(ex.name)
printHtmlPart(12)
expressionOut.print(ex.value)
printHtmlPart(13)
}
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',37,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399519231000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
