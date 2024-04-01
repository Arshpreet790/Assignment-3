package com.example.andromonth.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.andromonth.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.make_a_plan, R.string.title0, R.string.desc0),
        Day(R.drawable.glass_of_water, R.string.title1, R.string.desc1),
        Day(R.drawable.try_this_new_recipe, R.string.title2, R.string.desc2),
        Day(R.drawable.booze, R.string.title3, R.string.desc3),
        Day(R.drawable.walk, R.string.title4, R.string.desc4),
        Day(R.drawable.veggies, R.string.title5, R.string.desc5),
        Day(R.drawable.goals, R.string.title6, R.string.desc6),
        Day(R.drawable.make_a_plan, R.string.title7, R.string.desc7),
        Day(R.drawable.try_this_new_recipe, R.string.title8, R.string.desc8),
        Day(R.drawable.sleep, R.string.title9, R.string.desc9),
        Day(R.drawable.pbh_snacks_13, R.string.title10, R.string.desc10),
        Day(R.drawable.go_meatless, R.string.title11, R.string.desc11),
        Day(R.drawable.treat_yourself, R.string.title12, R.string.desc12),
        Day(R.drawable.try_this_new_recipe, R.string.title13, R.string.desc13),
        Day(R.drawable.make_a_plan, R.string.title14, R.string.desc14),
        Day(R.drawable.veggies, R.string.title15, R.string.desc15),
        Day(R.drawable.glass_of_water, R.string.title16, R.string.desc16),
        Day(R.drawable.walk, R.string.title17, R.string.desc17),
        Day(R.drawable.try_this_new_recipe, R.string.title18, R.string.desc18),
        Day(R.drawable.go_meatless, R.string.title19, R.string.desc19),
        Day(R.drawable.share, R.string.title20, R.string.desc20),
        Day(R.drawable.make_a_plan, R.string.title21, R.string.desc21),
        Day(R.drawable.booze, R.string.title22, R.string.desc22),
        Day(R.drawable.try_this_new_recipe, R.string.title23, R.string.desc23),
        Day(R.drawable.sleep, R.string.title24, R.string.desc24),
        Day(R.drawable.whole_grains, R.string.title25, R.string.desc25),
        Day(R.drawable.treat_yourself, R.string.title26, R.string.desc26),
        Day(R.drawable.pbh_snacks_13, R.string.title27, R.string.desc27),
        Day(R.drawable.try_this_new_recipe, R.string.title28, R.string.desc28),
        Day(R.drawable.veggies, R.string.title29, R.string.desc29)
    )
}