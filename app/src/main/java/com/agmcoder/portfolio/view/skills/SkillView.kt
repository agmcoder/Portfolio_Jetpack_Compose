package com.agmcoder.portfolio.view.skills

// composable view of skill
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agmcoder.portfolio.model.Skill

@Composable
fun SkillView(skill: Skill) {


            Image(
                painter = painterResource(id = skill.getImage()),
                contentDescription = "Skill Image",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )

}

