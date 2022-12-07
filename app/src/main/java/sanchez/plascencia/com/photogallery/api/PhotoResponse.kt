package sanchez.plascencia.com.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import sanchez.plascencia.com.photogallery.api.GalleryItem

@JsonClass(generateAdapter = true)
data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)
