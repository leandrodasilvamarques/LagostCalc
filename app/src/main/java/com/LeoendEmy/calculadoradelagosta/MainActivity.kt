package com.LeoendEmy.calculadoradelagosta

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.LeoendEmy.calculadoradelagosta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View) {
        var mestre = binding.textMestre.text
        var manguereiro = binding.textManguereiro.text
        var mergulhador = binding.textMergulhador.text
        var barco = binding.textBarco.text
        var kg = binding.editQuilosLagosta.text.toString().toDoubleOrNull()
        var valor = binding.editValor.text.toString().toDoubleOrNull()

        if (view.id == R.id.button_calcular) {
            if (kg != null && valor != null) {
                val dezPorceto = dezPorcento(kg, valor)
                val cincoPorcento = cincoPorcento(kg, valor)
                val sessentaPorcento = sessentaPorcento(kg, valor)

                binding.textMestre.text = "R$ $dezPorceto"
                binding.textMergulhador.text = "R$ $dezPorceto"
                binding.textManguereiro.text = "R$ $cincoPorcento"
                binding.textBarco.text = "R$ $sessentaPorcento"
                binding.textTotal.text = "Total: R$ ${(kg * valor).toString()}"

            } else if (kg == null) binding.editQuilosLagosta.error = "Insira os quilos"
        } else if (valor == null) binding.editValor.error = "Insira o valor"
    }
}

fun dezPorcento(kg: Double, valor: Double): Double = (kg * valor) * 0.10
fun cincoPorcento(kg: Double, valor: Double): Double = (kg * valor) * 0.05
fun sessentaPorcento(kg: Double, valor: Double): Double = (kg * valor) * 0.6
