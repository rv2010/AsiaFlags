package com.rv198510.asiaflags


object FlagSpots {

    private val images = arrayListOf(
        R.drawable.af_flag,
        R.drawable.am_flag,
        R.drawable.az_flag,
        R.drawable.bh_flag,
        R.drawable.bd_flag,
        R.drawable.bt_flag,
        R.drawable.bn_flag,
        R.drawable.kh_flag,
        R.drawable.cn_flag,
        R.drawable.cy_flag,
        R.drawable.ge_flag,
        R.drawable.in_flag,
        R.drawable.id_flag,
        R.drawable.ir_flag,
        R.drawable.iq_flag,
        R.drawable.il_flag,
        R.drawable.jp_flag,
        R.drawable.jo_flag,
        R.drawable.kz_flag,
        R.drawable.kw_flag,
        R.drawable.kg_flag,
        R.drawable.la_flag,
        R.drawable.lb_flag,
//        R.drawable.mo_flag,
        R.drawable.my_flag,
        R.drawable.mv_flag,
        R.drawable.mn_flag,
        R.drawable.mm_flag,
        R.drawable.np_flag,
        R.drawable.kp_flag,
        R.drawable.om_flag,
        R.drawable.pk_flag,
        R.drawable.ps_flag,
        R.drawable.ph_flag,
        R.drawable.qa_flag,
        R.drawable.ru_flag,
        R.drawable.sa_flag,
        R.drawable.sg_flag,
        R.drawable.kr_flag,

        R.drawable.lk_flag,
        R.drawable.sy_flag,
        R.drawable.tw_flag,
        R.drawable.tj_flag,
        R.drawable.th_flag,
        R.drawable.tl_flag,
        R.drawable.tr_flag,
        R.drawable.tm_flag,
        R.drawable.uae_flag,
        R.drawable.uz_flag,
        R.drawable.vn_flag,
        R.drawable.ye_flag,

        )
    private val countryNames = arrayListOf(
        "Afghanistan",
        "Armenia",
        "Azerbaijan",
        "Bahrain",
        "Bangladesh",
        "Bhutan",
        "Brunei",
        "Cambodia",
        "China",
        "Cyprus",
        "Georgia",
        "India",
        "Indonesia",
        "Iran",
        "Iraq",
        "Israel",
        "Japan",
        "Jordan",
        "Kazakhstan",
        "Kuwait",
        "Kyrgyzstan",
        "Laos",
        "Lebanon",
        "Malaysia",
        "Maldives",
        "Mongolia",
        "Myanmar",
        "Nepal",
        "North Korea",
        "Oman",
        "Pakistan",
        "Palestine",
        "Philippines",
        "Qatar",
        "Russia",
        "Saudi Arabia",
        "Singapore",
        "South Korea",
        "Sri Lanka",
        "Syria",
        "Taiwan",
        "Tajikistan",
        "Thailand",
        "Timor-Leste",
        "Turkey",
        "Turkmenistan",
        "United Arab Emirates",
        "Uzbekistan",
        "Vietnam",
        "Yemen",

    )

    var list: ArrayList<CountryData>? = null
        get() {

            if (field != null)      // backing 'field' refers to 'list' property object
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]
                val countryName = countryNames[i]
                val destination = CountryData(imageId, countryName)
                field!!.add(destination)
            }

            return field
        }
}