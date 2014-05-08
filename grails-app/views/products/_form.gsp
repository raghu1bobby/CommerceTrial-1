<%@ page import="commercetrial.Products" %>



<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'categories', 'error')} ">
	<label for="categories">
		<g:message code="products.categories.label" default="Categories" />
		
	</label>
	<g:select id="categories" name="categories.id" from="${commercetrial.Category.list()}" optionKey="id" required="" value="${productsInstance?.categories?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="products.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${productsInstance?.description}" />

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'extra', 'error')} ">
	<label for="extra">
		<g:message code="products.extra.label" default="Extra" />
		
	</label>
	<g:select name="extra" from="${commercetrial.Extras.list()}" multiple="multiple" optionKey="id" size="5" required="" value="${productsInstance?.extra*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="products.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${productsInstance?.image}" />

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'price', 'error')} ">
	<label for="price">
		<g:message code="products.price.label" default="Price" />
		
	</label>
	<g:field type="number" name="price" value="${productsInstance.price}" />

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'productName', 'error')} ">
	<label for="productName">
		<g:message code="products.productName.label" default="Product Name" />
		
	</label>
	<g:textField name="productName" value="${productsInstance?.productName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: productsInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="products.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${productsInstance?.title}" />

</div>

