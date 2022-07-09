package dev.baseio.discordjetpackcompose.ui.routes.onboarding.screens.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import dev.baseio.discordjetpackcompose.R.color

@Composable
fun RegistrationTextField(
  modifier: Modifier = Modifier,
  onClick: () -> Unit = {},
  value: String,
  onValueChange: (String) -> Unit,
  label: String,
  isEnabled: Boolean = true,
  focusRequester: FocusRequester = remember { FocusRequester() }
) {
  TextField(
    modifier = modifier
      .fillMaxHeight()
      .clickable { onClick() }
      .focusRequester(focusRequester),
    shape = RoundedCornerShape(4.dp),
    enabled = isEnabled,
    colors = TextFieldDefaults.textFieldColors(
      textColor = colorResource(id = color.white),
      disabledTextColor = colorResource(id = color.white),
      backgroundColor = Color(0xFF222327),
      focusedIndicatorColor = Color.Transparent, // hide the indicator
      unfocusedIndicatorColor = Color.Transparent,
      disabledIndicatorColor = Color.Transparent
    ),
    value = value,
    onValueChange = onValueChange,
    label = { Text(label, color = Color(0xFFb5b6bb)) }
  )
}