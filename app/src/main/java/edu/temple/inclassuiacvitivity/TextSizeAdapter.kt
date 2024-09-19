package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class TextSizeAdapter (private val _context: Context, private val _numbers: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val numbers = _numbers


    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return numbers[position].toLong()
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

        return textView
    }


}