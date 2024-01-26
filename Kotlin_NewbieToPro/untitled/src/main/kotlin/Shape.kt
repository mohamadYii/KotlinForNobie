abstract class Shape( //(open) key work make class have the option to inherit
    // abstract keyword make class to cant call it on main function and cant make object off it and just we useit for
    // inherit and other class
    protected var name: String
) {
    init {
        println("Iam the Super Class!")
    }
    fun changeName(newName:String){
        name = newName
    }
    abstract fun area():Double
    abstract fun perimeter():Double
}