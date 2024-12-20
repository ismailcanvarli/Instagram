//Created by canVarli on 12/20/2024

package com.ismailcanvarli.instagram.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ismailcanvarli.instagram.R

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.profile_name),
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = { /* Share profile action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = stringResource(R.string.share_button),
                tint = Color.Black
            )
        }
        IconButton(onClick = { /* Options action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = stringResource(R.string.menu_button),
                tint = Color.Black
            )
        }
    }
}