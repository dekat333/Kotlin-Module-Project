import java.util.*

class Menu {
fun menuArchive (archiveList: MutableList<Archive>){
    if (archiveList.isEmpty()){println ("Для создания архива нажмите 0")}
    else{
        println ("0 Создать архив")
        var i: Int = 1
        for (archiveNumber:Int  in 0..(archiveList.size-1)){
            println("$i Открыть ${archiveList[archiveNumber].name}")
            i++
        }
        println ("$i Выход из программы")
    }
}
    fun menuNotes (noteList: MutableList<Note>) {
        if (noteList.isEmpty()) {
            println("Для создания заметки нажмите 0")
        } else {
            println("0 Создать заметку")
            var i: Int = 1
            for (noteNumber: Int in 0..(noteList.size - 1)) {
                println("$i Открыть ${noteList[noteNumber].name}")
                i++
            }
            println("$i Возврат в меню архивов")
        }
    }
    fun inputCommand(): String{
        println("Введите номер команды: ")
        var number = Scanner(System.`in`).nextLine()

        return number
    }
}












