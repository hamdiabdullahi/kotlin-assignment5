
fun main() {
    var hamdi = Human("Chaaa", 27, 69)
    hamdi.eat(5)
    hamdi.speak("she is short")
    hamdi.birthday()

    var haina = User("Haina", "Abdi", "haina2@gmail.com", "0720987661", "h3456")
    println(haina.firstName)
    println(haina.email)
}
class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodWeight:Int){
        println("I am eating 5kgs of food")
    weight=weight+foodWeight
    println(weight)}



    fun speak(speech:String){
        println("she is short")
    }
    fun birthday(){
        age=age+1
        println(age)
    }





}
data class User(var firstName:String,var lastName:String,var email:String,var phoneN:String,var pass:String) {


}


