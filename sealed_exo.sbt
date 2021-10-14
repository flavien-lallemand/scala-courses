//Exercice instruction : Define a sealed class instructions that contains Car, Boat and Motorbike

sealed abstract class Vehicule[A]{}
case class Car(brand: String, fiscalPower: Int, doorsNum: Int, firstYear: Int, fuel: String) extends Vehicule[T]{}
case class Motorbike(brand: String, fiscalPower: Int, firstYear: Int, fuel: String) extends Vehicule[T]{}
case class Boat(brand: String, fiscalPower: Int, firstYear: Int, fuel: String, length: Int) extends Vehicule[T]{}

//For Car, Motorbike and Boat, we don't use object because an object is a singleton and
//aimed to only exists once.

//We will prefer to use  case class t be able to transport data in theses class as brand,
//fuel type, first year of circulation...


