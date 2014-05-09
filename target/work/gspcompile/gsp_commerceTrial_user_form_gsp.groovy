import commercetrial.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'confirm_password', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.confirm_password.label"),'default':("Confirmpassword")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("confirm_password"),'value':(userInstance?.confirm_password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'counter', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.counter.label"),'default':("Counter")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['type':("number"),'name':("counter"),'value':(userInstance.counter)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("email"),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'mobile', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("user.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("mobile"),'value':(userInstance?.mobile)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("password"),'value':(userInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("username"),'value':(userInstance?.username)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506333000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
