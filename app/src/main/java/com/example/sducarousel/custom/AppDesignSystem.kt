package com.example.sducarousel.custom

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.example.sducarousel.R

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun image(id: String) = when (id) {
        "bag" -> R.drawable.bag_icon
        "cao1" -> R.drawable.cao1
        "cao2" -> R.drawable.cao2
        "cao3" -> R.drawable.cao3
        "back" -> R.drawable.back_icon
        else -> android.R.drawable.ic_menu_help
    }

    override fun tabViewStyle(id: String) = when (id) {
        "tabBarStyle" -> R.style.DefaultTabBarAppearance_CustomTabBar
        else -> R.style.DefaultToolbar
    }

    override fun textStyle(id: String) = when (id) {
        "normal" -> R.style.DefaultTextAppearance_CustomText
        else -> R.style.DefaultTextAppearance
    }

    override fun toolbarStyle(id: String) = when (id) {
        "customNavigation" -> R.style.DefaultToolbar_CustomToolbar
        else -> R.style.DefaultToolbar
    }
}