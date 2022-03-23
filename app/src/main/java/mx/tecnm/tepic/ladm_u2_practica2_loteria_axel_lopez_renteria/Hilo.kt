package mx.tecnm.tepic.ladm_u2_practica2_loteria_axel_lopez_renteria

import android.content.Context
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat.requireContext

class Hilo(arregloimagenes : Array<Int>, conta : Int,contexto:Context, activity: MainActivity): Thread(){//clase B
val ArregloGlobal = arregloimagenes
    var cadena=""
    var tamaño = ArregloGlobal.size
    var contador = conta
    var contexto = contexto
    var activity = activity
    override fun run() {
        super.run()
        //Se ejecuta en 2do plano, y es INVACADO a través del start()
        // el run se ejecuta 1 sola vez y después muere
        //ESTE METODO SE EJECUTA UNA SOLA VEZ, NO ES CICLO COMO OnTick
        while(contador<tamaño) {
            when(ArregloGlobal[contador]){
                2131165280 -> { cadena+= "El gallo\n" }
                2131165291 -> { cadena+= "El diablito\n" }
                2131165302 -> { cadena+= "La dama\n" }
                2131165313 -> { cadena+= "El catrin\n" }
                2131165324 -> { cadena+= "El paraguas\n" }
                2131165330 -> { cadena+= "La sirena\n" }
                2131165331 -> { cadena+= "La escalera\n" }
                2131165332 -> { cadena+= "La botella\n" }
                2131165333 -> { cadena+= "El barril\n" }
                2131165281 -> { cadena+= "El arbol\n" }
                2131165282 -> { cadena+= "El melon\n" }
                2131165283 -> { cadena+= "El valiente\n" }
                2131165284 -> { cadena+= "El gorrito\n" }
                2131165285 -> { cadena+= "La muerte\n" }
                2131165286 -> { cadena+= "La pera\n" }
                2131165287 -> { cadena+= "La bandera\n" }
                2131165288 -> { cadena+= "El bandolon\n" }
                2131165289 -> { cadena+= "El violoncello\n" }
                2131165290 -> { cadena+= "La garza\n" }
                2131165292 -> { cadena+= "El pajaro\n" }
                2131165293 -> { cadena+= "La mano\n" }
                2131165294 -> { cadena+= "La bota\n" }
                2131165295 -> { cadena+= "La luna\n" }
                2131165296 -> { cadena+= "El cotorro\n" }
                2131165297 -> { cadena+= "El borracho\n" }
                2131165298 -> { cadena+= "El negrito\n" }
                2131165299 -> { cadena+= "El corazon\n" }
                2131165300 -> { cadena+= "La sandía\n" }
                2131165301 -> { cadena+= "El tambor\n" }
                2131165303 -> { cadena+= "El camaron\n" }
                2131165304 -> { cadena+= "Las jaras\n" }
                2131165305 -> { cadena+= "El musico\n" }
                2131165306 -> { cadena+= "La araña\n" }
                2131165307 -> { cadena+= "El soldado\n" }
                2131165308 -> { cadena+= "La estrella\n" }
                2131165309 -> { cadena+= "El cazo\n" }
                2131165310 -> { cadena+= "El mundo\n" }
                2131165311 -> { cadena+= "El apache\n" }
                2131165312 -> { cadena+= "El nopal\n" }
                2131165314 -> { cadena+= "El alacran\n" }
                2131165315 -> { cadena+= "La rosa\n" }
                2131165316 -> { cadena+= "La calabera\n" }
                2131165317 -> { cadena+= "La campana\n" }
                2131165318 -> { cadena+= "El cantarito\n" }
                2131165319 -> { cadena+= "El venado\n" }
                2131165320 -> { cadena+= "El sol\n" }
                2131165321 -> { cadena+= "La corona\n" }
                2131165322 -> { cadena+= "La chalupa\n" }
                2131165323 -> { cadena+= "El pino\n" }
                2131165325 -> { cadena+= "El pescado\n" }
                2131165326 -> { cadena+= "La palma\n" }
                2131165327 -> { cadena+= "La maceta\n" }
                2131165328 -> { cadena+= "El arpa\n" }
                2131165329 -> { cadena+= "La rana\n" }
                else -> { cadena+="${ArregloGlobal[contador]} \n"}
            }
            contador++
            sleep(1)
        }
        print(cadena)
        var cad = cadena
        activity.runOnUiThread {
            AlertDialog.Builder(contexto)
                .setTitle("CARTAS FALTANTES")
                .setMessage(cad)
                .setNeutralButton("ACEPTAR", {d,i->d.dismiss()})
                .show()
        }
        cadena=" "
    }
}//Todoo este código es un Hilo y En memoria es como tener una segunda aplicación separado