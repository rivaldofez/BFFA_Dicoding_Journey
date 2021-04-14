package com.rivaldofez.cubihub.listener

import android.view.View
import com.rivaldofez.cubihub.model.User

interface OnItemClickListener {
    fun onItemClick(item: View, user:User)

    fun onShowToast(item: View, position: Int)
}