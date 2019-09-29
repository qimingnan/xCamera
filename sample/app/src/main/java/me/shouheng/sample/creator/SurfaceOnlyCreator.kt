package me.shouheng.sample.creator

import android.content.Context
import android.view.ViewGroup
import me.shouheng.shining.config.creator.CameraPreviewCreator
import me.shouheng.shining.preview.CameraPreview
import me.shouheng.shining.preview.impl.SurfacePreview

/**
 * @author WngShhng (shouheng2015@gmail.com)
 * @version 2019/4/20 12:00
 */
class SurfaceOnlyCreator : CameraPreviewCreator {

    override fun create(context: Context?, parent: ViewGroup?): CameraPreview = SurfacePreview(context, parent)

}