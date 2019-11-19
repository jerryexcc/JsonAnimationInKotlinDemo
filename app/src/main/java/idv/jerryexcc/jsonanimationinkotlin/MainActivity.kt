package idv.jerryexcc.jsonanimationinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_main.*
//minSdkVersion 需要 16以上
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jsonAni.setAnimation("message.json")
        jsonAni.playAnimation()
        jsonAni.repeatCount = LottieDrawable.INFINITE//播放次數 import LottieDrawable 可設定無限播放
//        jsonAni.pauseAnimation() //暫停動畫
//        jsonAni.cancelAnimation() //取消動畫
//        jsonAni.getDuration() //取得動畫時間長
    }
}

//Json動畫可參考此網站 https://lottiefiles.com