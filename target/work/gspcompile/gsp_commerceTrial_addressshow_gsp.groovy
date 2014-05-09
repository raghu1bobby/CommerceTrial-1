import commercetrial.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_addressshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("retail_main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'address.label', default: 'Address'))],-1)
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
expressionOut.print(createLink(action:'goto_indexPage', controller:'userAction'))
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
if(true && (addressInstance?.apartment)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("address.apartment.label"),'default':("Apartment")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(addressInstance),'field':("apartment")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.city)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(addressInstance),'field':("city")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.country)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(addressInstance),'field':("country")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.pinCode)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("address.pinCode.label"),'default':("Pin Code")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(addressInstance),'field':("pinCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.state)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(addressInstance),'field':("state")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.street)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(addressInstance),'field':("street")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.user_id)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("address.user_id.label"),'default':("Userid")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(addressInstance?.user_id?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("user"),'action':("show"),'id':(addressInstance?.user_id?.id)],3)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(addressInstance)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',95,['url':([resource:addressInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399525607000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
