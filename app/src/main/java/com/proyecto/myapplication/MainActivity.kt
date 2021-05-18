package com.proyecto.myapplication

import android.R.attr.button
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1) ; val btn2 = findViewById<Button>(R.id.btn2) ; val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4) ; val btn5 = findViewById<Button>(R.id.btn5) ; val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7) ; val btn8 = findViewById<Button>(R.id.btn8) ; val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10) ; val btn11 = findViewById<Button>(R.id.btn11) ; val btn12 = findViewById<Button>(R.id.btn12)
        val btn13 = findViewById<Button>(R.id.btn13) ; val btn14 = findViewById<Button>(R.id.btn14) ; val btn15 = findViewById<Button>(R.id.btn15)
        val btn16 = findViewById<Button>(R.id.btn16) ; val btn17 = findViewById<Button>(R.id.btn17) ; val btn18 = findViewById<Button>(R.id.btn18)
        val btn19 = findViewById<Button>(R.id.btn19) ; val btn20 = findViewById<Button>(R.id.btn20) ; val btn21 = findViewById<Button>(R.id.btn21)
        val btn22 = findViewById<Button>(R.id.btn22) ; val btn23 = findViewById<Button>(R.id.btn23) ; val btn24 = findViewById<Button>(R.id.btn24)
        val btn25 = findViewById<Button>(R.id.btn25) ; val btn26 = findViewById<Button>(R.id.btn26) ; val btn27 = findViewById<Button>(R.id.btn27)
        val btn28 = findViewById<Button>(R.id.btn28) ; val btn29 = findViewById<Button>(R.id.btn29) ; val btn30 = findViewById<Button>(R.id.btn30)
        val btn31 = findViewById<Button>(R.id.btn31) ; val btn32 = findViewById<Button>(R.id.btn32) ; val btn33 = findViewById<Button>(R.id.btn33)
        val btn34 = findViewById<Button>(R.id.btn34) ; val btn35 = findViewById<Button>(R.id.btn35) ; val btn36 = findViewById<Button>(R.id.btn36)
        val btn37 = findViewById<Button>(R.id.btn37) ; val btn38 = findViewById<Button>(R.id.btn38) ; val btn39 = findViewById<Button>(R.id.btn39)
        val btn40 = findViewById<Button>(R.id.btn40) ; val btn41 = findViewById<Button>(R.id.btn41) ; val btn42 = findViewById<Button>(R.id.btn42)
        val btn43 = findViewById<Button>(R.id.btn43) ; val btn44 = findViewById<Button>(R.id.btn44) ; val btn45 = findViewById<Button>(R.id.btn45)
        val btn46 = findViewById<Button>(R.id.btn46) ; val btn47 = findViewById<Button>(R.id.btn47) ; val btn48 = findViewById<Button>(R.id.btn48)
        val btn49 = findViewById<Button>(R.id.btn49) ; val btn50 = findViewById<Button>(R.id.btn50)

        val btn_generar = findViewById<Button>(R.id.btn_rand)
        var tval:TextView = findViewById(R.id.tv_aleat)
            btn_generar.setOnClickListener {
                val num = (1..50).random()
                tval.setText(num.toString())

                if(btn1.getText().toString() == tval.getText().toString()){
                    aleat(btn1,tval) }

                if (btn2.getText().toString() == tval.getText().toString()){
                aleat(btn2,tval)}

                if (btn3.getText().toString() == tval.getText().toString()){
                    aleat(btn3,tval)}

                if (btn4.getText().toString() == tval.getText().toString()){
                    aleat(btn4,tval)}

                if (btn5.getText().toString() == tval.getText().toString()){
                    aleat(btn5,tval)}

                if (btn6.getText().toString() == tval.getText().toString()){
                    aleat(btn6,tval)}

                if (btn7.getText().toString() == tval.getText().toString()){
                    aleat(btn7,tval)}

                if (btn8.getText().toString() == tval.getText().toString()){
                    aleat(btn8,tval)}

                if (btn9.getText().toString() == tval.getText().toString()){
                    aleat(btn9,tval)}

                if (btn10.getText().toString() == tval.getText().toString()){
                    aleat(btn10,tval)}

                if (btn11.getText().toString() == tval.getText().toString()){
                    aleat(btn11,tval)}

                if (btn12.getText().toString() == tval.getText().toString()){
                    aleat(btn12,tval)}

                if (btn13.getText().toString() == tval.getText().toString()){
                    aleat(btn13,tval)}

                if (btn14.getText().toString() == tval.getText().toString()){
                    aleat(btn14,tval)}

                if (btn15.getText().toString() == tval.getText().toString()){
                    aleat(btn15,tval)}

                if (btn16.getText().toString() == tval.getText().toString()){
                    aleat(btn16,tval)}

                if (btn17.getText().toString() == tval.getText().toString()){
                    aleat(btn17,tval)}

                if (btn18.getText().toString() == tval.getText().toString()){
                    aleat(btn18,tval)}

                if (btn19.getText().toString() == tval.getText().toString()){
                    aleat(btn19,tval)}

                if (btn20.getText().toString() == tval.getText().toString()){
                    aleat(btn20,tval)}

                if (btn21.getText().toString() == tval.getText().toString()){
                    aleat(btn21,tval)}

                if (btn22.getText().toString() == tval.getText().toString()){
                    aleat(btn22,tval)}

                if (btn23.getText().toString() == tval.getText().toString()){
                    aleat(btn23,tval)}

                if (btn24.getText().toString() == tval.getText().toString()){
                    aleat(btn24,tval)}

                if (btn25.getText().toString() == tval.getText().toString()){
                    aleat(btn25,tval)}

                if (btn26.getText().toString() == tval.getText().toString()){
                    aleat(btn26,tval)}

                if (btn27.getText().toString() == tval.getText().toString()){
                    aleat(btn27,tval)}

                if (btn28.getText().toString() == tval.getText().toString()){
                    aleat(btn28,tval)}

                if (btn29.getText().toString() == tval.getText().toString()){
                    aleat(btn29,tval)}

                if (btn30.getText().toString() == tval.getText().toString()){
                    aleat(btn30,tval)}

                if (btn31.getText().toString() == tval.getText().toString()){
                    aleat(btn31,tval)}

                if (btn32.getText().toString() == tval.getText().toString()){
                    aleat(btn32,tval)}

                if (btn33.getText().toString() == tval.getText().toString()){
                    aleat(btn33,tval)}

                if (btn34.getText().toString() == tval.getText().toString()){
                    aleat(btn34,tval)}

                if (btn35.getText().toString() == tval.getText().toString()){
                    aleat(btn35,tval)}

                if (btn36.getText().toString() == tval.getText().toString()){
                    aleat(btn36,tval)}

                if (btn37.getText().toString() == tval.getText().toString()){
                    aleat(btn37,tval)}

                if (btn38.getText().toString() == tval.getText().toString()){
                    aleat(btn38,tval)}

                if (btn39.getText().toString() == tval.getText().toString()){
                    aleat(btn39,tval)}

                if (btn40.getText().toString() == tval.getText().toString()){
                    aleat(btn40,tval)}

                if (btn41.getText().toString() == tval.getText().toString()){
                    aleat(btn41,tval)}

                if (btn42.getText().toString() == tval.getText().toString()){
                    aleat(btn42,tval)}

                if (btn43.getText().toString() == tval.getText().toString()){
                    aleat(btn43,tval)}

                if (btn44.getText().toString() == tval.getText().toString()){
                    aleat(btn44,tval)}

                if (btn45.getText().toString() == tval.getText().toString()){
                    aleat(btn45,tval)}

                if (btn46.getText().toString() == tval.getText().toString()){
                    aleat(btn46,tval)}

                if (btn47.getText().toString() == tval.getText().toString()){
                    aleat(btn47,tval)}

                if (btn48.getText().toString() == tval.getText().toString()){
                    aleat(btn48,tval)}

                if (btn49.getText().toString() == tval.getText().toString()){
                    aleat(btn49,tval)}

                if (btn50.getText().toString() == tval.getText().toString()){
                    aleat(btn50,tval)}

            }


        btn1.setOnClickListener {
            marca(btn1)
        }

       btn2.setOnClickListener {
           marca(btn2)
       }

        btn3.setOnClickListener {
            marca(btn3)
        }

        btn4.setOnClickListener {
            marca(btn4)
        }

        btn5.setOnClickListener {
            marca(btn5)
        }

        btn6.setOnClickListener {
            marca(btn6)
        }

        btn7.setOnClickListener {

            marca(btn7)
        }

        btn8.setOnClickListener {

            marca(btn8)
        }

        btn9.setOnClickListener {

            marca(btn9)
        }

        btn10.setOnClickListener {

            marca(btn10)
        }

        btn11.setOnClickListener {

            marca(btn11)
        }

        btn12.setOnClickListener {

            marca(btn12)
        }

        btn13.setOnClickListener {

            marca(btn13)
        }

        btn14.setOnClickListener {

            marca(btn14)
        }

        btn15.setOnClickListener {

            marca(btn15)
        }

        btn16.setOnClickListener {

            marca(btn16)
        }

        btn17.setOnClickListener {

            marca(btn17)
        }

        btn18.setOnClickListener {

            marca(btn18)
        }

        btn19.setOnClickListener {

            marca(btn19)
        }

        btn20.setOnClickListener {

            marca(btn20)
        }

        btn21.setOnClickListener {

            marca(btn21)
        }

        btn22.setOnClickListener {

            marca(btn22)
        }

        btn23.setOnClickListener {

            marca(btn23)
        }

        btn24.setOnClickListener {

            marca(btn24)
        }

        btn25.setOnClickListener {

            marca(btn25)
        }

        btn26.setOnClickListener {

            marca(btn26)
        }

        btn27.setOnClickListener {

            marca(btn27)
        }

        btn28.setOnClickListener {

            marca(btn28)
        }

        btn29.setOnClickListener {

            marca(btn29)
        }

        btn30.setOnClickListener {

            marca(btn30)
        }

        btn31.setOnClickListener {

            marca(btn31)
        }

        btn32.setOnClickListener {

            marca(btn32)
        }

        btn33.setOnClickListener {

            marca(btn33)
        }

        btn34.setOnClickListener {

            marca(btn34)
        }

        btn35.setOnClickListener {

            marca(btn35)
        }

        btn36.setOnClickListener {

            marca(btn36)
        }

        btn37.setOnClickListener {

            marca(btn37)
        }

        btn38.setOnClickListener {

            marca(btn38)
        }

        btn39.setOnClickListener {

            marca(btn39)
        }

        btn40.setOnClickListener {

            marca(btn40)
        }

        btn41.setOnClickListener {

            marca(btn41)
        }

        btn42.setOnClickListener {

            marca(btn42)
        }

        btn43.setOnClickListener {

            marca(btn43)
        }

        btn44.setOnClickListener {

            marca(btn44)
        }

        btn45.setOnClickListener {

            marca(btn45)
        }

        btn46.setOnClickListener {

            marca(btn46)
        }

        btn47.setOnClickListener {

            marca(btn47)
        }

        btn48.setOnClickListener {

            marca(btn48)
        }

        btn49.setOnClickListener {

            marca(btn49)
        }

        btn50.setOnClickListener {

            marca(btn50)
        }


    }

    private fun marca(btn:Button){

        if (btn.isEnabled()){
            btn.setBackgroundColor(1)
            Toast.makeText(this, "El botón " + btn.text.toString() + " se inhabilitó" , Toast.LENGTH_SHORT).show()
            btn.isEnabled =false
        }else{
            Toast.makeText(this, "El botón " + btn.text.toString() + " está inhabilitado" , Toast.LENGTH_SHORT).show()
        }

        }

    private fun aleat(btn_id:Button,tval:TextView){
        val btn_Marcar = findViewById<Button>(R.id.btn_marcar_al)
            btn_Marcar.setOnClickListener {
                if (btn_id.getText().toString() == tval.getText().toString()){
                    if (btn_id.isEnabled()){
                        btn_id.setBackgroundColor(1)
                        Toast.makeText(this, "El botón " + btn_id.text.toString() + " se inhabilitó" , Toast.LENGTH_SHORT).show()
                        btn_id.isEnabled =false
                    }else{
                        Toast.makeText(this, "El botón " + btn_id.text.toString() + " está inhabilitado" , Toast.LENGTH_SHORT).show()
                    }

                }

            }

    }


    }


