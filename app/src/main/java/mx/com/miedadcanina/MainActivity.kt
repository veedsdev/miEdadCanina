package mx.com.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.et_age)
        val tvResultAge = findViewById<TextView>(R.id.tv_result_age)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

//        Log.v("MainActivity", "MainActivity is created verbose")
//        Log.d("MainActivity", "MainActivity is created debug")
//        Log.i("MainActivity", "MainActivity is created info")
//        Log.w("MainActivity", "MainActivity is created warning")
//        Log.e("MainActivity", "MainActivity is created error")


        btnCalculate.setOnClickListener{
            val ageString = etAge.text.toString()
            if(ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                tvResultAge.text="Tu edad canina es de $result años"
            }
            else{

                Log.d("MainActivity", "ageString is empty")
                Toast.makeText(this, "Debes insertar tu edad", Toast.LENGTH_SHORT).show()
            }
        }

    }
}