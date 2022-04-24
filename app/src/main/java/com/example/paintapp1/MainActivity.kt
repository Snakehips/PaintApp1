package com.example.paintapp1

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp1.PaintView.Companion.colorList
import com.example.paintapp1.PaintView.Companion.currentBrush
import com.example.paintapp1.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText( this, "Clicked Red", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener {
            Toast.makeText( this, "Clicked Blue", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener {
            Toast.makeText( this, "Clicked Black", Toast.LENGTH_SHORT).show()
            paintBrush.color= Color.BLACK
            currentColor(paintBrush.color)
            path.reset()
        }

        eraser.setOnClickListener {
            Toast.makeText( this, "Clicked Eraser", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}