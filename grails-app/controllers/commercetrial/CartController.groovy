package commercetrial



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CartController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Cart.list(params), model:[cartInstanceCount: Cart.count()]
    }

    def show(Cart cartInstance) {
        respond cartInstance
    }

    def create() {
        respond new Cart(params)
    }

    @Transactional
    def save(Cart cartInstance) {
        if (cartInstance == null) {
            notFound()
            return
        }

        if (cartInstance.hasErrors()) {
            respond cartInstance.errors, view:'create'
            return
        }

        cartInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'cartInstance.label', default: 'Cart'), cartInstance.id])
                redirect cartInstance
            }
            '*' { respond cartInstance, [status: CREATED] }
        }
    }

    def edit(Cart cartInstance) {
        respond cartInstance
    }

    @Transactional
    def update(Cart cartInstance) {
        if (cartInstance == null) {
            notFound()
            return
        }

        if (cartInstance.hasErrors()) {
            respond cartInstance.errors, view:'edit'
            return
        }

        cartInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Cart.label', default: 'Cart'), cartInstance.id])
                redirect cartInstance
            }
            '*'{ respond cartInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Cart cartInstance) {

        if (cartInstance == null) {
            notFound()
            return
        }

        cartInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Cart.label', default: 'Cart'), cartInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'cartInstance.label', default: 'Cart'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
