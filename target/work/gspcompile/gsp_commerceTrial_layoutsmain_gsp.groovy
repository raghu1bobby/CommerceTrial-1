import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_commerceTrial_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(7)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',17,['default':("Cloud Commerce")],-1)
printHtmlPart(8)
})
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(9)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1, maximum-scale=1")],-1)
printHtmlPart(9)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(10)
expressionOut.print(createLinkTo(dir:'css',file:'style.css'))
printHtmlPart(11)
expressionOut.print(createLinkTo(dir:'css',file:'form.css'))
printHtmlPart(11)
expressionOut.print(createLinkTo(dir:'css',file:'megamenu.css'))
printHtmlPart(12)
invokeTag('javascript','g',26,['src':("jquery1.min.js")],-1)
printHtmlPart(13)
invokeTag('javascript','g',28,['src':("megamenu.js")],-1)
printHtmlPart(14)
expressionOut.print(createLinkTo(dir:'css',file:'fwslider.css'))
printHtmlPart(15)
invokeTag('javascript','g',37,['src':("jquery-ui.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',38,['src':("css3-mediaqueries.js")],-1)
printHtmlPart(9)
invokeTag('javascript','g',39,['src':("fwslider.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',41,['src':("jquery.easydropdown.js")],-1)
printHtmlPart(18)
invokeTag('layoutHead','g',44,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',45,['library':("application")],-1)
printHtmlPart(19)
invokeTag('layoutResources','r',46,[:],-1)
printHtmlPart(20)
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(20)
createTagBody(1, {->
printHtmlPart(20)
invokeTag('render','g',49,['template':("templates/headerTop"),'contextPath':("/")],-1)
printHtmlPart(1)
invokeTag('layoutBody','g',50,[:],-1)
printHtmlPart(1)
invokeTag('render','g',51,['template':("templates/footer"),'contextPath':("/")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',52,[:],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399515386000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
