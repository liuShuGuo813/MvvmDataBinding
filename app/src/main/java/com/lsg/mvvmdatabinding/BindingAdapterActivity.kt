package com.lsg.mvvmdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.databinding.ActivityBindingAdapterBinding

class BindingAdapterActivity : BaseActivity<ActivityBindingAdapterBinding>() {

    val peopleUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569760922081&di=77ffc0adbcfa628168b14665604e6efe&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fb215dd271e3367eeddc126d52cd1e5a5afe6e98112450-VIqcMR_fw658"
    val blogUrl = "https://img-blog.csdn.net/20180622105755608?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM0NzgzNDM3/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70"
    override fun initView() {
        mBinding.testStr = "博客图片"
        mBinding.url = blogUrl
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_binding_adapter
    }
}
