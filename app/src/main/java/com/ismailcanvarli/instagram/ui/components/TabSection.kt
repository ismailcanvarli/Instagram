//Created by canVarli on 12/20/2024

package com.ismailcanvarli.instagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ismailcanvarli.instagram.R

@Composable
fun TabSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TabItem(
            iconResId = R.drawable.ic_grid, contentDescription = stringResource(R.string.photos)
        )
        TabItem(
            iconResId = R.drawable.ic_reels, contentDescription = stringResource(R.string.reels)
        )
        TabItem(
            iconResId = R.drawable.ic_tagged, contentDescription = stringResource(R.string.tagged)
        )
    }
}