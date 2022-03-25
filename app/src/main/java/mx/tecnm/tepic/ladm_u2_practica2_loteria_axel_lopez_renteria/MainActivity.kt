package mx.tecnm.tepic.ladm_u2_practica2_loteria_axel_lopez_renteria
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.*
import mx.tecnm.tepic.ladm_u2_practica2_loteria_axel_lopez_renteria.databinding.ActivityMainBinding
import java.lang.Thread.sleep
import kotlin.coroutines.EmptyCoroutineContext
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var arregloImagenes = arrayOf(R.drawable.carta1,R.drawable.carta2
        ,R.drawable.carta3,R.drawable.carta4
        ,R.drawable.carta5,R.drawable.carta6
        ,R.drawable.carta7,R.drawable.carta8
        ,R.drawable.carta9,R.drawable.carta10
        ,R.drawable.carta11,R.drawable.carta12
        ,R.drawable.carta13,R.drawable.carta14
        ,R.drawable.carta15,R.drawable.carta16
        ,R.drawable.carta17,R.drawable.carta18
        ,R.drawable.carta19,R.drawable.carta20
        ,R.drawable.carta21,R.drawable.carta22
        ,R.drawable.carta23,R.drawable.carta24
        ,R.drawable.carta25,R.drawable.carta26
        ,R.drawable.carta27,R.drawable.carta28
        ,R.drawable.carta29,R.drawable.carta30
        ,R.drawable.carta31,R.drawable.carta32
        ,R.drawable.carta33,R.drawable.carta34
        ,R.drawable.carta35,R.drawable.carta36
        ,R.drawable.carta37,R.drawable.carta38
        ,R.drawable.carta39,R.drawable.carta40
        ,R.drawable.carta41,R.drawable.carta42
        ,R.drawable.carta43,R.drawable.carta44
        ,R.drawable.carta45,R.drawable.carta46
        ,R.drawable.carta47,R.drawable.carta48
        ,R.drawable.carta49,R.drawable.carta50
        ,R.drawable.carta51,R.drawable.carta52
        ,R.drawable.carta53,R.drawable.carta54)
    var ImagenInicial = arrayOf(R.drawable.imagenfondo)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnVerificar.visibility= View.GONE
        binding.btnReiniciar.visibility= View.GONE
        binding.btnSuspender.visibility= View.GONE
        (0..arregloImagenes.size-1).forEach{
            println(arregloImagenes[it])
        }
        var contador = 0
        barajear()
        val scoope = CoroutineScope(Job() + Dispatchers.Main)
        var objetoCoroutineControlada = scoope.launch(EmptyCoroutineContext, CoroutineStart.LAZY){
            //Ejecución en segundo plano
            while (true){
                runOnUiThread {
                    if(contador == arregloImagenes.size-1) {
                        binding.imagen.setImageResource(arregloImagenes[53])
                        sleep(1000L)
                        contador = 0
                        AlertDialog.Builder(this@MainActivity)
                            .setMessage("SE HA TERMINADO")
                            .setNeutralButton("ACEPTAR", {d,i->d.dismiss()})
                            .show()
                        this.cancel()
                        binding.imagen.setImageResource(ImagenInicial[0])
                        binding.btnSuspender.visibility= View.GONE
                        binding.btnReiniciar.visibility= View.VISIBLE
                    }else{
                        Audio(arregloImagenes, contador,this@MainActivity, MainActivity())
                        binding.imagen.setImageResource(arregloImagenes[contador++])
                    }
                }
                delay(1000L)
            }
        }
        binding.imagen.setImageResource(ImagenInicial[0])
        binding.btnIniciar.setOnClickListener {
            objetoCoroutineControlada.start()
            binding.btnIniciar.visibility= View.GONE
            binding.btnSuspender.visibility= View.VISIBLE
        }
        binding.btnSuspender.setOnClickListener {
            binding.btnVerificar.visibility= View.VISIBLE
            binding.btnReiniciar.visibility= View.VISIBLE
            binding.btnSuspender.visibility= View.GONE
            if(objetoCoroutineControlada.isActive){
                objetoCoroutineControlada.cancel()
                println(contador)
                println(arregloImagenes.size)
                return@setOnClickListener
            }
        }
        binding.btnVerificar.setOnClickListener {
            if(objetoCoroutineControlada.isCancelled){
                Hilo(arregloImagenes, contador, this@MainActivity, this).start()
            }
        }
        binding.btnReiniciar.setOnClickListener {
            binding.btnSuspender.visibility= View.VISIBLE
            binding.btnVerificar.visibility= View.GONE
            binding.btnReiniciar.visibility= View.GONE
            contador = 0
            barajear()
            objetoCoroutineControlada = scoope.launch(EmptyCoroutineContext, CoroutineStart.LAZY){
                //Ejecución en segundo plano
                while (true){
                    runOnUiThread {
                        if(contador == arregloImagenes.size-1) {
                            binding.imagen.setImageResource(arregloImagenes[53])
                            sleep(1000L)
                            contador = 0
                            AlertDialog.Builder(this@MainActivity)
                                .setMessage("SE HA TERMINADO")
                                .setNeutralButton("ACEPTAR", {d,i->d.dismiss()})
                                .show()
                            this.cancel()
                            binding.imagen.setImageResource(ImagenInicial[0])
                            binding.btnSuspender.visibility= View.GONE
                            binding.btnReiniciar.visibility= View.VISIBLE
                        }else{
                            Audio(arregloImagenes, contador,this@MainActivity, MainActivity())
                            binding.imagen.setImageResource(arregloImagenes[contador++])
                        }
                    }
                    delay(1000L)
                }
            }
            objetoCoroutineControlada.start()
        }
    }
    fun barajear(){
        var i = arregloImagenes.size -1
        while (i >= 0) {
            var j = Math.floor(Math.random() * (i + 1)).toInt();
            var x = arregloImagenes[i];
            arregloImagenes[i] = arregloImagenes[j];
            arregloImagenes[j] = x;
            i--
        }
    }
}