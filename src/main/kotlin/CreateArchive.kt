import java.util.*

class CreateArchive {
    val archiveList = mutableListOf<Archive>()
    var archiveMap = mutableListOf<Note>()
    var note = CreateNote()



    fun archiveMenu() {
         while (true) {
             Menu().menuArchive()
             println("Введите номер команды: ")
             var number = Scanner(System.`in`).nextLine()
             when (number) {
                 "0" -> createArch()
                 "1" -> {
                     try{
                     println(archiveList)
                     println("Введите номер архива для открытия (от 0): ")
                     var archiveNumber = Scanner(System.`in`).nextLine().toInt()
                     if (archiveNumber  in 0..archiveList.size) {
                     note.noteMenu(archiveList[archiveNumber].content)
                     }
                     }catch (e: Exception) {
                         println("Ошибка, введите верный номер архива!")
                     }
                 }
                 "2" -> {
                     println("Работа программы Заметки завершена!")
                     break
                 }
                 else ->  println ("Ошибка, введите верный номер команды: ")
             }
         }
    }

    fun createArch() {
        try {
        while (true) {
            println("Введите имя для создания архива: ")
            var archiveName = Scanner(System.`in`).nextLine()
            if (archiveName.isNotEmpty()) {
                archiveList.add(Archive(archiveName, archiveMap))
                println("Архив $archiveName создан!")
                break
            } else {
                println("Ошибка, введите имя архива!")
            }

        }
        } catch (e: Exception) {
            println ("Ошибка, введите верное имя архива: ")
        }

    }
}