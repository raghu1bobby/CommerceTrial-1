<%@ page import="commercetrial.Orders" %>



<div class="fieldcontain ${hasErrors(bean: ordersInstance, field: 'orderDate', 'error')} ">
	<label for="orderDate">
		<g:message code="orders.orderDate.label" default="Order Date" />
		
	</label>
	<g:datePicker name="orderDate" precision="day" value="${ordersInstance?.orderDate}" />

</div>

<div class="fieldcontain ${hasErrors(bean: ordersInstance, field: 'order_status', 'error')} ">
	<label for="order_status">
		<g:message code="orders.order_status.label" default="Orderstatus" />
		
	</label>
	<g:textField name="order_status" value="${ordersInstance?.order_status}" />

</div>

<div class="fieldcontain ${hasErrors(bean: ordersInstance, field: 'total', 'error')} ">
	<label for="total">
		<g:message code="orders.total.label" default="Total" />
		
	</label>
	<g:field type="number" name="total" value="${ordersInstance.total}" />

</div>

<div class="fieldcontain ${hasErrors(bean: ordersInstance, field: 'user_id', 'error')} ">
	<label for="user_id">
		<g:message code="orders.user_id.label" default="Userid" />
		
	</label>
	<g:select id="user_id" name="user_id.id" from="${commercetrial.User.list()}" optionKey="id" required="" value="${ordersInstance?.user_id?.id}" class="many-to-one"/>

</div>

