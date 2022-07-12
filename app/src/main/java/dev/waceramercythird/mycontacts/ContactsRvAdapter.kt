package dev.waceramercythird.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.waceramercythird.mycontacts.databinding.ContactListItemsBinding

class ContactsRvAdapter(var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListItemsBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        with(holder.binding) {
            tvName.text = currentContact.name
            tvNumber.text = currentContact.number
            tvEmail.text = currentContact.email
            tvAddress.text = currentContact.address
            Picasso.get()
                .load(currentContact.image)
                .resize(100,100)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_person_24)
                .error(R.drawable.ic_baseline_error_24)
                .into(holder.binding.imgContact)


        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactListItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {


}