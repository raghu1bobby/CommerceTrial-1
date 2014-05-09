import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_userActionlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userAction/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('textField','g',18,['type':("text"),'name':("username"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(5)
invokeTag('passwordField','g',23,['name':("password"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(6)
invokeTag('actionSubmit','g',30,['action':("login"),'value':("Login")],-1)
printHtmlPart(7)
})
invokeTag('form','g',33,[:],2)
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399507591000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
