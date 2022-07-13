package dev.waceramercythird.mycontacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
        var context = holder.itemView.context
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
//            cvContact.setOnClickListener{
//                var context = holder.itemView.context
//                var intent = Intent(context, ViewContactActivity::class.java)
//                context.startActivity(intent)
//                holder.itemView.context.startActivities()
            }
        holder.binding.cvContact.setOnClickListener{
            var intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME", currentContact.name)
            intent.putExtra("PHONE_NUMBER",currentContact.number)
            intent.putExtra("EMAIL", currentContact.email)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("IMAGE", currentContact.image)
            context.startActivity(intent)


        }
        holder.binding.imgContact.setOnClickListener{
            Toast
                .makeText(context, "You have clicked on my face", Toast.LENGTH_LONG)
                .show()
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactListItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {


}