import java.util.*

class CreateArchive {
    fun createArch():String{
        println ("Введите имя для создания архива: ")

        while (true) {
            var archiveName = Scanner(System.`in`).nextLine()
            if (archiveName == null) {
                println ("Введите имя архива!")
            }
            println ("Архив $archiveName создан!")


            return archiveName
        }
    }



}