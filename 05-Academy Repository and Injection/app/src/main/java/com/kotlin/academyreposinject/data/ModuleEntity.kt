package com.kotlin.academyreposinject.data

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
data class ModuleEntity(

    var moduleId: String,

    var courseId: String,

    var title: String,

    var position: Int,

    var read: Boolean = false

) {
    var contentEntity: ContentEntity? = null
}
