package demo

import grails.transaction.Transactional

@Transactional
class ContactService {

	static transactional = false
	
    def getMessage() {
		"Hello"
    }

	def findByFirstName(String val){
		def result = Contact.where{
			firstName == val
		}
		
		/*
		def c = Contact.createCriteria()
		c.list{
			eq 'firstName', val
			
		}
		*/
	}
}
