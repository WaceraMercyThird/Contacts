package dev.waceramercythird.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.waceramercythird.mycontacts.databinding.ActivityMainBinding
import dev.waceramercythird.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding : ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        var name= extras?.getString("NAME", "")
        var number = extras?.getString("PHONE_NAME","")
        var email = extras?.getString("EMAIL","")
        var address = extras?.getString("ADDRESS","")
        var image = extras?.getString("IMAGE","")



        Toast.makeText(this,name,Toast.LENGTH_LONG).show()

        binding.tvnames.text = name
        binding.tvAddresst.text = address
        binding.tvEmail.text = email
        binding.tvnumbers.text = number
        Picasso
            .get()
            .load(intent.getStringExtra("IMAGE"))
            .into(image)

    }
}