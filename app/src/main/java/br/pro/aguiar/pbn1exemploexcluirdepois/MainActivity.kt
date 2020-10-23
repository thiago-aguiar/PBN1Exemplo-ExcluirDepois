package br.pro.aguiar.pbn1exemploexcluirdepois

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    var variavel: String = "Este arquivo foi modificado novamente."
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
