import demo.*

class BootStrap {

    def init = { servletContext ->
		def data = [['Ram', 'Kumar', 30, 'ram@temp.com'],
					['Mark', 'John', 25, 'mark@temp.com']
				]
		data.each{ record ->
			new Contact(firstName: record[0],
						lastName: record[1],
						age: record[2],
						email: record[3]
				).save()
		}
		
		def u = new User(username: 'admin', password: 'secret').save()
		def role = new Role(authority: 'ROLE_ADMIN').save()
		UserRole.create(u, role)
    }
    def destroy = {
    }
}
