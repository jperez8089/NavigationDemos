package com.ebookfrenzy.navigationdemos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import com.ebookfrenzy.navigationdemos.ui.main.MainFragment


class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)



    }

    override fun onFragmentInteraction(uri:Uri){





    }




}
