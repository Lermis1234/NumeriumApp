package com.example.numeriumapp

import android.content.Context
import android.media.MediaPlayer

class SoundManager(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null

    fun playSound(resourceId: Int) {

        mediaPlayer?.release()


        mediaPlayer = MediaPlayer.create(context, resourceId)


        mediaPlayer?.start()

        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }

    fun stopSound() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}