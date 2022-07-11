package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragmentone:Fragment() {
    lateinit var rootview:View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        rootview=inflater.inflate(R.layout.fragmentonelayout,container,false)
        return rootview


    }

}