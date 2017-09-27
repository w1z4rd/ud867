package com.example

import spock.lang.Specification

class JokesFactoryTest extends Specification {

    def "supply punchline joke"() {
        when: "the factory provides a punchline joke"
        def punchLiner = JokesFactory.punchLiner()

        then: "the joke has all the expected fields"
        punchLiner.id == 1L
        punchLiner.tags.containsAll(["priest", "lawyer"])
        punchLiner.body == "What do you call a priest that becomes a lawyer?"
        punchLiner.punchLine == "A father in law."
    }

    def "supply simple joke"() {
        when: "the factory provides a joke"
        def joke = JokesFactory.joke()

        then: "the joke has all the expected fields"
        joke.id == 2L
        joke.tags.containsAll(["grammar"])
        joke.body == "The past, present and future walked into a bar... It was tense!"
    }
}