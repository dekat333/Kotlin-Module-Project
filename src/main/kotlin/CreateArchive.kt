import java.util.*

class CreateArchive {
    val archiveList = mutableListOf<Archive>()
    var archiveMap = mutableListOf<Note>()
    var note = CreateNote()



    fun archiveMenu() {
         while (true) {
                 Menu().menuArchive(archiveList)
             var numberString:String = Menu().inputCommand()
             if (numberString.contains("[0-9]".toRegex())) {
                 var number = numberString.toInt()
                 if (archiveList.isEmpty() && number == 1) {
                     println("Ошибка, введите верный номер команды: ")
                 } else {
                     when (number) {
                         0 -> createArch()
                         in 1..archiveList.size -> {
                             note.noteMenu(archiveList[number - 1].content)
                         }
                         archiveList.size + 1 -> {
                             println("Работа программы Заметки завершена!")
                             break
                         }
                         else -> println("Ошибка, введите верный номер команды: ")
                     }
                 }
             }else{
                 println("Вы ввели не цифру! Введите верный номер команды: ")
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