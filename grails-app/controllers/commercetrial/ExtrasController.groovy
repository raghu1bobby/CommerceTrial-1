package commercetrial



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ExtrasController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Extras.list(params), model:[extrasInstanceCount: Extras.count()]
    }

    def show(Extras extrasInstance) {
        respond extrasInstance
    }

    def create() {
        respond new Extras(params)
    }

    @Transactional
    def save(Extras extrasInstance) {
        if (extrasInstance == null) {
            notFound()
            return
        }

        if (extrasInstance.hasErrors()) {
            respond extrasInstance.errors, view:'create'
            return
        }

        extrasInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'extrasInstance.label', default: 'Extras'), extrasInstance.id])
                redirect extrasInstance
            }
            '*' { respond extrasInstance, [status: CREATED] }
        }
    }

    def edit(Extras extrasInstance) {
        respond extrasInstance
    }

    @Transactional
    def update(Extras extrasInstance) {
        if (extrasInstance == null) {
            notFound()
            return
        }

        if (extrasInstance.hasErrors()) {
            respond extrasInstance.errors, view:'edit'
            return
        }

        extrasInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Extras.label', default: 'Extras'), extrasInstance.id])
                redirect extrasInstance
            }
            '*'{ respond extrasInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Extras extrasInstance) {

        if (extrasInstance == null) {
            notFound()
            return
        }

        extrasInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Extras.label', default: 'Extras'), extrasInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'extrasInstance.label', default: 'Extras'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
