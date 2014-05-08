<%@ page import="commercetrial.Cart" %>



<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="cart.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${cartInstance?.image}" />

</div>

<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'price', 'error')} ">
	<label for="price">
		<g:message code="cart.price.label" default="Price" />
		
	</label>
	<g:field type="number" name="price" value="${cartInstance.price}" />

</div>

<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'productName', 'error')} ">
	<label for="productName">
		<g:message code="cart.productName.label" default="Product Name" />
		
	</label>
	<g:textField name="productName" value="${cartInstance?.productName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'quantity', 'error')} ">
	<label for="quantity">
		<g:message code="cart.quantity.label" default="Quantity" />
		
	</label>
	<g:field type="number" name="quantity" value="${cartInstance.quantity}" />

</div>

<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'total', 'error')} ">
	<label for="total">
		<g:message code="cart.total.label" default="Total" />
		
	</label>
	<g:field type="number" name="total" value="${cartInstance.total}" />

</div>

<div class="fieldcontain ${hasErrors(bean: cartInstance, field: 'user_id', 'error')} ">
	<label for="user_id">
		<g:message code="cart.user_id.label" default="Userid" />
		
	</label>
	<g:select id="user_id" name="user_id.id" from="${commercetrial.User.list()}" optionKey="id" required="" value="${cartInstance?.user_id?.id}" class="many-to-one"/>

</div>

