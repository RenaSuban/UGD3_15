package com.unguided.ugd3_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unguided.ugd3_15.entity.Star

class StarFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_star, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
       // val adapter : RVStarAdapter = RVStarAdapter()

        //val rvStar : RecyclerView = view.findViewById(R.id.rv_star)

        //rvStar.layoutManager = layoutManager

       // rvStar.setHasFixedSize(true)

        //rvStar.adapter = adapter
    }
}