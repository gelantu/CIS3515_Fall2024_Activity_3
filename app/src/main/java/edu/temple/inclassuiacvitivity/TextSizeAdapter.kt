package edu.temple.inclassuiacvitivity

import android.content.Context
import android.provider.CalendarContract.Colors
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.graphics.Color



class TextSizeAdapter (_context: Context, _colors: Array<String>) : BaseAdapter() {

    private val context = _context
    private val colors = _colors
    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView
        if( convertView != null){
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5,10,0,10)
        }
        textView.text = colors[position]
        textView.setBackgroundColor(Color.parseColor(colors[position]))

        return textView
    }


}