package com.practice.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonclick(view: View) {
        val name = inputname.editableText.toString()
        val intent = Intent(this, BirthdayCardActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)


        

    }
}