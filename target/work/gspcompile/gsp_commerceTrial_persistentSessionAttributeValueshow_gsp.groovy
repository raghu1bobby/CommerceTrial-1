import grails.plugin.databasesession.PersistentSessionAttributeValue
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_persistentSessionAttributeValueshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/persistentSessionAttributeValue/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'persistentSessionAttributeValue.label', default: 'PersistentSessionAttributeValue'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (persistentSessionAttributeValueInstance?.attribute)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("persistentSessionAttributeValue.attribute.label"),'default':("Attribute")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(persistentSessionAttributeValueInstance?.attribute?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("persistentSessionAttribute"),'action':("show"),'id':(persistentSessionAttributeValueInstance?.attribute?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (persistentSessionAttributeValueInstance?.serialized)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("persistentSessionAttributeValue.serialized.label"),'default':("Serialized")],-1)
printHtmlPart(16)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',45,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',45,['class':("edit"),'action':("edit"),'resource':(persistentSessionAttributeValueInstance)],3)
printHtmlPart(21)
invokeTag('actionSubmit','g',46,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(22)
})
invokeTag('form','g',48,['url':([resource:persistentSessionAttributeValueInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',50,[:],1)
printHtmlPart(24)
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
