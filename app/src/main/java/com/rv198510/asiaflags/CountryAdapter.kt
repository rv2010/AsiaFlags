package com.rv198510.asiaflags

import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.rv198510.asiaflags.databinding.ActivityMainBinding
import java.util.*
import java.util.concurrent.TimeUnit


class CountryAdapter(val context: Context, var destinationList: ArrayList<CountryData>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){
    private lateinit var binding: ActivityMainBinding
    private var tts: TextToSpeech? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        return  CountryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  destinationList.size
    }

    override fun onBindViewHolder(itemViewHolder: CountryViewHolder, position: Int) {
        val destination = destinationList[position]
        itemViewHolder.setData(destination,position)
        itemViewHolder.setListeners()
    }

    inner class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener , TextToSpeech.OnInitListener {
        var currentPosition: Int = -1
        var destination: CountryData? = null


        fun setData(destination: CountryData,position: Int) {

            val nameTextView =  itemView.findViewById<TextView>(R.id.txvPlaceName)
            val imageId = itemView.findViewById<ImageView>(R.id.imvPlace)

            nameTextView.text = destination.countryName
            imageId.setImageResource(destination.imageId)

            this.currentPosition = position
            this.destination = destination
            tts = TextToSpeech(context, this)
        }
        fun setListeners() {
            itemView.findViewById<ImageView>(R.id.imvPlace).setOnClickListener(this@CountryViewHolder)
        }

        override fun onClick(p0: View?) {
            when (p0!!.id){

                R.id.imvPlace -> playItem()
            }
        }
        fun  playItem(){

            val nameTextViewN =  itemView.findViewById<TextView>(R.id.txvPlaceName).text.toString()

            Toast.makeText(context,nameTextViewN, Toast.LENGTH_SHORT).show()

            speakOut(nameTextViewN)
        }

        override fun onInit(status: Int) {
            if (status == TextToSpeech.SUCCESS) {
                val result = tts!!.setLanguage(Locale.US)

                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTS","The Language not supported!")
                }
            }
        }


        private fun speakOut(speakName: String) {

            tts!!.speak(speakName, TextToSpeech.QUEUE_FLUSH, null,"")

            if (tts!!.isSpeaking() == false) {
                TimeUnit.SECONDS.sleep(1)
            }
        }


    }
}