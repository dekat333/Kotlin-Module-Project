import java.util.*

class OpenNote {
    var openArchiveNote = CreateNote()
    fun openNote(): String?{
        println ("Введите имя для открытия заметки: ")
        while (true) {
            var noteName = Scanner(System.`in`).nextLine()
            if (noteName == null) {
                println ("Введите имя заметки!")
            }
            return openArchiveNote.createNote().get(noteName)
        }

    }
}