package net.iessochoa.sergiomarti.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btDairy:Button

    private lateinit var btRecipe:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btDairy = findViewById(R.id.btDairy)
        btRecipe = findViewById(R.id.btRecipe)

        btDairy.setOnClickListener{launchDairy()}
        btRecipe.setOnClickListener{launchRecipe()}
    }

    private fun launchDairy() {
        startActivity(Intent(this, DairyActivity::class.java))
    }

    private fun launchRecipe() {
        startActivity(Intent(this, RecipeActivity::class.java))
    }
}