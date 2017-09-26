package com.udacity.gradle

import spock.lang.Specification

class EchoTest extends Specification {

	def "echo test"() {
		expect:
		Echo.echo('hello') == 'hello'
	}

}

