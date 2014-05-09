
<%@ page import="commercetrial.Products" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'products.label', default: 'Products')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-products" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(controller:'userAction', action:'goto_IndexPage')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-products" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list products">
			
				<g:if test="${productsInstance?.categories}">
				<li class="fieldcontain">
					<span id="categories-label" class="property-label"><g:message code="products.categories.label" default="Categories" /></span>
					
						<span class="property-value" aria-labelledby="categories-label"><g:link controller="category" action="show" id="${productsInstance?.categories?.id}">${productsInstance?.categories?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="products.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${productsInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.extra}">
				<li class="fieldcontain">
					<span id="extra-label" class="property-label"><g:message code="products.extra.label" default="Extra" /></span>
					
						<g:each in="${productsInstance.extra}" var="e">
						<span class="property-value" aria-labelledby="extra-label"><g:link controller="extras" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="products.image.label" default="Image" /></span>
					
						<span class="property-value" aria-labelledby="image-label"><g:fieldValue bean="${productsInstance}" field="image"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="products.price.label" default="Price" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${productsInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.productName}">
				<li class="fieldcontain">
					<span id="productName-label" class="property-label"><g:message code="products.productName.label" default="Product Name" /></span>
					
						<span class="property-value" aria-labelledby="productName-label"><g:fieldValue bean="${productsInstance}" field="productName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productsInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="products.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${productsInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:productsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${productsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
