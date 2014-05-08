<%@ page import="commercetrial.Category" %>



<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'categoryName', 'error')} ">
	<label for="categoryName">
		<g:message code="category.categoryName.label" default="Category Name" />
		
	</label>
	<g:textField name="categoryName" value="${categoryInstance?.categoryName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'product_id', 'error')} ">
	<label for="product_id">
		<g:message code="category.product_id.label" default="Productid" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${categoryInstance?.product_id?}" var="p">
    <li><g:link controller="products" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="products" action="create" params="['category.id': categoryInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'products.label', default: 'Products')])}</g:link>
</li>
</ul>


</div>

