package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
// 코틀린에서는 checked/UnChecked 예외를 구분하지 않고 모두 UnChecked 예외
class FilePrinter {
    fun readFile(){
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFileV2(path: String){
        // 코틀린에서는 try - with - resource 가 사라지고 .use 사용
        BufferedReader(FileReader(path)).use{ reader ->
            println(reader.readLine())
        }
    }
}