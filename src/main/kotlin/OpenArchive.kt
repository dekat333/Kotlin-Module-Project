import java.util.*

class OpenArchive {
    var createdNote = CreateNote()
    fun openArch():String{
        println ("Введите имя для открытия архива: ")
        while (true) {
            var archiveName = Scanner(System.`in`).nextLine()
            if (archiveName == null) {
                println ("Введите имя архива!")
            }
            println ("Архив $archiveName открыт!")
            //var arch = Archive(archiveName)//архив
           // var note = createdNote.createNote()

            //return arch.addNote(note)
            return archiveName
        }
    }

}