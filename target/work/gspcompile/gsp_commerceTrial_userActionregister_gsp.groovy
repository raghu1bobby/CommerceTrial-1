import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_userActionregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userAction/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("client_main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',14,['bean':(user)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',15,['bean':(user)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('textField','g',22,['type':("text"),'name':("username"),'class':("inputbox"),'size':("18"),'width':("15px"),'autocomplete':("off")],-1)
printHtmlPart(8)
invokeTag('passwordField','g',29,['name':("password"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(9)
invokeTag('passwordField','g',34,['name':("confirm"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(10)
invokeTag('textField','g',39,['type':("email"),'name':("email"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(11)
invokeTag('actionSubmit','g',43,['action':("register"),'value':("Sign Up Now!")],-1)
printHtmlPart(12)
})
invokeTag('form','g',46,[:],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399516893000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
