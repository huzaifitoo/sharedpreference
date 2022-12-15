package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            getValues()
            setValuesToViews()

            binding.bSave.setOnClickListener {
                val email = binding.etEmail.text.toString()
                val dob = binding.etDob.text.toString()
                val pass = binding.etPassword.text.toString()

                SharedPrefHelper.saveEmail(this, email)
                SharedPrefHelper.saveDob(this, dob)
                SharedPrefHelper.savePassword(this, pass)

            }

            binding.bClear.setOnClickListener {

                SharedPrefHelper.clearEmail(this)
                SharedPrefHelper.clearDob(this)
                SharedPrefHelper.clearPassword(this)

                binding.etEmail.setText("")
                binding.etDob.setText("")
                binding.etPassword.setText("")

            }

        }

        private fun getValues() {
            val email = SharedPrefHelper.getEmail(this)
            val dob = SharedPrefHelper.getDob(this)
            val pass = SharedPrefHelper.getPassword(this)

            if (email != null && dob != null &&  pass != null) {
                if (email.isNotEmpty() && dob.isNotEmpty()) {

                }
            }
        }

        private fun setValuesToViews() {
            val email = SharedPrefHelper.getEmail(this)
            val dob = SharedPrefHelper.getDob(this)
            val pass = SharedPrefHelper.getPassword(this)

            binding.etEmail.setText(email)
            binding.etDob.setText(dob)
            binding.etPassword.setText(pass)
    }
}