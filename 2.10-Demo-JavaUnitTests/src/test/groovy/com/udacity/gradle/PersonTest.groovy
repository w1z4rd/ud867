package com.udacity.gradle

import spock.lang.Specification

class PersonTest extends Specification {

  def "check person name"() {
    given:
    def person = new Person('Jeremy')

    when:
    def result = person.name

    then:
    result == 'Jeremy'
  }

}

