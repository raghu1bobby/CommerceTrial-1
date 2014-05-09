import commercetrial.Products
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_productsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/products/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'products.label', default: 'Products'))],-1)
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
if(true && (productsInstance?.categories)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("products.categories.label"),'default':("Categories")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(productsInstance?.categories?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("category"),'action':("show"),'id':(productsInstance?.categories?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productsInstance?.description)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("products.description.label"),'default':("Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(productsInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productsInstance?.extra)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("products.extra.label"),'default':("Extra")],-1)
printHtmlPart(21)
for( e in (productsInstance.extra) ) {
printHtmlPart(22)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("extras"),'action':("show"),'id':(e.id)],4)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(17)
if(true && (productsInstance?.image)) {
printHtmlPart(25)
invokeTag('message','g',57,['code':("products.image.label"),'default':("Image")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',59,['bean':(productsInstance),'field':("image")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productsInstance?.price)) {
printHtmlPart(27)
invokeTag('message','g',66,['code':("products.price.label"),'default':("Price")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',68,['bean':(productsInstance),'field':("price")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productsInstance?.productName)) {
printHtmlPart(29)
invokeTag('message','g',75,['code':("products.productName.label"),'default':("Product Name")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',77,['bean':(productsInstance),'field':("productName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productsInstance?.title)) {
printHtmlPart(31)
invokeTag('message','g',84,['code':("products.title.label"),'default':("Title")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',86,['bean':(productsInstance),'field':("title")],-1)
printHtmlPart(16)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
invokeTag('message','g',94,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',94,['class':("edit"),'action':("edit"),'resource':(productsInstance)],3)
printHtmlPart(35)
invokeTag('actionSubmit','g',95,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(36)
})
invokeTag('form','g',97,['url':([resource:productsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399538435000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
