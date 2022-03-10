import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposePanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

fun main() = SwingUtilities.invokeLater {
    val jFrame = JFrame()

    // creating ComposePanel
    val panel = ComposePanel()
    jFrame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    jFrame.title = "Swings App"
    jFrame.isVisible = true
    jFrame.setSize(600, 600)

    val button2 = JButton("Swing Button 1")
    button2.setSize(10,10)
    jFrame.contentPane.add(button2, BorderLayout.NORTH)
    jFrame.contentPane.add(panel, BorderLayout.CENTER)
    jFrame.contentPane.add(JButton("Swing Button 2"), BorderLayout.EAST)
    jFrame.contentPane.add(JButton("Swing Button 3"), BorderLayout.WEST)

    panel.setContent { composeElements() }

}
@Composable
fun composeElements() {
    Spacer(modifier = Modifier.height(50.dp))
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Row {

            Surface(
                color = Color(200, 200, 200),
                modifier = Modifier.size(130.dp, 130.dp),
                shape = RectangleShape
            ){
                Column {
                    Box(
                        modifier = Modifier.height(30.dp).fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Text("Compose Button")
                    }
                    Spacer(modifier = Modifier.height(50.dp))
                    Box(
                        modifier = Modifier.height(30.dp).fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Button(onClick = {}, shape = RoundedCornerShape(10.dp)){
                            Text("Button 1")
                        }
                    }

                }
            }
        }
    }
}
