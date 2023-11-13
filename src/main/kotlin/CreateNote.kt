import java.util.*

class CreateNote {
    fun createNote():MutableMap<String, String>{

        println ("Введите имя для создания заметки: ")
        while (true) {
            var noteName = Scanner(System.`in`).nextLine()
            if (noteName == null) {
                println ("Введите имя заметки!")
            }
            println ("Введите содержание заметки:")
            var noteContent = Scanner(System.`in`).nextLine()
            if (noteContent == null) {
                println ("Введите содержание заметки!")
            }
            println ("Заметка $noteName создана!")
            var note = Note(noteName, noteContent)

            //println (note)
            return this.addNote(note)
        }

    }
    fun addNote(note: Note):MutableMap<String, String>{
        val archive: MutableMap<String, String> = mutableMapOf()//сам архив
        archive.put(note.name, note.content)//добавление заметки в архив
        println (archive)
        return archive
    }
   /* fun addNoteInArch(): MutableMap<String, String>{
        var notes = this.createNote()
        //val createA = CreateArchive()
        //var arch = Archive(createA.createArch())//архив
        return this.addNote(note)
    }*/

}