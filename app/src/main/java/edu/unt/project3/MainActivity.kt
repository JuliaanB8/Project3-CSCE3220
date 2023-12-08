package edu.unt.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import edu.unt.project3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toastButton = findViewById<Button>(R.id.button1)
        val toastImage = findViewById<ImageView>(R.id.imageViewToast)

        val windButton = findViewById<Button>(R.id.button2)
        val windImage = findViewById<ImageView>(R.id.imageViewWind)

        val bookButton = findViewById<Button>(R.id.button3)
        val bookImage = findViewById<ImageView>(R.id.imageViewBook)

        toastButton.setOnClickListener {
            toastImage.visibility = View.VISIBLE
            windImage.visibility = View.GONE
            bookImage.visibility = View.GONE
        }


        windButton.setOnClickListener{
            toastImage.visibility = View.GONE
            windImage.visibility = View.VISIBLE
            bookImage.visibility = View.GONE
        }


        bookButton.setOnClickListener {
            toastImage.visibility = View.GONE
            windImage.visibility = View.GONE
            bookImage.visibility = View.VISIBLE
        }
    }
}