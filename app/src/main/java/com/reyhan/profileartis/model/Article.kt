package com.reyhan.profileartis.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article (
    val imageResourceId: Int,
    val title: String,
    val overview: String,
    val description: String
) : Parcelable;
