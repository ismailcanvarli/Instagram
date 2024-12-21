//Created by canVarli on 12/20/2024

package com.ismailcanvarli.instagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ismailcanvarli.instagram.R

@Composable
fun ActionButtons() {
    val textSize = 14.sp

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /* Edit profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.1f)),
            modifier = Modifier
                .weight(4f)
                .height(32.dp)
                .clip(RectangleShape)
        ) {
            Text(
                text = stringResource(R.string.edit_profile),
                color = Color.Black,
                fontSize = textSize
            )
        }
        Button(
            onClick = { /* Share profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.1f)),
            modifier = Modifier
                .weight(4f)
                .height(32.dp)
                .clip(RectangleShape)
        ) {
            Text(
                text = stringResource(R.string.share_profile),
                color = Color.Black,
                fontSize = textSize
            )
        }
        Button(
            onClick = { /* Add friend action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.1f)),
            modifier = Modifier
                .weight(1f)
                .height(32.dp)
                .padding(0.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_friend),
                contentDescription = "Add Friend",
                tint = Color.Black,
                modifier = Modifier.size(24.dp) // İkon boyutu
            )
        }
    }
}