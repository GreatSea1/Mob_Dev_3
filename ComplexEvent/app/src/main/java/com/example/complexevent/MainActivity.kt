package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edit_text: EditText = findViewById(R.id.edit_text_field)
        var check: CheckBox = findViewById(R.id.check)
        var button: Button = findViewById(R.id.btn)
        var progress_bar: ProgressBar = findViewById(R.id.progress_bar)
        var saved_text: TextView = findViewById(R.id.t_view)

        var saving_text = edit_text.text.toString()
        var count = 0
        button.setOnClickListener {
            if (check.isChecked == true) {
                if (count < 100) {
                    count += 10;
                } else {
                    count = 0
                }
                saving_text = edit_text.text.toString()
                saved_text.text = saving_text
                progress_bar.setProgress(count)
            }
        }
    }

}