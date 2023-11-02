package com.ieseljust.pmdm.whatsdam.viewmodel

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ieseljust.pmdm.whatsdam.Message
import com.ieseljust.pmdm.whatsdam.R
import java.text.SimpleDateFormat
import java.util.Date


class MissatgeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    // Necessitem la vista per a l'hora i el text del missatge
    val data = itemView.findViewById(R.id.msg_me_timestamp) as TextView
    val text = itemView.findViewById(R.id.msg_text) as TextView

    // Enllacem les dades del missatge amb la vista
    fun bind(missatge: Message) {
        text.setText(missatge.text)
        // Per a la data, posem l'hora actual
        // Per a aixo utilitzem SimpleDataFormat i Date
        val dateFormat = SimpleDateFormat("HH:mm")
        val horaActual = Date()
        data.setText(dateFormat.format(horaActual))
        itemView.setOnLongClickListener {
            Log.d("Debug", "Mensaje")
            gestorClick(missatge, it)
        }

    }



}

