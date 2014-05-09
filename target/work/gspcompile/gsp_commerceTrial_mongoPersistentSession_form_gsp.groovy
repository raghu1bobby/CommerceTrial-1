import com.monochromeroad.grails.plugins.mongodbsession.MongoPersistentSession
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_mongoPersistentSession_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/mongoPersistentSession/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: mongoPersistentSessionInstance, field: 'attributes', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("mongoPersistentSession.attributes.label"),'default':("Attributes")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: mongoPersistentSessionInstance, field: 'creationTime', 'error'))
printHtmlPart(3)
invokeTag('message','g',16,['code':("mongoPersistentSession.creationTime.label"),'default':("Creation Time")],-1)
printHtmlPart(4)
invokeTag('field','g',19,['type':("number"),'name':("creationTime"),'value':(mongoPersistentSessionInstance.creationTime)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: mongoPersistentSessionInstance, field: 'invalidated', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("mongoPersistentSession.invalidated.label"),'default':("Invalidated")],-1)
printHtmlPart(4)
invokeTag('checkBox','g',28,['name':("invalidated"),'value':(mongoPersistentSessionInstance?.invalidated)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: mongoPersistentSessionInstance, field: 'lastAccessedTime', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("mongoPersistentSession.lastAccessedTime.label"),'default':("Last Accessed Time")],-1)
printHtmlPart(4)
invokeTag('field','g',37,['type':("number"),'name':("lastAccessedTime"),'value':(mongoPersistentSessionInstance.lastAccessedTime)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: mongoPersistentSessionInstance, field: 'maxInactiveInterval', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("mongoPersistentSession.maxInactiveInterval.label"),'default':("Max Inactive Interval")],-1)
printHtmlPart(4)
invokeTag('field','g',46,['type':("number"),'name':("maxInactiveInterval"),'value':(mongoPersistentSessionInstance.maxInactiveInterval)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399506327000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
