
class Menu {
fun menuArchive (){
                val menuArchive: MutableMap<Int, String> = mutableMapOf(
                    0 to "Создать архив",
                    1 to "Выбрать архив",
                    2 to "Выход из программы"
                )
                println(menuArchive)
        }
    fun menuNotes (){
            val menuNotes: MutableMap<Int, String> = mutableMapOf(
                0 to "Создать заметку",
                1 to "Выбрать заметку",
                2 to "Назад"
            )
            println(menuNotes)
        }

}













   /* val createArch = CreateArchive()
    val openArch = OpenArchive()
    val createNotes = CreateNote()
    val openNotes = OpenNote()
    //val notes = Note
    fun printmenuArchive() {
        val menuArchive: MutableMap<Int, String> = mutableMapOf(
            0 to "Создать архив",
            1 to "Выбрать архив",
            2 to "Выход из программы",
            3 to "Создать заметку",
            4 to "Выбрать заметку",
            5 to "Добавить заметку в архив"
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
               // "5" -> createNotes.addNote()
            }
        }
    }*/
