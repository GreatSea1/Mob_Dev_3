package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView1_1: TextView = findViewById(R.id.textView1_1)
        var textView1_2: TextView = findViewById(R.id.textView1_2)
        var textView1_3: TextView = findViewById(R.id.textView1_3)

        var textView2_1: TextView = findViewById(R.id.textView2_1)
        var textView2_2: TextView = findViewById(R.id.textView2_2)
        var textView2_3: TextView = findViewById(R.id.textView2_3)

        var textView3_1: TextView = findViewById(R.id.textView3_1)
        var textView3_2: TextView = findViewById(R.id.textView3_2)
        var textView3_3: TextView = findViewById(R.id.textView3_3)

        val textViews = listOf(textView1_1, textView1_2, textView1_3, textView2_1, textView2_2, textView2_3, textView3_1, textView3_2, textView3_3)

        var Button: Button = findViewById(R.id.low_button)
        var num_of_view = 0;

        fun change_number(arg: Int) {
            var count = 0
            for (view in textViews) {
                ++count
                if (count == 4) {
                    count = 1
                }
                if (count % 4 == arg) {
                    view.text = arg.toString()
                } else {
                    view.text = ""
                }
            }
        }

        Button.setOnClickListener {
            if (num_of_view < 3) {
                ++num_of_view
            } else {
                num_of_view = 1
            }
            change_number(num_of_view)
        }
    }
}