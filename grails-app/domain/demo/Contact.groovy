package demo

class Contact {

	String firstName
	String lastName
	Integer age
	String email
	
    static constraints = {
		firstName()
		lastName nullable: true
		age()
		email email: true
    }
}
