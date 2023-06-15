package com.serkan.dokundokunabilirsen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.serkan.dokundokunabilirsen.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var score = 0
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        binding.textView.setText("skorunuz: 0")




        binding.b1.visibility= View.INVISIBLE
        binding.b2.visibility=View.INVISIBLE
        binding.b3.visibility=View.INVISIBLE
        binding.b4.visibility=View.INVISIBLE
        binding.b5.visibility=View.INVISIBLE
        binding.b6.visibility=View.INVISIBLE
        binding.b7.visibility=View.INVISIBLE
        binding.b8.visibility=View.INVISIBLE
        binding.b9.visibility=View.INVISIBLE

        object :CountDownTimer(1000000,2000){
            override fun onFinish() {

            }

            override fun onTick(millisUntilFinished: Long) {
                var ran=(1..9).random()

                if (ran==1)
                {
                    binding.b1.visibility=View.VISIBLE
                }
                else if (ran==2)
                {
                    binding.b2.visibility=View.VISIBLE
                }
                else if(ran==3)
                {
                    binding.b3.visibility=View.VISIBLE
                }
                else if(ran==4)
                {
                    binding.b4.visibility=View.VISIBLE
                }
                else if(ran==5)
                {
                    binding.b5.visibility=View.VISIBLE
                }
                else if(ran==6)
                {
                    binding.b6.visibility=View.VISIBLE
                }

                else if (ran == 7)
                {
                    binding.b7.visibility=View.VISIBLE
                }
                else if(ran==8)
                {
                    binding.b8.visibility=View.VISIBLE
                }
                else if(ran==9)
                {
                    binding.b9.visibility=View.VISIBLE
                }
                GlobalScope.launch(context = Dispatchers.Main) {

                    delay(500)
                    binding.b1.visibility= View.INVISIBLE
                    binding.b2.visibility=View.INVISIBLE
                    binding.b3.visibility=View.INVISIBLE
                    binding.b4.visibility=View.INVISIBLE
                    binding.b5.visibility=View.INVISIBLE
                    binding.b6.visibility=View.INVISIBLE
                    binding.b7.visibility=View.INVISIBLE
                    binding.b8.visibility=View.INVISIBLE
                    binding.b9.visibility=View.INVISIBLE

                }
            }
        }.start()


    }






    fun b1(view: View)
    {

        if(binding.b1.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"


        }


    }
    fun b2(view: View)
    {

        if(binding.b2.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b3(view: View)
    {
        if(binding.b3.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b4(view: View)
    {
        if(binding.b4.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"


        }

    }
    fun b5(view: View)
    {
        if(binding.b5.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b6(view: View)
    {
        if(binding.b6.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b7(view: View)
    {
        if(binding.b7.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b8(view: View)
    {
        if(binding.b8.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }
    fun b9(view: View)
    {
        if(binding.b9.visibility==View.VISIBLE)
        {
            score++
            binding.textView.text= "skorunuz : ${score}"

        }

    }






}