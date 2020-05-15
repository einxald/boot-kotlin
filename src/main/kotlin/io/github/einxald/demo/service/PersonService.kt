package io.github.einxald.demo.service

import io.github.einxald.demo.persistence.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(private val personRepository: PersonRepository): PersonRepository by personRepository