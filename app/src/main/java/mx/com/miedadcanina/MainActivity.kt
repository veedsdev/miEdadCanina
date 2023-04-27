package mx.com.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.et_age)
        val tvResultAge = findViewById<TextView>(R.id.tv_result_age)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

        btnCalculate.setOnClickListener{
            val ageString = etAge.text.toString()
            val ageInt = ageString.toInt()
            val result = ageInt * 7
            tvResultAge.text="Tu edad canina es de $result años"
        }

    }
}