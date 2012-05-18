import edu.rpi.*

class BootStrap {

    def init = { servletContext ->
		def adminUser = new User(username: 'glosej',password: 'password', enabled: true ).save(failOnError: true)
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
		UserRole.create(adminUser, adminRole)	
    }
	
    def destroy = {
    }
}
