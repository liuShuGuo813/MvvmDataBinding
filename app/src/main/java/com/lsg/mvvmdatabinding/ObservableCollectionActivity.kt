package com.lsg.mvvmdatabinding

import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import androidx.databinding.ObservableList
import androidx.databinding.ObservableMap
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.databinding.ActivityObservableCollectionBinding
import java.util.*

class ObservableCollectionActivity : BaseActivity<ActivityObservableCollectionBinding>(),
    View.OnClickListener {

    private val list: ObservableList<String> = ObservableArrayList()
    private val map: ObservableMap<String,String> = ObservableArrayMap()

    override fun initView() {
        mBinding.onClick = this
        list.add("list的默认值")
        map["name"] = "map的默认值"
        mBinding.list = list
        mBinding.map = map
        mBinding.index = 0
        mBinding.key = "name"
    }


    override fun getContentViewId(): Int {
        return R.layout.activity_observable_collection
    }

    override fun onClick(view: View) {
        val randowInt = Random().nextInt(100)
//        when(view.id){
//            R.id.btn_up_list -> mBinding.list?.add(0,"修改list后的值")
//            R.id.btn_up_map ->  mBinding.map?.put("Name","修改后map的值")
//        }
        when (view.id) {
            R.id.btn_up_list ->  //改变list的第一项
                list.add(0, "list的值$randowInt")
            R.id.btn_up_map -> map["name"] = "map的值$randowInt"
        }
    }
}
