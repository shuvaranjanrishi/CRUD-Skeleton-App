package com.therishideveloper.schoolattendance.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.therishideveloper.schoolattendance.ui.components.myTopBarColors
import com.therishideveloper.schoolattendance.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AttendanceScreen(onMenuClick: () -> Unit) { // এই প্যারামিটারটি যোগ করা হয়েছে
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("হাজিরা নিন") },
                navigationIcon = {
                    IconButton(onClick = onMenuClick) {
                        Icon(Icons.Default.Menu, contentDescription = stringResource(R.string.menu))
                    }
                },
                colors = myTopBarColors()
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "হাজিরা মডিউল শীঘ্রই আসছে!",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "এখানে ক্যালেন্ডার এবং ছাত্র তালিকা থাকবে।",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}