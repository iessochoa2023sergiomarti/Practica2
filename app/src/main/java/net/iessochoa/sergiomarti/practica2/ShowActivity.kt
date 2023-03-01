package net.iessochoa.sergiomarti.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowActivity : AppCompatActivity() {

    companion object {
        var EXTRA_TITLE="practica2.ShowActivity.showTitle"
        var EXTRA_TEXT="practica2.ShowActivity.showText"
    }

    private lateinit var tvShowTitle:TextView

    private lateinit var tvShowText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        tvShowTitle = findViewById(R.id.tvShowTitle)
        tvShowText = findViewById(R.id.tvShowText)

        tvShowTitle.text = intent.getStringExtra(EXTRA_TITLE)
        tvShowText.text = intent.getStringExtra(EXTRA_TEXT)
    }
}