package com.hari.composeassignment.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hari.composeassignment.R

@Composable
fun HomeScreen(
    toggleTheme: () -> Unit
) {
    Scaffold(
        topBar = { HomeScreenAppBar(toggleTheme) }
    ) { innerPadding ->
        UsersList(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxHeight()
        )
    }
}

@Composable
fun UsersList(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        modifier = modifier
    ) {
        items(5) { index ->
            UserCard(
                firstLine = "User headline $index",
                secondLine = "Subtitle $index",
                iconRes = R.drawable.ic_android_black_24dp,
                onClickCard = {}
            )
        }
    }
}

@Composable
fun HomeScreenAppBar(
    toggleTheme: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Home Screen", style = MaterialTheme.typography.h6)
        },
        navigationIcon = {
            IconButton({}) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Navigation Icon")
            }
        },
        actions = {
            IconButton(toggleTheme) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_theme),
                    contentDescription = "Dark Theme"
                )
            }
        },
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 8.dp
    )

}


@Preview(
    name = "Light Mode",
    showBackground = true
)
@Composable
fun DefaultPreview() {
    HomeScreen(toggleTheme = {})
}

