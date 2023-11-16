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
                Menu().menuNotes(noteList)
                var numberString:String = Menu().inputCommand()
                if (numberString.contains("[0-9]".toRegex())) {
                    var number = numberString.toInt()
                    if ((noteList.isEmpty() && number == 1)) {
                        println("Ошибка, введите верный номер команды: ")
                    } else {
                        when (number) {
                            0 -> createNotes(noteList)
                            in 1..noteList.size -> {
                                println("${noteList[number - 1].name} ${noteList[number - 1].content}")
                            }
                            noteList.size + 1 -> return
                            else -> println("Ошибка, введите верный номер команды: ")
                        }
                    }
                }else{
                    println("Вы ввели не цифру! Введите верный номер команды: ")
                }
            }
    }
}













