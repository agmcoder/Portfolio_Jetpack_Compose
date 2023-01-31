package com.agmcoder.portfolio.view.skills

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agmcoder.portfolio.R
import com.agmcoder.portfolio.model.Skill
import com.agmcoder.portfolio.ui.theme.Shapes


@Composable
fun SkillsView() {// appmodel as parameter
    //create a constant with the width of the screen

    // crea una lista de images de los resources Mock
    val skills: List<Skill> = listOf(
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 1"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 2"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 3"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 1"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 2"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 3"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 1"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 2"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 3"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 1"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 2"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 3"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 1"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 2"),
        Skill(image = R.drawable.ic_launcher_background, name = "Skill 3"),
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxHeight()

    ) {
        items(skills) { skill ->
            Image(
                painter = painterResource(id = skill.getImage()),
                contentDescription = "Skill Image",
                modifier = Modifier
                    .padding(20.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .clip(
                        shape = RoundedCornerShape(20)
                    )
            )
        }
    }
}

// create a preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SkillsView()
}


