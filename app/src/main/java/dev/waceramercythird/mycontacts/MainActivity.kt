package dev.waceramercythird.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.waceramercythird.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact = Contact("Anne","0738489489","anne@gmail.com","616 Korongo Road","https://images.pexels.com/photos/2876486/pexels-photo-2876486.png?auto=compress&cs=tinysrgb&w=600","0738769335","")
        var contact1 = Contact("Mary","0767378873","mary@gmail.com","Kenyatta Avenue","https://images.pexels.com/photos/935985/pexels-photo-935985.jpeg?auto=compress&cs=tinysrgb&w=600","07839836836","")
        var contact2 = Contact("Joan","0745568387","joan@gmail.com","Nairobi","https://images.pexels.com/photos/936119/pexels-photo-936119.jpeg?auto=compress&cs=tinysrgb&w=600","07873686359","")
        var contact3 = Contact("Christine","0748974984","christine@gmail.com","Kiambu","https://images.pexels.com/photos/1181498/pexels-photo-1181498.jpeg?auto=compress&cs=tinysrgb&w=600","07937836434","")
        var contact4 = Contact("Pauline","0789366894","pauline@gmail.com","Meru","https://images.pexels.com/photos/1820919/pexels-photo-1820919.jpeg?auto=compress&cs=tinysrgb&w=600","0754737534","")

        var contactList = listOf(contact,contact1,contact2,contact3,contact4)
        var contactsAdapter = ContactsRvAdapter(contactList)
        binding.rvContact.layoutManager= LinearLayoutManager(this)
        binding.rvContact.adapter  = contactsAdapter

    }
}