package demo
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

class SampleController {

	def contactService
	
    def index() { 
		render model: [to: 'Grails'], view: 'hello'
		//redirect say
	}
	
	@Secured(value=["hasRole('ROLE_ADMIN')"])
	def sayHello(){
		render contactService.message
	}
	
	def getFirstContact(){
		def firstContact = Contact.findByFirstName('Mark')
		render firstContact as JSON
	}
	
	@Secured(value=["hasRole('ROLE_ADMIN')"])
	def getContactByLastName(String lastName){
		def contact = Contact.findByLastName(lastName)
		render contact as JSON
	}
}
