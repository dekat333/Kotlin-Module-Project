import java.util.*

class CreateNote{
    fun createNotes(noteList: MutableList<Note>){
            while (true) {
                println("Введите имя для создания заметки: ")
                var noteName = Scanner(System.`in`).nextLine()

                if (noteName.isNotEmpty()) {
                    println("Введите содержимое заметки: ")
                    var noteContent = Scanner(System.`in`).nextLine()
                    if (noteContent.isNotEmpty()) {
                        noteList.add(Note(noteName, noteContent))
                        println("Заметка $noteName создана!")
                    break
                    }else {
                        println("Ошибка, введите содержимое заметки!")

                    }
                } else {
                    println("Ошибка, введите имя заметки!")
                }
            }
    }
    fun noteMenu(noteList: MutableList<Note>) {

            while (true) {
                Menu().menuNotes()
                println("Введите номер команды: ")

                var number = Scanner(System.`in`).nextLine()
                when (number) {
                    "0" -> createNotes(noteList)
                    "1" -> {
                        try{
                        println(noteList)
                        println("Введите номер заметки для открытия (от 0): ")
                        var noteNumber = Scanner(System.`in`).nextLine().toInt()
                        if (noteNumber in 0..noteList.size) {
                            println("${noteList[noteNumber].name} ${noteList[noteNumber].content}")
                        }
                        }catch (e: Exception) {
                            println("Ошибка, введите верный номер заметки!")
                        }
                    }
                    "2" -> return
                    else ->  println ("Ошибка, введите верный номер команды: ")
                }
            }
    }
}














/*fun createNote():Note{

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
            //var note = Note(noteName, noteContent)

            //println (note)
            return Note(noteName, noteContent)
        }


    }
    fun returnNote(noteName:String , noteContent:String): Note{
        var note = Note(noteName, noteContent)
        return note
    }
    fun addNote(note: Note):MutableMap<String, String>{
        val archive: MutableMap<String, String> = mutableMapOf()//сам архив
        archive.put(note.name, note.content)//добавление заметки в архив
        println (archive)
        return archive
    }*/
    //fun addAddNote


   /* fun addNoteInArch(): MutableMap<String, String>{
        var notes = this.createNote()
        //val createA = CreateArchive()
        //var arch = Archive(createA.createArch())//архив
        return this.addNote(note)
    }*/
