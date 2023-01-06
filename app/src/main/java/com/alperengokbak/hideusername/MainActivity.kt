package com.alperengokbak.hideusername

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences : SharedPreferences
    var takenUsername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SharedPreferences

        sharedPreferences = this.getSharedPreferences("com.alperengokbak.hideusername", Context.MODE_PRIVATE)
        takenUsername = sharedPreferences.getString("Username", "Empty!")

        if (takenUsername != null) {
            txtView.text = "Saved Username: ${takenUsername}"
        }
    }

    fun saveFun(view: View) {
        val username = txtEdit.text.toString()

        if (username == "") {
            Toast.makeText(this, "Enter The Valid Variable!!",Toast.LENGTH_LONG).show()
        } else {
            sharedPreferences.edit().putString("Username", username).apply()
            txtView.text = "Saved Username: ${username}"
        }
    }

    fun deleteFun(view: View) {
        takenUsername = sharedPreferences.getString("Username", "Empty!")

        if (takenUsername != null) {
            txtView.text = "Saved Username: "
            sharedPreferences.edit().remove("Username").apply()
        }
    }
}