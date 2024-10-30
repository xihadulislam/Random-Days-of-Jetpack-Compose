package com.ziad.random_days_of_jetpack_compose.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.withContext

class PdfToBitmapConverter(private val context: Context) {

    private var renderer: PdfRenderer? = null

    suspend fun pdfToBitmaps(uri: Uri): List<Bitmap> = withContext(Dispatchers.IO) {
        renderer?.close()
        context.contentResolver.openFileDescriptor(uri, "r")?.use { descriptor ->
            PdfRenderer(descriptor).use { pdfRenderer ->
                renderer = pdfRenderer
                (0 until pdfRenderer.pageCount).map { index ->
                    async {
                        pdfRenderer.openPage(index).use { page ->
                            val bitmap = Bitmap.createBitmap(page.width, page.height, Bitmap.Config.ARGB_8888).apply {
                            }

                            page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                            bitmap
                        }
                    }
                }.awaitAll()
            }
        } ?: emptyList()
    }

    suspend fun pdfToBitmapsT(uri: Uri): List<Bitmap> = withContext(Dispatchers.IO) {
        renderer?.close()
        context.contentResolver.openFileDescriptor(uri, "r")
            ?.use { descriptor ->
                with(PdfRenderer(descriptor)) {
                    renderer = this
                    (0 until pageCount).map { index ->
                        async {
                            openPage(index).use { page ->
                                val bitmap = Bitmap.createBitmap(page.width, page.height, Bitmap.Config.ARGB_8888)
                                val canvas = Canvas(bitmap).apply {
                                    drawColor(Color.WHITE)
                                    drawBitmap(bitmap, 0f, 0f, null)
                                }
                                page.render(
                                    bitmap,
                                    null,
                                    null,
                                    PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY
                                )
                                bitmap
                            }
                        }
                    }.awaitAll()

                }
            } ?: emptyList()
    }


}