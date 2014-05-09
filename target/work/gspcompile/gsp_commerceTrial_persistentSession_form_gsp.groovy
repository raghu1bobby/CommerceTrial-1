import grails.plugin.databasesession.PersistentSession
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_persistentSession_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/persistentSession/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: persistentSessionInstance, field: 'creationTime', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("persistentSession.creationTime.label"),'default':("Creation Time")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['type':("number"),'name':("creationTime"),'value':(persistentSessionInstance.creationTime)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: persistentSessionInstance, field: 'invalidated', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("persistentSession.invalidated.label"),'default':("Invalidated")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',19,['name':("invalidated"),'value':(persistentSessionInstance?.invalidated)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: persistentSessionInstance, field: 'lastAccessedTime', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("persistentSession.lastAccessedTime.label"),'default':("Last Accessed Time")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['type':("number"),'name':("lastAccessedTime"),'value':(persistentSessionInstance.lastAccessedTime)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: persistentSessionInstance, field: 'maxInactiveInterval', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("persistentSession.maxInactiveInterval.label"),'default':("Max Inactive Interval")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("number"),'name':("maxInactiveInterval"),'value':(persistentSessionInstance.maxInactiveInterval)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506328000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
