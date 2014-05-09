import grails.plugin.databasesession.PersistentSessionAttribute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_persistentSessionAttribute_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/persistentSessionAttribute/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: persistentSessionAttributeInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("persistentSessionAttribute.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(persistentSessionAttributeInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: persistentSessionAttributeInstance, field: 'session', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("persistentSessionAttribute.session.label"),'default':("Session")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("session"),'name':("session.id"),'from':(grails.plugin.databasesession.PersistentSession.list()),'optionKey':("id"),'required':(""),'value':(persistentSessionAttributeInstance?.session?.id),'class':("many-to-one")],-1)
printHtmlPart(5)
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
