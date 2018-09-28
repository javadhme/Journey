package codenevisha.ir.app.journey.data.local.database.user

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "users")
class User {

    @PrimaryKey
    var id: Int = 0

    var name: String? = null
}
