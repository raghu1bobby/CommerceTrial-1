import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_layoutsretail_main_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/retail_main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("Cloud Commerce")],-1)
printHtmlPart(2)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1, maximum-scale=1")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(4)
expressionOut.print(createLinkTo(dir:'css',file:'style.css'))
printHtmlPart(5)
expressionOut.print(createLinkTo(dir:'css',file:'form.css'))
printHtmlPart(5)
expressionOut.print(createLinkTo(dir:'css',file:'megamenu.css'))
printHtmlPart(6)
invokeTag('javascript','g',20,['src':("jquery1.min.js")],-1)
printHtmlPart(7)
invokeTag('javascript','g',22,['src':("megamenu.js")],-1)
printHtmlPart(8)
expressionOut.print(createLinkTo(dir:'css',file:'fwslider.css'))
printHtmlPart(9)
invokeTag('javascript','g',31,['src':("jquery-ui.min.js")],-1)
printHtmlPart(10)
invokeTag('javascript','g',32,['src':("css3-mediaqueries.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',33,['src':("fwslider.js")],-1)
printHtmlPart(11)
invokeTag('javascript','g',35,['src':("jquery.easydropdown.js")],-1)
printHtmlPart(12)
invokeTag('layoutHead','g',38,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',40,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('render','g',43,['template':("templates/headerTop"),'contextPath':("/")],-1)
printHtmlPart(3)
invokeTag('layoutBody','g',44,[:],-1)
printHtmlPart(3)
invokeTag('render','g',45,['template':("templates/footer"),'contextPath':("/")],-1)
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399514807000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
