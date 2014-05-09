import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_templates_menuHeader_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_menuHeader.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
invokeTag('img','g',5,['dir':("images"),'file':("logo.jpg"),'width':("250px")],-1)
})
invokeTag('link','g',5,['controller':("userAction"),'action':("index")],1)
printHtmlPart(1)
createClosureForHtmlPart(2, 1)
invokeTag('link','g',11,['view':("/")],1)
printHtmlPart(3)
for( category in (commercetrial.Category.list()) ) {
printHtmlPart(4)
createTagBody(2, {->
expressionOut.print(category.categoryName)
printHtmlPart(5)
})
invokeTag('link','g',13,['controller':("ProductsDisplay"),'action':("showAll"),'params':([categoryName: "${category.categoryName}", category_id: "${category.id}"])],2)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (session?.User)) {
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(session?.User.counter)
printHtmlPart(10)
})
invokeTag('link','g',34,['controller':("userAction"),'action':("MyCart")],2)
printHtmlPart(8)
}
else {
printHtmlPart(11)
}
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399507944000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
