package io.github.einxald.demo.web.rest.controller

import io.github.einxald.demo.domain.Person
import io.github.einxald.demo.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
class PersonController(private val personService: PersonService) {

    @PostMapping
    fun createPerson(@RequestBody person: Person): ResponseEntity<Person> {
        return ResponseEntity.ok(personService.save(person))
    }

    @GetMapping
    fun getPersons(): ResponseEntity<MutableIterable<Person>> {
        return ResponseEntity.ok(personService.findAll())
    }

}