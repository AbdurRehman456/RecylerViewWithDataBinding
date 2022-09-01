package com.hydratech.recylerviewwithdatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.hydratech.recylerviewwithdatabinding.adapters.MyAdapterClass
import com.hydratech.recylerviewwithdatabinding.databinding.ActivityMainBinding
import com.hydratech.recylerviewwithdatabinding.model.Students

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.recview.layoutManager = LinearLayoutManager(this)
        mainBinding.recview.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
        val adaptar = MyAdapterClass(this,getStudent())
        mainBinding.recview.adapter = adaptar


    }


    fun getStudent(): List<Students> {
        val sList: MutableList<Students> = ArrayList<Students>()
        sList.add(Students("abdul", "bba"))
        sList.add(Students("Qadir", "bcs"))
        sList.add(Students("basit", "software"))
        sList.add(Students("imran", "jmm"))
        sList.add(Students("ilyas", "bse"))
        sList.add(Students("hassan", "bcs"))
        sList.add(Students("saqi", "se"))
        return sList
    }
}