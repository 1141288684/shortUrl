import com.goncalossilva.murmurhash.MurmurHash3
object HashHelper{
    /**
     * 先MurmurHash转int，再转62进制字符串作为短url
     */
    fun shortUrl(s:String):String{
        return MurmurHash3().hash32x86(s.toByteArray()).hex62toString()
    }

    /**
     * 62进制整数转字符表示
     * 1-9
     * A-Z
     * a-z
     */
    private fun hex62Char(j:Int):Char{
        return if (j<10){
            Char(j+48)
        }else if (j<36){
            Char(j+55)
        }else{
            Char(j+61)
        }
    }

    /**
     * MurmurHash将字符串hash到int
     * 然后int型数据转62进制再转1-9,A-Z,a-z字符串
     */
    private fun UInt.hex62toString():String{
        var t = this.toInt() and Int.MAX_VALUE
        var i = t%62
        val sb = StringBuilder()
        while (i!=0){
            sb.append(hex62Char(i))
            t/=62
            i=t%62
        }
        return sb.toString()
    }

//fun Int.hex62toString():String{
//    var t = this
//    var i = t%62
//    val sb = StringBuilder()
//    while (i!=0){
//        sb.append(hex62Char(i))
//        t/=62
//        i=t%62
//    }
//    return sb.toString()
//}

}
