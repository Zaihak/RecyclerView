package com.example.recyclerviewhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework.adapter.ShoppingCardAdapter
import com.example.recyclerviewhomework.model.ShoppingCard

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var shoppingCardRecyclerView:RecyclerView=findViewById(R.id.shopping_card_recyclerview)
        var shoppingCardAdapter=ArrayList<ShoppingCard>()
        shoppingCardAdapter.add(ShoppingCard(1,"Air VapourMax","FlyInk","100$",R.drawable.shoes))
        shoppingCardAdapter.add(ShoppingCard(2,"Errick","Ven","300$",R.drawable.nick))
        shoppingCardAdapter.add(ShoppingCard(3,"Adidas","Sneaker","220$",R.drawable.runningshoes))
        shoppingCardAdapter.add(ShoppingCard(4,"Nicky","Sport","400$",R.drawable.runningshoes))
        var shoppingCardlist=ShoppingCardAdapter(shoppingCardAdapter)
        shoppingCardRecyclerView.layoutManager=GridLayoutManager(this,2)
        shoppingCardRecyclerView.adapter=shoppingCardlist


    }
}
