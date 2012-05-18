package edu.rpi

import grails.plugins.springsecurity.Secured

class SecurityTestController {

	@Secured(['ROLE_ADMIN'])
    def adminOnly() { 
		render 'This is for ADMINs only and you are ' + principal
	}

    def index() { 
		render 'This is index and you are ' + principal
	}
}
