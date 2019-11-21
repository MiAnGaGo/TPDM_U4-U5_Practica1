package mx.edu.ittepic.tpdm_u4_u5_practica1

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener

class OyenteAcelerometro (p : MainActivity) : SensorEventListener {
    var puntero = p
    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

    override fun onSensorChanged(p0: SensorEvent?) {
        puntero.x = p0!!.values[0]
    }

}