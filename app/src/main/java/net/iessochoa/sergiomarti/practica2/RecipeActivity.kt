package net.iessochoa.sergiomarti.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class RecipeActivity : AppCompatActivity() {

    private lateinit var tvDescription:TextView

    private lateinit var tvDescriptionTitle:TextView

    private lateinit var tvIngredients:TextView

    private lateinit var tvIngredientsTitle:TextView

    private lateinit var tvRecipeText:TextView

    private lateinit var tvRecipeTitle:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        // Mapeamos los elementos de la view que queremos añadirles una funcionalidad
        // o a los que vamos a acceder a sus datos
        tvDescription = findViewById(R.id.tvDescription)
        tvDescriptionTitle = findViewById(R.id.tvDescriptionTitle)

        tvIngredients = findViewById(R.id.tvIngredients)
        tvIngredientsTitle = findViewById(R.id.tvIngredientsTitle)

        tvRecipeText = findViewById(R.id.tvRecipeText)
        tvRecipeTitle = findViewById(R.id.tvRecipeTitle)

        // Añadimos la funcionalidad cuando se clicka sobre uno de los Text Views:
        // descripción, ingredientes o la receta
        tvDescription.setOnClickListener{showOnActivity(tvDescriptionTitle, tvDescription)}
        tvIngredients.setOnClickListener{showOnActivity(tvIngredientsTitle, tvIngredients)}
        tvRecipeText.setOnClickListener{showOnActivity(tvRecipeTitle, tvRecipeText)}
    }

    /**
     * Solo es necesario definir una función que envie la información a la activity que
     * muestra la información ampliada.
     */
    private fun showOnActivity(tv1: TextView, tv2: TextView) {
        if (!tv1.text.isEmpty() && !tv2.text.isEmpty()) {
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra(ShowActivity.EXTRA_TITLE, tv1.text)
            intent.putExtra(ShowActivity.EXTRA_TEXT, tv2.text)
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.warning_text_is_empty, Toast.LENGTH_LONG).show()
        }
    }

}