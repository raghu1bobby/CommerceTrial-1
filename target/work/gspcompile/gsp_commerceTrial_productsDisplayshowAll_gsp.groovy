import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_productsDisplayshowAll_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/productsDisplay/showAll.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
for( item in (products) ) {
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
createTagBody(4, {->
printHtmlPart(7)
invokeTag('img','g',19,['dir':("images"),'file':(item.image),'width':("270"),'height':("200")],-1)
printHtmlPart(8)
createTagBody(5, {->
expressionOut.print(item.title)
})
invokeTag('link','g',24,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],5)
printHtmlPart(9)
expressionOut.print(item.price)
printHtmlPart(10)
createClosureForHtmlPart(11, 5)
invokeTag('link','g',29,['controller':("userAction"),'format':(item.price),'action':("addToCart"),'id':(item.id)],5)
printHtmlPart(12)
})
invokeTag('link','g',34,['action':("details"),'id':(item.id)],4)
printHtmlPart(13)
})
invokeTag('form','g',35,[:],3)
printHtmlPart(14)
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399532601000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
