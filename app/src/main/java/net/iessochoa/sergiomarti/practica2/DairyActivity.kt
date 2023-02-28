package net.iessochoa.sergiomarti.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class DairyActivity : AppCompatActivity() {

    private lateinit var tvNewContact:TextView

    private lateinit var etName:EditText

    private lateinit var etSurnames:EditText

    private lateinit var etPhone:EditText

    private lateinit var etNotes:EditText

    private lateinit var btOk:Button

    private lateinit var btCancel:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dairy)

        // Mapear el contenido de la view
        tvNewContact = findViewById(R.id.tvNewContact)
        etName = findViewById(R.id.etName)
        etSurnames = findViewById(R.id.etSurnames)
        etPhone = findViewById(R.id.etPhone)
        etNotes = findViewById(R.id.etNotes)

        btOk = findViewById(R.id.btOk)
        btCancel = findViewById(R.id.btCancel)

        btOk.setOnClickListener{changeTvNewContactText()}
        btCancel.setOnClickListener{finish()}
    }

    private fun changeTvNewContactText() {
        if (!etName.text.isEmpty() && !etSurnames.text.isEmpty()) {
            tvNewContact.text = etName.text.toString() + " " + etSurnames.text.toString()
        } else if (etName.text.isEmpty() && !etSurnames.text.isEmpty()) {
            Toast.makeText(this, R.string.dairy_not_name,Toast.LENGTH_LONG).show()
        } else if (!etName.text.isEmpty() && etSurnames.text.isEmpty()) {
            Toast.makeText(this, R.string.dairy_not_surname,Toast.LENGTH_LONG).show()
        } else {
            // Si lo hacia concatenando cadenas daba un error al no reconocer el tipo string
            Toast.makeText(this, String.format("%s %s", R.string.dairy_not_name, R.string.dairy_not_surname),Toast.LENGTH_LONG).show()
        }
    }
}