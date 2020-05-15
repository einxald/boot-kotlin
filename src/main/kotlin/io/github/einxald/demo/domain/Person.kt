package io.github.einxald.demo.domain

import io.github.einxald.demo.domain.trait.Name
import io.github.einxald.demo.domain.trait.impl.Named
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Person(@Id @GeneratedValue var id: Long? = null): Name by Named()