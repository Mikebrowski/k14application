package azure.git.k14application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //
    private lateinit var qrCodeImg : ImageView
    private lateinit var outputData: TextView
    private lateinit var btnGenerateQR: Button
    private lateinit var scanQrButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGenerateQR.findViewById<Button>(R.id.generateQR)
        scanQrButton.findViewById<Button>(R.id.scanQr)
        outputData.findViewById<TextView>(R.id.outputQR)
    }
}