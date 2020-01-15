package com.example.recyclerviewhomework.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework.R
import com.example.recyclerviewhomework.model.ShoppingCard
import kotlinx.android.synthetic.main.shopping_card.*

class ShoppingCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var itemName=itemView.findViewById<TextView>(R.id.item_name)
    var itemId=itemView.findViewById<TextView>(R.id.item_id)
    var itemPrice=itemView.findViewById<TextView>(R.id.item_price)
    var itemCategory=itemView.findViewById<TextView>(R.id.item_category)
    var itemImage=itemView.findViewById<ImageView>(R.id.item_image)
    var itemIcon=itemView.findViewById<ImageView>(R.id.shopping_icon)

}
class ShoppingCardAdapter(var shoppingCardList:ArrayList<ShoppingCard>):RecyclerView.Adapter<ShoppingCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingCardViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.shopping_card,parent,false)
        return ShoppingCardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoppingCardList.size
    }

    override fun onBindViewHolder(holder: ShoppingCardViewHolder, position: Int) {
        holder.itemName.text=shoppingCardList[position].name
        holder.itemPrice.text=shoppingCardList[position].price
        holder.itemId.text=shoppingCardList[position].id.toString()
        holder.itemCategory.text=shoppingCardList[position].category
        holder.itemImage.setImageResource(shoppingCardList[position].itemImage)


    }
}
