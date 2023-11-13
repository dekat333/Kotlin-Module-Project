import java.util.*

class Menu {
    val createArch = CreateArchive()
    val openArch = OpenArchive()
    val createNotes = CreateNote()
    val openNotes = OpenNote()
    fun printmenuArchive() {
        val menuArchive: MutableMap<Int, String> = mutableMapOf(
            0 to "Создать архив",
            1 to "Выбрать архив",
            2 to "Выход из программы",
            3 to "Создать заметку",
            4 to "Выбрать заметку"
        )
        println(menuArchive)
    }

    fun checkMenu(){
        while (true) {
            this.printmenuArchive()
            var checkMenu = Scanner(System.`in`).nextLine()
            when (checkMenu) {
                "0" -> createArch.createArch()
                "1" -> openArch.openArch()
                "2" -> break
                "3" -> createNotes.createNote()
                "4" -> openNotes.openNote()
                "5" -> createArch.createArch()
            }
        }
    }
}