package com.tugas.shendy.catetfrend.utils

import com.tugas.shendy.catetfrend.model.ModelNote

/**
 * Created by Azhar Rivaldi on 6/11/2020.
 */

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}