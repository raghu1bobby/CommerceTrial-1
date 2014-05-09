import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_templates_headerTop_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_headerTop.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (session?.user)) {
printHtmlPart(1)
expressionOut.print(session?.user)
printHtmlPart(2)
createClosureForHtmlPart(3, 2)
invokeTag('link','g',14,['controller':("userAction"),'action':("logout")],2)
printHtmlPart(4)
}
else {
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',17,['controller':("userAction"),'action':("login"),'params':([previousUri: (request.forwardURI - request.contextPath) ])],2)
printHtmlPart(5)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',18,['controller':("userAction"),'action':("register")],2)
printHtmlPart(8)
}
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399508682000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
