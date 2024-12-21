//Created by canVarli on 12/20/2024

package com.ismailcanvarli.instagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ismailcanvarli.instagram.R

@Composable
fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = { /* Edit profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = stringResource(R.string.edit_profile), color = Color.Black)
        }
        Button(
            onClick = { /* Share profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = stringResource(R.string.share_profile), color = Color.Black)
        }
        IconButton(onClick = { /* Add friend action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_friend),
                contentDescription = "Add Friend",
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}