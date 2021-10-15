//Exercice instruction : Define a sealed class instructions that contains Car, Boat and Motorbike


//My version : 14/10/21
sealed abstract class Vehicule[A]{}
case class Car(brand: String, fiscalPower: Int, doorsNum: Int, firstYear: Int, fuel: String) extends Vehicule{}
case class Motorbike(brand: String, fiscalPower: Int, firstYear: Int, fuel: String) extends Vehicule{}
case class Boat(brand: String, fiscalPower: Int, firstYear: Int, fuel: String, length: Int) extends Vehicule{}

//For Car, Motorbike and Boat, we don't use object because an object is a singleton and
//aimed to only exists once.

//We will prefer to use  case class t be able to transport data in theses class as brand,
//fuel type, first year of circulation...


//Correction : Validé par le prof 

//Mettre val model dans sealed permet de forcer le fait que chaque objet qui étendra la sealed class devra forcément avoir un modèle
sealed abstract class Vehicule{
    val model: String
}
case class Car(registration: String, model: String) extends Vehicule{}
case class Motorcycle(registration: String, model: String) extends Vehicule{}
case class Boat(registration: String, model: String) extends Vehicule{}



//Nouvel exercice : Créer sealed de la marque peugeot avec les produits qu'ils commercialisent (Voiture, scooter, salière, valise...)

sealed abstract class Peugeot{
    val price: Float
    val releaseYear: Int
}
case class Car(model: String, registration: String, price: Float, releaseYear: Int) extends Peugeot{}
case class Scooter(model: String, registration: String, price: Float, releaseYear: Int) extends Peugeot{}
case class Truck(model: String, registration: String, price: Float, releaseYear: Int) extends Peugeot{}
case class SaltShaker(material: String, dimensions: (Int, Int), price: Float, releaseYear: Int) extends Peugeot{}
case class Suitcase(material: String,capacity: Int, price: Float, releaseYear: Int) extends Peugeot{}

