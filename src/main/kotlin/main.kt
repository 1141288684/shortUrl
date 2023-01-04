import HashHelper.shortUrl

fun main(){
    var t = "1234567890123456789012345678906666661234567890123456789012345678901234567890123456789012345678909876543210asdzxdasfx486445cfvsdagf654321asdasdzgytufghnvv23fdzfhhhhhcgjkhylio;l./[pio89#$$#4643gtrhhgbvc456445789789494645613264132123juugjhjktr5123456789012345"
    t += t
    t += t
    println("字节长度:${t.length}")
    println("长文:$t")
    println("短文:${shortUrl(t)}")

}
