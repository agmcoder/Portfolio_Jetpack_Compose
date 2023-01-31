package com.agmcoder.portfolio.model

import java.util.UUID

data class Skill(private val image: Int, private val name: String) {
    private val id = UUID.randomUUID().toString()

    fun getImage(): Int = image
    fun getSkillName(): String = name
    fun getId(): String = id
}
