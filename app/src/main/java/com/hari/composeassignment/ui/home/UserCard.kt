package com.hari.composeassignment.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hari.composeassignment.R


@Composable
fun UserCard(
    firstLine: String,
    secondLine: String? = null,
    iconRes: Int = 0,
    onClickCard: (() -> Unit)? = null
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClickCard?.invoke() },
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 4.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = firstLine ,
                    style = MaterialTheme.typography.h6
                )
                if(secondLine!=null){
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = secondLine,
                        style = MaterialTheme.typography.body2
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            if (iconRes != 0)
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = "icon",
                    modifier = Modifier
                )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UserCardPreview() {
    UserCard(
        firstLine = "Hari Singh Kulhari",
        secondLine = "Android Developer",
        iconRes = R.drawable.ic_android_black_24dp
    )
}
