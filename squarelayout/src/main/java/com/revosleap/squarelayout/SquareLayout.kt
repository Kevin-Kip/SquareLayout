package com.revosleap.squarelayout

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.ViewGroup

class SquareLayout : ConstraintLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = measuredWidth
        val height = measuredHeight

        when(width < height) {
            true -> setMeasuredDimension(width, width)
            else -> setMeasuredDimension(height, height)
        }
        init()
    }

    private fun init(){
        viewTreeObserver.addOnPreDrawListener {

            if (width != height){
                val smallerSize: Int? = Math.min(width, height)
                val layoutParams: ViewGroup.LayoutParams? = layoutParams
                layoutParams?.height = smallerSize!!
                layoutParams?.width = smallerSize

                return@addOnPreDrawListener false
            }

            return@addOnPreDrawListener true
        }
    }
}