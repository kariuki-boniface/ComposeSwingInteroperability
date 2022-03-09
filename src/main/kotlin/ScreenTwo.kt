import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import java.awt.BorderLayout.CENTER
import java.awt.Color
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JPanel

fun main() = singleWindowApplication {
    Column {
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(top = 20.dp),
            contentAlignment = Alignment.Center){
                Button( modifier = Modifier.size(270.dp, 30.dp), onClick = {}){
                    Text("Compose Button")
                }

        }
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(top = 20.dp),
             contentAlignment = Alignment.Center ){
            Button( modifier = Modifier.size(270.dp, 30.dp), onClick = {}){
                Text("Compose Button")
            }
        }
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(20.dp),
            contentAlignment = Alignment.Center){
            SwingPanel(
                background = White,
                modifier = Modifier.size(270.dp, 90.dp),
                factory = {
                    val button = JButton("Swing Button")
                    button.preferredSize = Dimension(40,40)

                    JPanel().apply {
                        layout = BoxLayout(this, BoxLayout.X_AXIS)
                        add(button)
                    }
                }
            )
        }
    }

}