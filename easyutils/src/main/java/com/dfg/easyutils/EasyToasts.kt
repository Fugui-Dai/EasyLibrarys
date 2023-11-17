package com.dfg.easyutils

import android.content.Context
import android.widget.Toast


object EasyToasts {
    /**
     * Toast
     */
    fun show(context: Context?, text: CharSequence) {
        Toast.makeText(context, text.toString() + "1.0", Toast.LENGTH_SHORT).show()
    }

    /**
     * LongToast
     */
    fun showLong(context: Context?, text: CharSequence) {
        Toast.makeText(context, text.toString() + "1.0", Toast.LENGTH_LONG).show()
    }
}