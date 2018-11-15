package br.com.heiderlopes.consumoapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.heiderlopes.consumoapi.model.Pokemon
import br.com.heiderlopes.consumoapi.model.Sprites
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        rvPokemons.adapter = ListaAdapter(listOf(
                Pokemon("Charmander", Sprites("")),
                Pokemon("Squirtle", Sprites("")),
                Pokemon("Bulbassaur", Sprites(""))
        ),this, {})
        rvPokemons.layoutManager = LinearLayoutManager(this)

    }
}
