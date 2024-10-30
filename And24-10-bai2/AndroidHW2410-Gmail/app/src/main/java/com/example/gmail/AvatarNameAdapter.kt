package com.example.gmail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class AvatarNameAdapter(
    var avatarNameList: ArrayList<String>,
    var context: Context,
    var detailList: ArrayList<String>,
    var imageList: ArrayList<Int>) : RecyclerView.Adapter<AvatarNameAdapter.AvatarViewHolder>()
{
    //card design
    class AvatarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewAvarName : TextView = itemView.findViewById(R.id.nameImg)
        var texViewDetail : TextView = itemView.findViewById(R.id.detail)
        var imageView : CircleImageView = itemView.findViewById(R.id.initials)
    }

    //as soon as the AvatarViewHolder class is created, this method get called
    //in this method we define the card design that we've made
    //So it's thanks to this method we determine which design will be displayed in the recycler view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvatarViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return AvatarViewHolder(view)
    }

    //In this method, we will specify the amount of data that's going to be displayed in RecyclerView.
    override fun getItemCount(): Int {
        return avatarNameList.size
    }

    //this method is also the method where we specify what
    //should be done when the design we created is connected to RecyclerView.
    //In other words, we will show the data on the screen in RecyclerView in this method.
    override fun onBindViewHolder(holder: AvatarViewHolder, position: Int) {
        holder.textViewAvarName.text = avatarNameList.get(position)
        holder.texViewDetail.text = detailList.get(position)
        holder.imageView.setImageResource(imageList.get(position))
    }
}