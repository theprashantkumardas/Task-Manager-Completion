package com.example.taskmanagercompletion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagercompletion.ui.theme.TaskManagerCompletionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerCompletionTheme {
                TaskCompletion()
            }
        }
    }
}

@Composable
fun TaskCompletion(){
    Column(
        modifier = Modifier.fillMaxSize() ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

        //Image of "Done"
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().padding(16.dp).height(200.dp)


        )
        //Text-1 "All task Completed"
        Text(
            text = "All task Completed",
            modifier = Modifier.padding(top = 24.dp , bottom = 8.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold
            )
        )
        //Text-2 "Nice Work"
        Text(
            text = "Nice Work",
            modifier = Modifier,
            style = TextStyle(
                fontSize = 16.sp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerCompletionTheme {
        TaskCompletion()
    }
}