package com.toolsfrom3721.browserqtile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.app.role.RoleManager
import android.content.Context
import android.content.Intent
import android.provider.Browser
import com.toolsfrom3721.browserqtile.ui.theme.BrowserQTileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrowserQTileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    Button(onClick = {
//                        val roleManager = this.getSystemService(Context.ROLE_SERVICE)
//                                as RoleManager
//                        if (roleManager.isRoleAvailable(RoleManager.ROLE_BROWSER) &&
//                            !roleManager.isRoleHeld(RoleManager.ROLE_BROWSER)
//                        ) {
//                            val intent = roleManager.createRequestRoleIntent(RoleManager.ROLE_BROWSER)
//                            startActivity(intent)
//                        }
//                        var x = this.getSystemService(Context.Web) as Browser

                        this.startActivity(Intent(android.provider.Browser.EXTRA_CREATE_NEW_TAB))
                    }){

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BrowserQTileTheme {
        Greeting("Android")
    }
}