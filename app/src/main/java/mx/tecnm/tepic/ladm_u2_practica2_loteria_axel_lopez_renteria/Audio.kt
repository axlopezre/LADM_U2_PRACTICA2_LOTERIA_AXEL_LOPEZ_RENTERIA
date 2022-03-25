package mx.tecnm.tepic.ladm_u2_practica2_loteria_axel_lopez_renteria

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AlertDialog

fun Audio(arregloimagenes : Array<Int>, conta : Int,contexto: Context, activity: MainActivity){
    var contador = conta
    val ArregloGlobal = arregloimagenes
    var contexto = contexto
    var activity = activity
        var mediaPlayer1: MediaPlayer = MediaPlayer.create(contexto, R.raw.elgallo)
        var mediaPlayer2: MediaPlayer = MediaPlayer.create(contexto, R.raw.eldiablito)
        var mediaPlayer3: MediaPlayer = MediaPlayer.create(contexto, R.raw.ladama)
        var mediaPlayer4: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcatrin)
        var mediaPlayer5: MediaPlayer = MediaPlayer.create(contexto, R.raw.elparaguas)
        var mediaPlayer6: MediaPlayer = MediaPlayer.create(contexto, R.raw.lasirena)
        var mediaPlayer7: MediaPlayer = MediaPlayer.create(contexto, R.raw.laescalera)
        var mediaPlayer8: MediaPlayer = MediaPlayer.create(contexto, R.raw.labotella)
        var mediaPlayer9: MediaPlayer = MediaPlayer.create(contexto, R.raw.elbarril)
        var mediaPlayer10: MediaPlayer = MediaPlayer.create(contexto, R.raw.elarbol)
        var mediaPlayer11: MediaPlayer = MediaPlayer.create(contexto, R.raw.elmelon)
        var mediaPlayer12: MediaPlayer = MediaPlayer.create(contexto, R.raw.elvaliente)
        var mediaPlayer13: MediaPlayer = MediaPlayer.create(contexto, R.raw.elgorrito)
        var mediaPlayer14: MediaPlayer = MediaPlayer.create(contexto, R.raw.lamuerte)
        var mediaPlayer15: MediaPlayer = MediaPlayer.create(contexto, R.raw.lapera)
        var mediaPlayer16: MediaPlayer = MediaPlayer.create(contexto, R.raw.labandera)
        var mediaPlayer17: MediaPlayer = MediaPlayer.create(contexto, R.raw.elbandolon)
        var mediaPlayer18: MediaPlayer = MediaPlayer.create(contexto, R.raw.elvioloncello)
        var mediaPlayer19: MediaPlayer = MediaPlayer.create(contexto, R.raw.lagarza)
        var mediaPlayer20: MediaPlayer = MediaPlayer.create(contexto, R.raw.elpajaro)
        var mediaPlayer21: MediaPlayer = MediaPlayer.create(contexto, R.raw.lamano)
        var mediaPlayer22: MediaPlayer = MediaPlayer.create(contexto, R.raw.labota)
        var mediaPlayer23: MediaPlayer = MediaPlayer.create(contexto, R.raw.laluna)
        var mediaPlayer24: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcotorro)
        var mediaPlayer25: MediaPlayer = MediaPlayer.create(contexto, R.raw.elborracho)
        var mediaPlayer26: MediaPlayer = MediaPlayer.create(contexto, R.raw.elnegrito)
        var mediaPlayer27: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcorazon)
        var mediaPlayer28: MediaPlayer = MediaPlayer.create(contexto, R.raw.lasandia)
        var mediaPlayer29: MediaPlayer = MediaPlayer.create(contexto, R.raw.eltambor)
        var mediaPlayer30: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcamaron)
        var mediaPlayer31: MediaPlayer = MediaPlayer.create(contexto, R.raw.lasjaras)
        var mediaPlayer32: MediaPlayer = MediaPlayer.create(contexto, R.raw.elmusico)
        var mediaPlayer33: MediaPlayer = MediaPlayer.create(contexto, R.raw.laaranna)
        var mediaPlayer34: MediaPlayer = MediaPlayer.create(contexto, R.raw.elsoldado)
        var mediaPlayer35: MediaPlayer = MediaPlayer.create(contexto, R.raw.laestrella)
        var mediaPlayer36: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcaso)
        var mediaPlayer37: MediaPlayer = MediaPlayer.create(contexto, R.raw.elmundo)
        var mediaPlayer38: MediaPlayer = MediaPlayer.create(contexto, R.raw.elapache)
        var mediaPlayer39: MediaPlayer = MediaPlayer.create(contexto, R.raw.elnopal)
        var mediaPlayer40: MediaPlayer = MediaPlayer.create(contexto, R.raw.elalacran)
        var mediaPlayer41: MediaPlayer = MediaPlayer.create(contexto, R.raw.larosa)
        var mediaPlayer42: MediaPlayer = MediaPlayer.create(contexto, R.raw.lacalabera)
        var mediaPlayer43: MediaPlayer = MediaPlayer.create(contexto, R.raw.lacampana)
        var mediaPlayer44: MediaPlayer = MediaPlayer.create(contexto, R.raw.elcantarito)
        var mediaPlayer45: MediaPlayer = MediaPlayer.create(contexto, R.raw.elvenado)
        var mediaPlayer46: MediaPlayer = MediaPlayer.create(contexto, R.raw.elsol)
        var mediaPlayer47: MediaPlayer = MediaPlayer.create(contexto, R.raw.lacorona)
        var mediaPlayer48: MediaPlayer = MediaPlayer.create(contexto, R.raw.lachalupa)
        var mediaPlayer49: MediaPlayer = MediaPlayer.create(contexto, R.raw.elpino)
        var mediaPlayer50: MediaPlayer = MediaPlayer.create(contexto, R.raw.elpescado)
        var mediaPlayer51: MediaPlayer = MediaPlayer.create(contexto, R.raw.lapalma)
        var mediaPlayer52: MediaPlayer = MediaPlayer.create(contexto, R.raw.lamaceta)
        var mediaPlayer53: MediaPlayer = MediaPlayer.create(contexto, R.raw.elarpa)
        var mediaPlayer54: MediaPlayer = MediaPlayer.create(contexto, R.raw.larana)
        when(ArregloGlobal[contador]){
            2131165280 -> { mediaPlayer1?.start()}
            2131165291 -> { mediaPlayer2?.start()}
            2131165302 -> { mediaPlayer3?.start() }
            2131165313 -> { mediaPlayer4?.start() }
            2131165324 -> { mediaPlayer5?.start() }
            2131165330 -> { mediaPlayer6?.start() }
            2131165331 -> { mediaPlayer7?.start() }
            2131165332 -> { mediaPlayer8?.start() }
            2131165333 -> { mediaPlayer9?.start() }
            2131165281 -> { mediaPlayer10?.start() }
            2131165282 -> { mediaPlayer11?.start() }
            2131165283 -> { mediaPlayer12?.start() }
            2131165284 -> { mediaPlayer13?.start() }
            2131165285 -> { mediaPlayer14?.start() }
            2131165286 -> { mediaPlayer15?.start() }
            2131165287 -> { mediaPlayer16?.start() }
            2131165288 -> { mediaPlayer17?.start() }
            2131165289 -> { mediaPlayer18?.start() }
            2131165290 -> { mediaPlayer19?.start() }
            2131165292 -> { mediaPlayer20?.start() }
            2131165293 -> { mediaPlayer21?.start() }
            2131165294 -> { mediaPlayer22?.start() }
            2131165295 -> { mediaPlayer23?.start() }
            2131165296 -> { mediaPlayer24?.start() }
            2131165297 -> { mediaPlayer25?.start() }
            2131165298 -> { mediaPlayer26?.start() }
            2131165299 -> { mediaPlayer27?.start() }
            2131165300 -> { mediaPlayer28?.start() }
            2131165301 -> { mediaPlayer29?.start() }
            2131165303 -> { mediaPlayer30?.start() }
            2131165304 -> { mediaPlayer31?.start() }
            2131165305 -> { mediaPlayer32?.start() }
            2131165306 -> { mediaPlayer33?.start() }
            2131165307 -> { mediaPlayer34?.start() }
            2131165308 -> { mediaPlayer35?.start() }
            2131165309 -> { mediaPlayer36?.start() }
            2131165310 -> { mediaPlayer37?.start() }
            2131165311 -> { mediaPlayer38?.start() }
            2131165312 -> { mediaPlayer39?.start() }
            2131165314 -> { mediaPlayer40?.start() }
            2131165315 -> { mediaPlayer41?.start() }
            2131165316 -> { mediaPlayer42?.start() }
            2131165317 -> { mediaPlayer43?.start()}
            2131165318 -> { mediaPlayer44?.start() }
            2131165319 -> { mediaPlayer45?.start() }
            2131165320 -> { mediaPlayer46?.start() }
            2131165321 -> { mediaPlayer47?.start() }
            2131165322 -> { mediaPlayer48?.start() }
            2131165323 -> { mediaPlayer49?.start() }
            2131165325 -> { mediaPlayer50?.start() }
            2131165326 -> { mediaPlayer51?.start() }
            2131165327 -> { mediaPlayer52?.start() }
            2131165328 -> { mediaPlayer53?.start() }
            2131165329 -> { mediaPlayer54?.start() }
            else -> { }
        }
}