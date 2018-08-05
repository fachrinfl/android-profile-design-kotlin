package example.com.my_profile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.graphics.Bitmap



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.img_profile)
        val customImage = RoundedBitmapDrawableFactory.create(resources, bitmap)
        // rounded
        customImage.cornerRadius = 180f
        // circular
//        customImage.isCircular = true
        ivProfile.setImageDrawable(customImage)

    }
}
