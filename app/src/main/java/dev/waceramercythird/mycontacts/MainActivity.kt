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
        var contact = Contact("Anne","0738489489","anne@gmail.com","616 Korongo Road","")
        var contact1 = Contact("Mary","0767378873","mary@gmail.com","Kenyatta Avenue","")
        var contact2 = Contact("Joan","0745568387","joan@gmail.com","Nairobi","")
        var contact3 = Contact("Christine","0748974984","christine@gmail.com","Kiambu","")
        var contact4 = Contact("Pauline","0789366894","pauline@gmail.com","Meru","")

        var contactList = listOf(contact,contact1,contact2,contact3,contact4)
        var contactsAdapter = ContactsRvAdapter(contactList)
        binding.rvContact.layoutManager= LinearLayoutManager(this)
        binding.rvContact.adapter  = contactsAdapter

    }
}