//Exercice instruction : Define a sealed class instructions that contains Car, Boat and Motorbike

sealed abstract class Vehicule[A]{}
case class Car[T] extends Vehicule[T]{}
case class Motorbike[T] extends Vehicule[T]{}
case class Boat[T] extends Vehicule[T]{}

//For Car, Motorbike and Boat, we don't use object because an object is a singleton and
//aimed to only exists once.

//We will prefer to use  case class t be able to transport data in theses class as brand,
//fuel type, first year of circulation...


