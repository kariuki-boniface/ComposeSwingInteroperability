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

fun main() = singleWindowApplication(title = "Compose Simple Application") {

    Column {
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(top = 20.dp),
            contentAlignment = Alignment.TopCenter){
                Button( modifier = Modifier.size(200.dp, 40.dp), onClick = {}){
                    Text("Compose Button")
                }

        }
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(top = 20.dp),
             contentAlignment = Alignment.Center ){
            Button( modifier = Modifier.size(200.dp, 40.dp), onClick = {}){
                Text("Compose Button")
            }
        }
        Box(modifier = Modifier.fillMaxWidth().height(60.dp).padding(20.dp),
            contentAlignment = Alignment.Center){
            SwingPanel(
                modifier = Modifier.size(200.dp, 40.dp),
                background = White,
                factory = {
                    val button = JButton("Swing Button")
                    button.preferredSize = Dimension(40,40)
                    val panel = JPanel()
                    panel.add(button, BoxLayout.X_AXIS)
                }
            )
        }
    }

}