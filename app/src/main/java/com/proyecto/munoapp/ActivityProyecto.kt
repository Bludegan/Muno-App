package com.proyecto.munoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proyecto.munoapp.databinding.ActivityProyectoBinding


class ActivityProyecto : AppCompatActivity() {
    private lateinit var binding:ActivityProyectoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProyectoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras =intent.extras

        val titulo =extras?.getString("titulo")
        val btn_config = binding.btnConfig

        val btn_regresar = binding.btnRegresar
        val txtProyectoNombre=binding.txtProyectoNombre

        val ll_checkList=binding.llChecklist

        val ll_sala=binding.llSala

        // Listeners para abrir activities

        txtProyectoNombre.text=titulo

        btn_config.setOnClickListener {
            var intent:Intent = Intent(this,ActivityConfigProyecto::class.java)
            startActivity(intent)
        }
        ll_checkList.setOnClickListener{
            val intent: Intent = Intent(this,ChecklistActivity::class.java)
            startActivity(intent)
        }

        ll_sala.setOnClickListener{
            val intent: Intent = Intent(this,SalaActivity::class.java)
            startActivity(intent)
        }

        //TODO funcionalidad de actividad.

        btn_regresar.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            finish()
        }

    }
}