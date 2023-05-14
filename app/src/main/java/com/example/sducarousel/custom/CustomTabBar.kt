package com.example.sducarousel.custom

import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.annotation.RegisterWidget
import br.com.zup.beagle.android.components.TabBarItem
import br.com.zup.beagle.android.context.Bind
import br.com.zup.beagle.android.context.ContextData
import br.com.zup.beagle.android.utils.handleEvent
import br.com.zup.beagle.android.utils.observeBindChanges
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView

@RegisterWidget
data class CustomTabBar(
    val items: List<TabBarItem>,
    val currentTab: Bind<Int>,
    val onTabSelection: List<Action>,
    val contextData: ContextData
) : WidgetView() {
    override fun buildView(rootView: RootView) = CustomTabBarComponent(rootView.getContext()).apply {
        observeBindChanges(rootView, this, currentTab){

        }
        for(tab in items){
            handleEvent(rootView,this,onTabSelection,contextData)
        }
    }
}