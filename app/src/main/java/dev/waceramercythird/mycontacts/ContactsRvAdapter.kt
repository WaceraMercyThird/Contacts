package dev.waceramercythird.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsRvAdapter(var contactList: List<Contact>): RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
      var itemsView = LayoutInflater.from(parent.context)
          .inflate(R.layout.contact_list_items, parent, false)
        return ContactsViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text = currentContact.name
        holder.tvNumber.text = currentContact.number
        holder.tvEmail.text = currentContact.email
        holder.tvAddress.text = currentContact.address


    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    }

class ContactsViewHolder(itemsView: View): RecyclerView.ViewHolder(itemsView) {
    var tvName = itemsView.findViewById<TextView>(R.id.tvName)
    var tvNumber = itemsView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail = itemsView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress = itemsView.findViewById<TextView>(R.id.tvAddress)
    var imgContact = itemsView.findViewById<ImageView>(R.id.imgContact)

}